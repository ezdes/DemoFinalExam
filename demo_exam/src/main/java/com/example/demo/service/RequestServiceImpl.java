package com.example.demo.service;

import com.example.demo.entity.Request;
import com.example.demo.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public Request create(Request request) {
        return requestRepository.save(request);
    }

    @Override
    public Integer count() {
        List<Request> requests = requestRepository.findAll();
        Integer count = 0;
        for (int i = 0; i < requests.size(); i++){
            count += 1;
        }
        return count;
    }

    @Override
    public List<Request> getAll() {
        return requestRepository.findAll();
    }
}
