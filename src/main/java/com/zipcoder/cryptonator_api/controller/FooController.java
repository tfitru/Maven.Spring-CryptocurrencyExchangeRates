package com.zipcoder.cryptonator_api.controller;

import com.zipcoder.cryptonator_api.domain.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by leon on 1/22/18.
 */

@RestController
public class FooController {

    @GetMapping("/api")
    public Foo getCrypto(){
        String URL = "https://api.cryptonator.com/api/ticker/btc-usd";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, Foo.class);
    }


}
