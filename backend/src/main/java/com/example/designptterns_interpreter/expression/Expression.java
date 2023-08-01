package com.example.designptterns_interpreter.expression;

import com.example.designptterns_interpreter.response.AnswerDTO;
import com.example.designptterns_interpreter.util.InterpreterEngine;

public interface Expression {
    public abstract AnswerDTO interpret(InterpreterEngine interpreterEngine);
}
