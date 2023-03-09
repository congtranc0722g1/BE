package com.medical_record_management.service.impl;

import com.medical_record_management.dto.IMedicalRecordListDto;
import com.medical_record_management.model.MedicalRecord;
import com.medical_record_management.repository.IMedicalRecordRepository;
import com.medical_record_management.service.IMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService implements IMedicalRecordService {

    @Autowired
    private IMedicalRecordRepository medicalRecordRepository;

    @Override
    public Page<MedicalRecord> showList(String reason, String name, Pageable pageable) {
        return medicalRecordRepository.showList(reason, name, pageable);
    }

    @Override
    public Page<MedicalRecord> findAll(Pageable pageable) {
        return medicalRecordRepository.findAll(pageable);
    }

    @Override
    public void deleteMedicalRecord(Integer id) {
        medicalRecordRepository.deleteMedicalRecord(id);
    }

    @Override
    public void add(String code, String startDay, String endDay, String reason, String treatmentOption, String doctor, Integer patientId) {
        medicalRecordRepository.add(code, startDay, endDay, reason, treatmentOption, doctor, patientId);
    }

    @Override
    public MedicalRecord findMedicalRecord(Integer id) {
        return medicalRecordRepository.findMedicalRecord(id);
    }

    @Override
    public void updateMedicalRecord(String startDay, String endDay, String reason, String treatmentOption, String doctor, Integer id) {
        medicalRecordRepository.updateMedicalRecord(startDay, endDay, reason, treatmentOption, doctor, id);
    }

    @Override
    public List<MedicalRecord> searchReason(String reason) {
        return medicalRecordRepository.searchReason(reason);
    }


}
