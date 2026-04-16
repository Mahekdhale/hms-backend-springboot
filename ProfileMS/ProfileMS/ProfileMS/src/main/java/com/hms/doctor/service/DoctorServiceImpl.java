package com.hms.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.doctor.dto.DoctorDTO;
import com.hms.doctor.entity.Doctor;
import com.hms.doctor.exception.HmsException;
import com.hms.doctor.repository.DoctorRepository;
import com.hms.doctor.repository.PatientRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;
@Override
    public Long addDoctor(DoctorDTO doctorDTO) throws HmsException {
    if(doctorDTO.getEmail()!=null&&doctorRepository.findByEmail(doctorDTO.getEmail()).isPresent())throw new HmsException("Doctor already exists");
    if(doctorDTO.getLicenseNo()!=null&&doctorRepository.findByLicenseNo(doctorDTO.getLicenseNo()).isPresent())throw new HmsException("Doctor already exists");
    return doctorRepository.save(doctorDTO.toEntity()).getId();
}
    @Override
    public DoctorDTO getDoctorById(Long id) throws HmsException {
    return doctorRepository.findById(id).orElseThrow(()->new HmsException("doctor is not found")).toDTO();

    }
    @Override
    public Boolean doctorExists(Long id) throws HmsException{
    return doctorRepository.existsById(id);
    }

}
