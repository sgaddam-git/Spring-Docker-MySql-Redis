package com.sample.data.currency.service;

import com.sample.data.currency.mapper.sampledb.CurrencyMapper;
import com.sample.data.currency.model.Currency;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurrencyService {
    @Autowired
    private CurrencyMapper mapper;

    public List<Currency> list() {
        return mapper.list();
    }

    public Optional<Currency> getById(Integer id) {
        return list().stream().filter(currency -> currency.getId() == id.intValue()).findFirst();
    }

    public Currency insertCurrency(Currency currency) {
        mapper.insertCurrency(currency);
        return currency;
    }

    public Currency updateCurrency(int id, Currency currency) {
        Optional<Currency> currencyOpt = getById(id);
        if (currencyOpt.isPresent()) {
            currency.setId(id);
            mapper.updateCurrency(currency);
            return getById(currency.getId()).get();
        } else {
            throw new NotFoundException("Currency not found");
        }
    }

    public void deleteCurrency(int id) {
        Optional<Currency> currencyOpt = getById(id);
        if (currencyOpt.isPresent()) {
            mapper.deleteCurrency(currencyOpt.get().getId(), "admin");
        } else {
            throw new NotFoundException("Currency not found");
        }
    }
}