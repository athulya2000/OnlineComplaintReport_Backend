package com.example.OnlineComplaintReportApp_backend.controller;

import com.example.OnlineComplaintReportApp_backend.dao.ComplaintsDao;
import com.example.OnlineComplaintReportApp_backend.model.Complaints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ComplaintsController {
    @Autowired
    private ComplaintsDao daoc;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addcomplaints",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> AddComplaints(@RequestBody Complaints c){
        HashMap<String,String> map=new HashMap<>();
        daoc.save(c);
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/viewmycomplaints",consumes = "application/json",produces = "application/json")
    public List<Complaints> ViewMyComplaints(@RequestBody Complaints c){
      String userid=String.valueOf(c.getUserid());
        System.out.println(userid);
        return (List<Complaints>) daoc.ViewMyComplaints(c.getUserid());
    }
}
