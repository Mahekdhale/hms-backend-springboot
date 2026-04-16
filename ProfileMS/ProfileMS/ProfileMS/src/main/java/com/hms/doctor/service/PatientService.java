package com.hms.doctor.service;

import com.hms.doctor.dto.PatientDTO;
import com.hms.doctor.entity.Patient;
import com.hms.doctor.exception.HmsException;

public interface PatientService {
    public Long addPatient(PatientDTO patientDTO) throws HmsException;
    public Patient getPatientById(Long id) throws HmsException;
    public Boolean patientExists(Long id) throws HmsException;
}
