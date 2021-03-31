package com.juliocrosario.cryptotrackerrest.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cryptocurrency {

    private double change24H;
    private double highDay;
    private double lowDay;
    private double marketCap;
    private double price;
    private double supply;
    private double volume24H;

    @Id
    private String id;
    private String name;
    private String symbol;


    public Cryptocurrency(){

    }

    public Cryptocurrency(double change24H, double highDay, double lowDay, double marketCap, double price, double supply, double volume24H, String id, String name, String symbol) {
        this.change24H = change24H;
        this.highDay = highDay;
        this.lowDay = lowDay;
        this.marketCap = marketCap;
        this.price = price;
        this.supply = supply;
        this.volume24H = volume24H;
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public double getChange24H() {
        return change24H;
    }

    public void setChange24H(double change24H) {
        this.change24H = change24H;
    }

    public double getHighDay() {
        return highDay;
    }

    public void setHighDay(double highDay) {
        this.highDay = highDay;
    }

    public double getLowDay() {
        return lowDay;
    }

    public void setLowDay(double lowDay) {
        this.lowDay = lowDay;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSupply() {
        return supply;
    }

    public void setSupply(double supply) {
        this.supply = supply;
    }

    public double getVolume24H() {
        return volume24H;
    }

    public void setVolume24H(double volume24H) {
        this.volume24H = volume24H;
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


}
