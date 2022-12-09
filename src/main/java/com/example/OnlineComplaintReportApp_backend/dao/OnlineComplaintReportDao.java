package com.example.OnlineComplaintReportApp_backend.dao;

import com.example.OnlineComplaintReportApp_backend.model.OnlineComplaintReport;
import org.springframework.data.repository.CrudRepository;

public interface OnlineComplaintReportDao extends CrudRepository<OnlineComplaintReport,Integer> {
}
