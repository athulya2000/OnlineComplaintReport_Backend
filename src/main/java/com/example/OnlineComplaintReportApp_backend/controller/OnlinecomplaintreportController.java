package com.example.OnlineComplaintReportApp_backend.controller;

import com.example.OnlineComplaintReportApp_backend.dao.OnlineComplaintReportDao;
import com.example.OnlineComplaintReportApp_backend.model.OnlineComplaintReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OnlinecomplaintreportController {
    @Autowired
    private OnlineComplaintReportDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/registration",consumes = "application/json",produces = "application/json")
    public Map<String,String> UserRegistration(@RequestBody OnlineComplaintReport o){
        System.out.println(o.getName().toString());
        System.out.println(o.getAddress().toString());
        System.out.println(o.getPhoneno().toString());
        System.out.println(o.getDob().toString());
        System.out.println(o.getEmailid().toString());
        System.out.println(o.getPassword().toString());
        dao.save(o);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/signin",consumes = "application/json",produces = "application/json")
    public List<OnlineComplaintReport> Signin(@RequestBody OnlineComplaintReport o){
        String emailid=o.getEmailid().toString();
        String password=o.getPassword().toString();
        System.out.println(emailid);
        System.out.println(password);
        return (List<OnlineComplaintReport>) dao.SignIn(o.getEmailid(),o.getPassword());


    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/viewprofile",consumes = "application/json",produces = "application/json")
    public List<OnlineComplaintReport> ViewProfile(@RequestBody OnlineComplaintReport o){
        String id=String.valueOf(o.getId());
        return (List<OnlineComplaintReport>) dao.ViewProfile(o.getId());
    }

}
