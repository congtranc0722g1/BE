package com.medical_record_management.repository;

import com.medical_record_management.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

    @Query(value = "select * from patient", nativeQuery = true)
    List<Patient> getAll();
}
