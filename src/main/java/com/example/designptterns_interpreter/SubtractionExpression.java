package com.example.designptterns_interpreter;

public class SubtractionExpression implements Expression{
    private String expression;

    public SubtractionExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.subtraction(expression);
    }
}
