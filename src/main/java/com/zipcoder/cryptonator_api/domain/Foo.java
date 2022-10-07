package com.zipcoder.cryptonator_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zipcoder.cryptonator_api.repositories.TickerRepo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by leon on 1/22/18.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Foo {

//    {"ticker":{"base":"BTC","target":"USD","price":"20149.62047669","volume":"15167.69998650","change":"40.11050895"},
//        "timestamp":1664987583,"success":true,"error":""}


    private Ticker ticker;
    private Timestamp timestamp;
    private Boolean success;
    private String error;

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }


    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString(){
        return "{ "+ ticker + ", " + timestamp + "," + success +"," + error + "}";
    }
}
