package com.example.designptterns_interpreter.util;

import com.example.designptterns_interpreter.response.AnswerDTO;

public class InterpreterEngine {
    public AnswerDTO addition(String inputData) {
        String[] tokens = interpret(inputData);
        int number1 = Integer.parseInt(tokens[0]);
        int number2 = Integer.parseInt(tokens[1]);
        return AnswerDTO.builder()
                .answer(number1 + number2)
                .expression(number1 + " + " + number2)
                .operation("Addition")
                .build();
    }

    public AnswerDTO subtraction(String inputData) {
        String[] tokens = interpret(inputData);
        int number1 = Integer.parseInt(tokens[0]);
        int number2 = Integer.parseInt(tokens[1]);
        return AnswerDTO.builder()
                .answer(number1 - number2)
                .expression(number1 + " - " + number2)
                .operation("Subtraction")
                .build();
    }

    public AnswerDTO multiplication(String inputData) {
        String[] tokens = interpret(inputData);
        int number1 = Integer.parseInt(tokens[0]);
        int number2 = Integer.parseInt(tokens[1]);
        return AnswerDTO.builder()
                .answer(number1 * number2)
                .expression(number1 + " X " + number2)
                .operation("Multiplication")
                .build();
    }

    public AnswerDTO division(String inputData) {
        String[] tokens = interpret(inputData);
        double number1 = Double.parseDouble(tokens[0]);
        double number2 = Double.parseDouble(tokens[1]);
        return AnswerDTO.builder()
                .answer(number1 / number2)
                .expression(number1 + " % " + number2)
                .operation("Division")
                .build();
    }

    private String[] interpret(String inputData) {
        String tempInputData = inputData.replaceAll("[^0-9]", " ");
        tempInputData = tempInputData.replaceAll("( )+", " ").trim();
        String[] inputDatatokens = tempInputData.split(" ");
        return inputDatatokens;
    }
}
