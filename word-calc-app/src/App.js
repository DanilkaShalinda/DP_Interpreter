import {useState} from "react";
import axios from "axios";

function App() {
	const [text, setText] = useState('')
	const [data, setData] = useState({})
	const handleClick = () => {
		if (text) {
			axios.post('http://localhost:8080/api/', {text})
				.then(function (response) {
					console.log(response)
					if (response.status === 200) {
						setData(response.data)
					}
				})
				.catch(function (error) {
					console.log(error);
				});
		} else {
			setData({})
		}
	}

	return (
		<>
			<div className="container px-5 py-2 pb-3 mt-5" style={{width: "500px", boxShadow: "rgba(99, 99, 99, 0.2) 0 2px 8px 0"}}>
				<div className="row text-center mt-4">
					<h4>Sentence to Calculator</h4>
				</div>
				<div className="row mt-2">
					<input type="text" value={text} onChange={(e)=>setText(e.target.value)}/>
				</div>
				<div className="row mt-3 text-center">
					<p>
						<button className={'btn btn-success'} onClick={handleClick} style={{width: "150px", border: "1px solid"}}>Submit</button>
					</p>
				</div>
				<div className="row pt-2" style={{backgroundColor: "#FBEEAC"}}>
					{Object.keys(data).length > 0?<Answer data={data}/>:<p className={'fw-bold text-center'}>Answer will be displayed here</p>}
				</div>
			</div>
		</>
	);
}

export default App;

const Answer = ({data}) => {
	if (data.status === null) {
		return (
			<>
				<p><span className={'fw-bold'}>Expression:</span> {data.expression}</p>
				<p><span className={'fw-bold'}>Operation:</span> {data.operation}</p>
				<p><span className={'fw-bold'}>Answer:</span> {data.answer}</p>
			</>
		)
	} else {
		return (<p className={'fw-bold text-center'}>{data.status}</p>)
	}
}