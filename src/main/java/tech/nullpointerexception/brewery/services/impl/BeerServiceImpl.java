package tech.nullpointerexception.brewery.services.impl;

import org.springframework.stereotype.Service;
import tech.nullpointerexception.brewery.services.BeerService;
import tech.nullpointerexception.brewery.web.model.BeerDTO;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
