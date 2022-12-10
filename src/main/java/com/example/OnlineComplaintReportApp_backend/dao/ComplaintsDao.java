package com.example.OnlineComplaintReportApp_backend.dao;

import com.example.OnlineComplaintReportApp_backend.model.Complaints;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ComplaintsDao extends CrudRepository<Complaints, Integer> {

    @Query(value="SELECT `id`, `complaints`, `userid` FROM `complaints` WHERE `userid`= :userid",nativeQuery = true)
    List<Complaints> ViewMyComplaints(@Param("userid") Integer userid);

    @Query(value="SELECT  r.`address`,  r.`emailid`, r.`name`,  r.`phoneno`,c.complaints FROM `registration` r JOIN complaints c ON c.userid=r.`id`",nativeQuery = true)
    List<Map<String,String>> Complaints();

}
