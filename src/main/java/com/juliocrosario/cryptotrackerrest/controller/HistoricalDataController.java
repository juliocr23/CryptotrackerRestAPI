package com.juliocrosario.cryptotrackerrest.controller;

import com.juliocrosario.cryptotrackerrest.model.HistoricalData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoricalDataController {


    @RequestMapping("/historicalData/hourly")
    public List<HistoricalData> getHourlyData(){
        return null;
    }

    @RequestMapping("/historicalData/daily")
    public List<HistoricalData> getDailyData(){
        return null;
    }

    @RequestMapping("/historicalData/weekly")
    public List<HistoricalData> getWeeklyData(){
        return null;
    }

    @RequestMapping("/historicalData/monthly")
    public List<HistoricalData> getMonthlyData(){
        return null;
    }

    @RequestMapping("/historicalData/yearly")
    public List<HistoricalData> getYearlyData(){
        return null;
    }

    @RequestMapping("/historicalData/all")
    public List<HistoricalData> getAllData(){
        return null;
    }



}
