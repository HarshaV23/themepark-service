package com.example.themeparkapp.controller;

import com.example.themeparkapp.exceptions.RideNotFoundException;
import com.example.themeparkapp.model.Themepark;
import com.example.themeparkapp.service.ThemeparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class ThemeparkController {
    @Autowired
    ThemeparkService themeparkService;

    @RequestMapping("/")
    public String welcome(){
        return "Welcome to Our Theme Park!";
    }

    @GetMapping("/rides")
    public Iterable<Themepark> getAllRides(){
        return themeparkService.findAll();
    }

    @GetMapping("/rides/{rideName}")
    public Optional<Themepark> getRideByName(@PathVariable String rideName) throws RideNotFoundException {
        Optional<Themepark> o=themeparkService.findByName(rideName);
        if(o.isPresent()){
            return themeparkService.findByName(rideName);
        }
        throw new RideNotFoundException("The ride "+rideName+" not availble");
    }

    @PostMapping("/rides/rating")
    public Themepark updateRideRating(@RequestBody Themepark themepark){
        return themeparkService.updateRating(themepark);
    }

    @PostMapping("/rides/vomitFactor")
    public Themepark updateVomitFactor(@RequestBody Themepark themepark){
        return themeparkService.updateVomitFactor(themepark);
    }

    @RequestMapping("/rides/create")
    public  String createRide(@RequestBody Themepark themepark){
        String uuID= UUID.randomUUID().toString();
        String uuId[]=uuID.split("-");
        themepark.setRideId(uuId[0]);
        themeparkService.createRide(themepark);
        return themepark.getRideId();
    }
}
