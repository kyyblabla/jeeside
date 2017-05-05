package com.kyyblabla.jeeside.vo

/**
 * Created by hp on 2017/5/5.
 */
class ResponseVo {

    String errMessage
    Object errCode
    Boolean isErr
    Exception err
    Object data


    static ResponseVo success() {
        new ResponseVo()
    }

    static ResponseVo success(Object data) {
        new ResponseVo(data: data)
    }

    static ResponseVo error(Object errCode, String errMessage) {
        new ResponseVo(errCode: errCode, errMessage: errMessage, isErr: true)
    }

    static ResponseVo error(Object errCode, String errMessage, Exception e) {
        new ResponseVo(errCode: errCode, errMessage: errMessage, isErr: true, err: e)
    }
}
