package com.juliocrosario.cryptotrackerrest.service;

import com.juliocrosario.cryptotrackerrest.model.Cryptocurrency;
import com.juliocrosario.cryptotrackerrest.repository.CryptocurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CryptocurrencyService {

    @Autowired
    private CryptocurrencyRepository cryptocurrencyRepository;

    public List<Cryptocurrency> getAllCryptocurrencies(){

        List<Cryptocurrency> output = new ArrayList<>();
        cryptocurrencyRepository.findAll().forEach(output::add);
        return output;
    }

    public void addAllCryptocurrencies(List<Cryptocurrency> cryptocurrencyList ){
        cryptocurrencyRepository.saveAll(cryptocurrencyList);
    }

    public void addCryptocurrency(Cryptocurrency cryptocurrency){
        cryptocurrencyRepository.save(cryptocurrency);
    }

    public Cryptocurrency getCryptocurrency(String id){
        return cryptocurrencyRepository.findById(id).get();
    }


}
