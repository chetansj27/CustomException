package com.example.CustomException.service;

import com.example.CustomException.dto.InputDto;
import com.example.CustomException.exception.InputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InputService {

    public ResponseEntity<Object> handleInput(InputDto inputDto) {
        if (inputDto.getName() == null)
            throw new InputException("Name can't be null");
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
