package com.backend.todolist.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backend.todolist.errorhandler.CustomException;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
@ApiResponses(value = {
    @ApiResponse(code=400, message = "Bad Request", response = CustomException.class),
    @ApiResponse(code=401, message = "Unauthorized", response = CustomException.class),
    @ApiResponse(code=403, message = "Forbidden", response = CustomException.class),
    @ApiResponse(code=404, message = "Not Found", response = CustomException.class)
})
public class FrolovController {
    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/api/student/hello", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {return new ResponseEntity<>("Hello World", HttpStatus.OK);}
}
