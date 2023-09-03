package com.siryakov.TimetableTelegramBotNNGU.service;

import com.siryakov.TimetableTelegramBotNNGU.exception.ServiceException;

public interface ExchangeRatesService {

     String getUSDExchangeRate() throws ServiceException;
     String getEURExchangeRate() throws ServiceException;
}
