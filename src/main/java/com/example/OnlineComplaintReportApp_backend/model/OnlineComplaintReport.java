package com.example.OnlineComplaintReportApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registration")
public class OnlineComplaintReport {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String
}
