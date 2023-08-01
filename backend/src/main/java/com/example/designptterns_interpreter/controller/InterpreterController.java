package com.example.designptterns_interpreter.controller;

import com.example.designptterns_interpreter.request.Answer;
import com.example.designptterns_interpreter.response.AnswerDTO;
import com.example.designptterns_interpreter.service.ExpressionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/")
@RequiredArgsConstructor
@CrossOrigin
public class InterpreterController {
    private final ExpressionService service;

    @PostMapping(value = "/")
    public AnswerDTO getAnswer(@RequestBody Answer answerReq) {
        return service.getResponseAnswer(answerReq);
    }
}
