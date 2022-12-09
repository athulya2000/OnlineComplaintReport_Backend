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
    private String phoneno;
    private String dob;
    private String emailid;
    private String password;

    public OnlineComplaintReport() {
    }

    public OnlineComplaintReport(int id, String name, String address, String phoneno, String dob, String emailid, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.dob = dob;
        this.emailid = emailid;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
