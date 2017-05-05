package com.kyyblabla.jeeside.exception

import com.kyyblabla.jeeside.vo.ResponseVo
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

/**
 * Created by hp on 2017/5/4.
 */
@RestControllerAdvice('com.kyyblabla.jeeside')
class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    Logger logger = LoggerFactory.getLogger(getClass())

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ResponseVo handleException(Exception e) {
        logger.error('exception:', e)
        ResponseVo.error(0, e.message, e)
    }

}
