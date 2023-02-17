package com.medical_record_management.repository;

import com.medical_record_management.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IMedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {
    @Query(value = "select * from medical_record", nativeQuery = true)
    List<MedicalRecord> showList();

    @Modifying
    @Transactional
    @Query(value = "delete from medical_record where id = :id", nativeQuery = true)
    void deleteMedicalRecord(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "insert into medical_record(code, start_day, end_day, reason, treatment_option, doctor, patient_id) value(:code, :startDay, :endDay, :reason, :treatmentOption, :doctor, :patientId)", nativeQuery = true)
    void add(@Param("code") String code, @Param("startDay") String startDay, @Param("endDay") String endDay, @Param("reason") String reason, @Param("treatmentOption") String treatmentOption, @Param("doctor") String doctor, @Param("patientId") Integer patientId);

    @Modifying
    @Transactional
    @Query(value = "select * from medical_record where id = :id", nativeQuery = true)
    MedicalRecord findMedicalRecord (@Param("id") Integer id);
}