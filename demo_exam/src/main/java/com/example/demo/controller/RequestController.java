package com.example.demo.controller;

import com.example.demo.entity.Request;
import com.example.demo.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/report")
    public List<Request> getAll(){
        return requestService.getAll();
    }

    @GetMapping("/counter")
    public String getCount(){
        Integer count = requestService.count();
        return "Amount of requests: " + count;
    }

    @PostMapping("/counter")
    public Request createRequest(@RequestBody Request request) {
        return requestService.create(request);
    }
}
