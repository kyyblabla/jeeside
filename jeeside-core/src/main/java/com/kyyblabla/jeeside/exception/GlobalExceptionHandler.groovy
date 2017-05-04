package com.kyyblabla.jeeside.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

/**
 * Created by hp on 2017/5/4.
 */
@RestControllerAdvice('com.kyyblabla.jeeside')
class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

}
