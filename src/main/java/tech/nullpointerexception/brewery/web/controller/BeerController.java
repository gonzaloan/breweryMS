package tech.nullpointerexception.brewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.nullpointerexception.brewery.services.BeerService;
import tech.nullpointerexception.brewery.web.model.BeerDTO;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public BeerDTO getBeer(@PathVariable  UUID beerId){
        return beerService.getBeerById(beerId);
    }
}
