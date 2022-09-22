package com.example.springboottest.Bussiness;

import com.example.springboottest.ApiTest.City;

import java.util.List;

public interface ICityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
}

