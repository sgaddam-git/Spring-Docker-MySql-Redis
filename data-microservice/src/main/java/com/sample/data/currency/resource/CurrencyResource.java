package com.sample.data.currency.resource;

import com.sample.data.currency.model.Currency;
import com.sample.data.currency.service.CurrencyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@Tag(name = "[Data] Currency", description = "Currency REST Service(s)")
@RestController
@RequestMapping("/data/currency")
public class CurrencyResource {

    @Autowired
    private CurrencyService service;

    @Operation(summary = "List Currency")
    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Currency> list() {
        return service.list();
    }

    @Operation(summary = "Lookup Currency By Id")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public java.util.Optional<Currency> getById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @Operation(summary = "Insert Currency")
    @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
    public Currency insertCurrency(Currency currency) {
        return service.insertCurrency(currency);
    }

    @Operation(summary = "Update Currency")
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Currency updateCurrency(@PathVariable("id") Integer id, Currency currency) {
        return service.updateCurrency(id, currency);
    }

    @Operation(summary = "Delete Currency")
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public void deleteCurrency(@PathVariable("id") Integer id) {
        service.deleteCurrency(id);
    }


}
