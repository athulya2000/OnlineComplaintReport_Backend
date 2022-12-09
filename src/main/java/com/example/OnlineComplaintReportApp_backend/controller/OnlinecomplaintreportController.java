package com.example.OnlineComplaintReportApp_backend.controller;

import com.example.OnlineComplaintReportApp_backend.model.OnlineComplaintReport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OnlinecomplaintreportController {

    @PostMapping(path="/registration",consumes = "application/json",produces = "application/json")
    public List<String,String> UserRegistration(@RequestBody OnlineComplaintReport){

    }
}
