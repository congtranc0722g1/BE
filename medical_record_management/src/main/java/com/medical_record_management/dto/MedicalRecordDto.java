package com.medical_record_management.dto;

import com.medical_record_management.model.Patient;
import com.sun.istack.NotNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


public class MedicalRecordDto implements Validator {

    private int id;

    @Pattern(regexp = "^BA-[0-9]{3}$", message = "Code nhập không đúng định dạng")
    @NotBlank(message = "không được để trống")
    private String code;

    @NotBlank(message = "không được để trống")
    private String startDay;

    @NotBlank(message = "không được để trống")
    private String endDay;

    @NotBlank(message = "không được để trống")
    private String reason;

    @NotBlank(message = "không được để trống")
    private String treatmentOption;

    @NotBlank(message = "không được để trống")
    private String doctor;

    private Patient patient;

    public MedicalRecordDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTreatmentOption() {
        return treatmentOption;
    }

    public void setTreatmentOption(String treatmentOption) {
        this.treatmentOption = treatmentOption;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
