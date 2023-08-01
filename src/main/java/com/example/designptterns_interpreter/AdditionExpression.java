package com.example.designptterns_interpreter;

public class AdditionExpression {
    private String expression;

    public AdditionExpression(String expression) {
        this.expression = expression;
    }

    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.addition(expression);
    }
}
