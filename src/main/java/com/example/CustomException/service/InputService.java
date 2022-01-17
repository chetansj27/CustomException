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
            throw new InputException("name can't be empty");
        if (inputDto.getPassword() == null)
            throw new InputException("password can't be empty");
        if (inputDto.getPassword().length() < 8)
            throw new InputException("password length can't be less than 8");
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
