package org.example;

import org.example.exception.ArticleExistsException;
import org.example.exception.ProductNotFoundException;
import org.example.exception.ResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {ProductNotFoundException.class})
    public ResponseEntity<ResponseError> handleException(ProductNotFoundException exception) {
        ResponseError responseError = new ResponseError(
                HttpStatus.NOT_FOUND,
                exception.getMessage()
        );
        return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<ResponseError> handleException(RuntimeException exception) {
        ResponseError responseError = new ResponseError(
                HttpStatus.UNPROCESSABLE_ENTITY,
                exception.getMessage()
        );
        return new ResponseEntity<>(responseError, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(value = {ArticleExistsException.class})
    public ResponseEntity<ResponseError> handleException(ArticleExistsException exception) {
        ResponseError responseError = new ResponseError(
                HttpStatus.BAD_REQUEST,
                exception.getMessage()
        );
        return new ResponseEntity<>(responseError, HttpStatus.BAD_REQUEST);
    }
}
