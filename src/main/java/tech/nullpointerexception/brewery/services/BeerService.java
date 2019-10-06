package tech.nullpointerexception.brewery.services;

import tech.nullpointerexception.brewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

}
