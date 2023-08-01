package com.example.designptterns_interpreter.expression.impl;

import com.example.designptterns_interpreter.response.AnswerDTO;
import com.example.designptterns_interpreter.util.InterpreterEngine;
import com.example.designptterns_interpreter.expression.Expression;

public class SubtractionExpression implements Expression {
    private String expression;

    public SubtractionExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public AnswerDTO interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.subtraction(expression);
    }
}
