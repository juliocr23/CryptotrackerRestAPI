package com.juliocrosario.cryptotrackerrest.controller;

import com.juliocrosario.cryptotrackerrest.model.Cryptocurrency;
import com.juliocrosario.cryptotrackerrest.service.CryptocurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CryptocurrencyController {

    @Autowired
    private CryptocurrencyService service;

    @RequestMapping("/cryptocurrencies")
    public List<Cryptocurrency> getAllCryptocurrencies(){
        return service.getAllCryptocurrencies();
    }

    @RequestMapping("/cryptocurrencies/{id}")
    public Cryptocurrency getCryptocurrency(@PathVariable  String id){
        return service.getCryptocurrency(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/cryptocurrencies{list}")
    public void addCryptocurrency(@PathVariable List<Cryptocurrency> list){

    }

    @RequestMapping(method= RequestMethod.PUT, value="/cryptocurrencies")
    public void updateCryptocurrency(@RequestBody Cryptocurrency cryptocurrency){
        //Update cryptocurrencies.
    }


}
