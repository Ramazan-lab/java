package com.example.springboottest.restApi;

import com.example.springboottest.ApiTest.City;
import com.example.springboottest.Bussiness.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api")
public class CityController {

    private ICityService cityService;
    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @Transactional
    @GetMapping("/citties")
    public List<City> getAll(){
        return this.cityService.getAll();
    }


}
