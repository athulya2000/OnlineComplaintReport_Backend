package com.example.OnlineComplaintReportApp_backend.controller;

import com.example.OnlineComplaintReportApp_backend.dao.ComplaintsDao;
import com.example.OnlineComplaintReportApp_backend.model.Complaints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ComplaintsController {
    @Autowired
    private ComplaintsDao dao;

    @PostMapping(path="/addcomplaints",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> AddComplaints(@RequestBody Complaints c){
        HashMap<String,String> map=new HashMap<>();
        dao.save(c);
        map.put("status","success");
        return map;

    }
}
