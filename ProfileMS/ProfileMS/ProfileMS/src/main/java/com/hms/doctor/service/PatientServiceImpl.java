package com.hms.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.doctor.dto.PatientDTO;
import com.hms.doctor.entity.Patient;
import com.hms.doctor.exception.HmsException;
import com.hms.doctor.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Long addPatient(PatientDTO patientDTO) throws HmsException {
if(patientDTO.getEmail()!=null&&patientRepository.findByEmail(patientDTO.getEmail()).isPresent()) throw new HmsException("Patient already exists Found");
        if(patientDTO.getAadharNo()!=null&&patientRepository.findByAadharNo(patientDTO.getAadharNo()).isPresent()) throw new HmsException("Patient already exists Found");
return patientRepository.save(patientDTO.toEnity()).getId();
    }
    @Override
    public Patient getPatientById(Long id) throws HmsException {
        return patientRepository.findById(id).orElseThrow(()->new HmsException("patient not found")).toDTO();

    }
    @Override
    public Boolean patientExists(Long id) throws HmsException {
        return patientRepository.existsById(id);
    }
}
