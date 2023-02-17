package com.medical_record_management.service.impl;

import com.medical_record_management.dto.IMedicalRecordListDto;
import com.medical_record_management.model.MedicalRecord;
import com.medical_record_management.repository.IMedicalRecordRepository;
import com.medical_record_management.service.IMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService implements IMedicalRecordService {

    @Autowired
    private IMedicalRecordRepository medicalRecordRepository;
    @Override
    public List<MedicalRecord> showList() {
        return medicalRecordRepository.showList();
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


}
