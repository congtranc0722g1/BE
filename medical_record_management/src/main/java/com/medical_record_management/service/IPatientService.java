package com.medical_record_management.service;

import com.medical_record_management.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPatientService {
    List<Patient> getAll();
}
