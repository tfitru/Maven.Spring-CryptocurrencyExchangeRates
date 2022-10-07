package com.zipcoder.cryptonator_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {

//    "ticker":{"base":"BTC","target":"USD","price":"20149.62047669","volume":"15167.69998650","change":"40.11050895"}


    private String base;

    private String target;
    private String price;
    private String volume;
    private String change;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "ticker:" + "{" + base + "," + target + "," + price + "," + volume + "," + change + "}";
    }
    //    "ticker":{"base":"BTC","target":"USD","price":"20149.62047669","volume":"15167.69998650","change":"40.11050895"}


}
