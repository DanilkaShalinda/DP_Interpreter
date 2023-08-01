package com.example.designptterns_interpreter.util;

import com.example.designptterns_interpreter.expression.impl.AdditionExpression;
import com.example.designptterns_interpreter.expression.Expression;
import com.example.designptterns_interpreter.expression.impl.DivisionExpression;
import com.example.designptterns_interpreter.expression.impl.MultiplicationExpression;
import com.example.designptterns_interpreter.expression.impl.SubtractionExpression;
import com.example.designptterns_interpreter.response.AnswerDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InterpreterClient {
    private final InterpreterEngine interpreterEngine;

    public AnswerDTO interpret(String inputData) {

        Expression expression = null;

        if (inputData.contains("add")) {
            expression = new AdditionExpression(inputData);
        } else if (inputData.toLowerCase().contains("subtract")) {
            expression = new SubtractionExpression(inputData);
        } else if (inputData.toLowerCase().contains("multiply")) {
            expression = new MultiplicationExpression(inputData);
        } else if (inputData.toLowerCase().contains("divide")) {
            expression = new DivisionExpression(inputData);
        } else {
            return AnswerDTO.builder()
                    .status(inputData + " is not valid expression!!")
                    .build();
        }

        return expression.interpret(interpreterEngine);
    }
}
