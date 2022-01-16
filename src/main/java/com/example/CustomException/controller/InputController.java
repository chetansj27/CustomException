package com.example.CustomException.controller;

import com.example.CustomException.dto.InputDto;
import com.example.CustomException.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InputController {

    @Autowired
    InputService inputService;

    @PostMapping({"/input"})
    public ResponseEntity<Object> takeInput(@RequestBody InputDto inputDto) {
        return inputService.handleInput(inputDto);
    }
}
