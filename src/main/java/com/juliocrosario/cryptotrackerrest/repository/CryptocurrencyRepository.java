package com.juliocrosario.cryptotrackerrest.repository;

import com.juliocrosario.cryptotrackerrest.model.Cryptocurrency;
import org.springframework.data.repository.CrudRepository;

public interface CryptocurrencyRepository extends CrudRepository<Cryptocurrency, String> {



}
