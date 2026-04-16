package com.hms.doctor.repository;

import org.springframework.data.repository.CrudRepository;

import com.hms.doctor.entity.Patient;

import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    Optional<Patient> findByEmail(String email);
    Optional<Patient> findByAadharNo(String aadharNo);
}
