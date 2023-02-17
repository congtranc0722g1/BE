package com.medical_record_management.controller;

import com.medical_record_management.dto.IMedicalRecordListDto;
import com.medical_record_management.model.MedicalRecord;
import com.medical_record_management.model.Patient;
import com.medical_record_management.service.IMedicalRecordService;
import com.medical_record_management.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@CrossOrigin("*")
public class MedicalRecordRestController {

    @Autowired
    private IMedicalRecordService medicalRecordService;

    @Autowired
    private IPatientService patientService;

    @GetMapping("/list")
    private ResponseEntity<List<MedicalRecord>> showList() {
        List<MedicalRecord> medicalRecordListDtoList = medicalRecordService.showList();
        if (medicalRecordListDtoList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(medicalRecordListDtoList, HttpStatus.OK);
    }

    @DeleteMapping("/list/{id}")
    private ResponseEntity<?> delete(@PathVariable("id") Integer id){
        try{
            medicalRecordService.deleteMedicalRecord(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/patient")
    private ResponseEntity<List<Patient>> listPatient(){
        List<Patient> patientList = patientService.getAll();
        if (patientList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(patientList, HttpStatus.OK);
    }

    @PostMapping("")
    private ResponseEntity<?> add(@RequestBody MedicalRecord medicalRecord){

        try {
            medicalRecordService.add(medicalRecord.getCode(), medicalRecord.getStartDay(), medicalRecord.getEndDay(), medicalRecord.getReason(), medicalRecord.getTreatmentOption(), medicalRecord.getDoctor(), medicalRecord.getPatient().getId());
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    private ResponseEntity<>


}
