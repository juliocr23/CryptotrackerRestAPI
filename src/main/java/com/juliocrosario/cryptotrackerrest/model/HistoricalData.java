package com.juliocrosario.cryptotrackerrest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class HistoricalData {

    private double open;
    private double high;
    private double low;
    private double volumeFrom;
    private double volumeTo;
    private double close;
    private Date time;

    @Id
    private String id;

    public HistoricalData(){

    }

    public HistoricalData(double open, double high, double low, double volumeFrom, double volumeTo, double close, Date time) {
        this.open = open;
        this.high = high;
        this.low = low;
        this.volumeFrom = volumeFrom;
        this.volumeTo = volumeTo;
        this.close = close;
        this.time = time;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getVolumeFrom() {
        return volumeFrom;
    }

    public void setVolumeFrom(double volumeFrom) {
        this.volumeFrom = volumeFrom;
    }

    public double getVolumeTo() {
        return volumeTo;
    }

    public void setVolumeTo(double volumeTo) {
        this.volumeTo = volumeTo;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
