package com.why.exception;

import com.why.controller.ProductController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(assignableTypes = {ProductController.class})
public class GlobalExceptionHandler {

    ErrorResponse illegalArgumentResponse = new ErrorResponse(new IllegalArgumentException("参数错误!"));
    ErrorResponse resourceNotFoundResponse = new ErrorResponse(new ResourceNotFoundException("Sorry, the resourse not found!"));

    @ExceptionHandler(value = ResourceNotFoundException.class)// 拦截所有异常, 这里只是为了演示，一般情况下一个方法特定处理一种异常
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception e) {
        if (e instanceof IllegalArgumentException) {
            return ResponseEntity.status(400).body(illegalArgumentResponse);
        } else if (e instanceof ResourceNotFoundException) {
            return ResponseEntity.status(404).body(resourceNotFoundResponse);
        }
        return null;
    }
}
