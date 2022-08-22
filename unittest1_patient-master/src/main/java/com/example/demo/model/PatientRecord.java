package com.example.demo.model;

import javax.persistence.Id;

public class PatientRecord {
    @Id
    private Long patientid;
    private String name;
    private String address;
    private Integer age;
    public PatientRecord(){

    }
    public PatientRecord(Long patientid,String name,String address,Integer age){
        this.patientid = patientid;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Long getPatientid() {
        return patientid;
    }

    public void setPatientid(Long patientid) {
        this.patientid = patientid;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
