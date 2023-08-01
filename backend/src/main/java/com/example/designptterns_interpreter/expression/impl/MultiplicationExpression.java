package com.example.designptterns_interpreter.expression.impl;

import com.example.designptterns_interpreter.expression.Expression;
import com.example.designptterns_interpreter.response.AnswerDTO;
import com.example.designptterns_interpreter.util.InterpreterEngine;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MultiplicationExpression implements Expression {
    private final String expression;

    public AnswerDTO interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.multiplication(expression);
    }
}
