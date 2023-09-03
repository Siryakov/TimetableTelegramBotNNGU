package com.siryakov.TimetableTelegramBotNNGU.exception;

public class ServiceException extends Exception{

    public ServiceException(String massage, Throwable cause){
        super(massage,cause);
    }
}
