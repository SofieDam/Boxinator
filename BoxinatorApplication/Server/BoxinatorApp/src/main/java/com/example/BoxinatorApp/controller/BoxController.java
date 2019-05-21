package com.example.BoxinatorApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.BoxinatorApp.model.Box;
import com.example.BoxinatorApp.repository.BoxRepository;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BoxController {

    @Autowired
    BoxRepository boxRepository;

    /*------------------List all boxes ---------------*/

    @GetMapping(path = "/listboxes")
    public List<Box> getAllItems(){
        List<Box> boxes = new ArrayList<>();
        boxRepository.findAll().forEach(boxes :: add);
        return boxes;
    }

    /*--------------------Add box --------------------*/
    
    @PostMapping("/addbox")
    public Box addBox(@RequestBody Box box){
    	boxRepository.save(box);
        return box;
    }

}