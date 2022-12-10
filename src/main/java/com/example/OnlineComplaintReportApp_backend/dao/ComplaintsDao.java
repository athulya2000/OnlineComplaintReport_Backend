package com.example.OnlineComplaintReportApp_backend.dao;

import com.example.OnlineComplaintReportApp_backend.model.Complaints;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintsDao extends CrudRepository<Complaints, Integer> {
}
