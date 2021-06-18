package com.example.demo.service;

import com.example.demo.entity.Request;

import java.util.List;

public interface RequestService {
    Request create(Request request);
    Integer count();
    List<Request> getAll();
}
