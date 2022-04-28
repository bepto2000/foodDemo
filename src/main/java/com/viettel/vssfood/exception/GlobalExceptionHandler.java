package com.viettel.vssfood.exception;

import com.viettel.vssfood.util.JsonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JsonResponse> handleUnwantedException(Exception e) {
        return ResponseEntity.status(500).body( new JsonResponse("Something went wrong. Please check again!"));
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseBody
    public JsonResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return new JsonResponse("Missing or invalid parameters");
    }

    @ExceptionHandler({AppException.class})
    @ResponseBody
    public JsonResponse handleAppException(AppException e) {
        return new JsonResponse(e.getMessage());
    }
}
