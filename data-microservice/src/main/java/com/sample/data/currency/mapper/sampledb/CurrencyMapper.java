package com.sample.data.currency.mapper.sampledb;

import com.sample.data.currency.model.Currency;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CurrencyMapper {

    List<Currency> list();

    void insertCurrency(Currency currency);

    int updateCurrency(Currency currency);

    int deleteCurrency(@Param("id") Integer id, @Param("modifiedBy") String modifiedBy);

}
