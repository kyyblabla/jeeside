package com.kyyblabla.jeeside.vo

/**
 * Created by hp on 2017/5/5.
 */
class ResponseMessage {

    String errMessage
    Object errCode
    Boolean isErr
    Exception err
    Object data


    static ResponseMessage success() {
        new ResponseMessage()
    }
    
    static ResponseMessage success(Object data) {
        new ResponseMessage(data: data)
    }

    static ResponseMessage error(Object errCode, String errMessage) {
        new ResponseMessage(errCode: errCode, errMessage: errMessage, isErr: true)
    }

    static ResponseMessage error(Object errCode, String errMessage, Exception e) {
        new ResponseMessage(errCode: errCode, errMessage: errMessage, isErr: true, err: e)
    }
}
