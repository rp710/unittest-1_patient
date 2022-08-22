package com.example.demo.controller;

import com.example.demo.model.PatientRecord;
import com.example.demo.repository.PatitentRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PatientRecordController {
    @Autowired
    PatitentRecordRepository patitentRecordRepository;
    @GetMapping("/patient")
    public List<PatientRecord> getpatientrecords() {
        return patitentRecordRepository.findAll();
    }
    @GetMapping("/patient/{PatientId}")
    public List<PatientRecord> getpatient(@PathVariable Integer patientid) {
        return (List<PatientRecord>) patitentRecordRepository.findById(patientid).get();
    }
    @DeleteMapping("/patient/{PatientId}")
    public List<PatientRecord> deletePatient(@PathVariable Integer patientid) {
        patitentRecordRepository.delete(patitentRecordRepository.findById(patientid).get());
        return patitentRecordRepository.findAll();
    }
    @PostMapping("/patient")
    public List<PatientRecord> addPatient(@RequestBody PatientRecord patientrecord) {
        patitentRecordRepository.save(patientrecord);
        return patitentRecordRepository.findAll();
    }
    @PutMapping("/patient/{patientid}")
    public List<PatientRecord> updatepatientrecord(@RequestBody PatientRecord patientrecord,@PathVariable Integer PatientId) {
        PatientRecord patientobj = (PatientRecord) patitentRecordRepository.findById(PatientId).get();
        patientobj.setName(patientrecord.getName());
        patientobj.setAddress(patientrecord.getAddress());
        patientobj.setAge(patientrecord.getAge());
        return patitentRecordRepository.findAll();
    }
}
