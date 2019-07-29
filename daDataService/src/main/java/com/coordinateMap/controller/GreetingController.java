package com.coordinateMap.controller;

import com.coordinateMap.model.DaDataType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping
    public String findAddress(@RequestParam(name = "address", required = false, defaultValue = "") String address, Map<String, Object> model) {
        if (address.isEmpty()) {
            return "address";
        }
        DaDataService dataSource = new DaDataService();
        dataSource.fillDaDataInformation(DaDataType.ADDRESS, address);
        Map<String, Object> map = new HashMap<>();
        map.put("inputAddress", address);
        map.put("coordinateLat", dataSource.getAddress().getGeoLat());
        map.put("coordinateLon", dataSource.getAddress().getGeoLon());
        model.put("address", map);

        return "address";
    }
}
