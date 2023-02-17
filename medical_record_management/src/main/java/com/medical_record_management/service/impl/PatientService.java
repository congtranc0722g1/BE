package com.medical_record_management.service.impl;

import com.medical_record_management.model.Patient;
import com.medical_record_management.repository.IPatientRepository;
import com.medical_record_management.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatientService {

    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public List<Patient> getAll() {
        return patientRepository.getAll();
    }
}
