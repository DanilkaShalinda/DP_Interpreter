package com.example.designptterns_interpreter.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerDTO {
    private String expression;
    private String operation;
    private double answer;
    private String status;
}
