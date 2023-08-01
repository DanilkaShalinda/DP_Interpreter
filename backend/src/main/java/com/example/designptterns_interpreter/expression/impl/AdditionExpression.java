package com.example.designptterns_interpreter.expression.impl;

import com.example.designptterns_interpreter.response.AnswerDTO;
import com.example.designptterns_interpreter.util.InterpreterEngine;
import com.example.designptterns_interpreter.expression.Expression;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AdditionExpression implements Expression {
    private final String expression;

    public AnswerDTO interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.addition(expression);
    }
}
