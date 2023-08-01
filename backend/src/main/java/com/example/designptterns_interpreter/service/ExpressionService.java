package com.example.designptterns_interpreter.service;

import com.example.designptterns_interpreter.request.Answer;
import com.example.designptterns_interpreter.response.AnswerDTO;
import com.example.designptterns_interpreter.util.InterpreterClient;
import com.example.designptterns_interpreter.util.InterpreterEngine;
import org.springframework.stereotype.Service;

@Service
public class ExpressionService {
    public AnswerDTO getResponseAnswer(Answer answerReq) {
        InterpreterEngine interpreterEngine = new InterpreterEngine();
        InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);
        return interpreterClient.interpret(answerReq.getText());
    }
}
