package com.example.OnlineComplaintReportApp_backend.dao;

import com.example.OnlineComplaintReportApp_backend.model.OnlineComplaintReport;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OnlineComplaintReportDao extends CrudRepository<OnlineComplaintReport,Integer> {

    @Query(value="SELECT `id`, `address`, `dob`, `emailid`, `name`, `password`, `phoneno` FROM `registration` WHERE `emailid`= :emailid AND`password`= :password",nativeQuery = true)
    List<OnlineComplaintReport> SignIn(@Param("emailid") String emailid,@Param("password") String password);
}
