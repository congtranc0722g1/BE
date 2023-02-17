package com.medical_record_management.dto;

import java.util.Date;

public interface IMedicalRecordListDto {
    Integer getId();

    String getCode();

    String getStartDay();

    String getEndDay();

    String getReason();

    String getTreatmentOption();

    String getDoctor();

    String getName();

    String getCodePatient();
}
