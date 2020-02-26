package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/search/findWhiskiesFromYear")
    public List<Whisky> findWhiskiesFromYear(@RequestParam int year){
        return whiskyRepository.findWhiskiesFromYear(year);
    }

    @GetMapping(value = "/search/findWhiskiesFromParticularDistilleryOfAge")
    public List<Whisky> findWhiskiesFromParticularDistilleryOfAge(@RequestParam String name, int age){
        return whiskyRepository.findWhiskiesFromParticularDistilleryOfAge(name, age);
    }

    @GetMapping(value = "/search/whiskiesFromRegion")
    public List<Whisky> whiskiesFromRegion(@RequestParam String region){
        return whiskyRepository.whiskiesFromRegion(region);
    }

}
