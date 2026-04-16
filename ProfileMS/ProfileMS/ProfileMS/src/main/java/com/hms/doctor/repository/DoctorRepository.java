package com.hms.doctor.repository;

import org.springframework.data.repository.CrudRepository;

import com.hms.doctor.entity.Doctor;

import java.util.Optional;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    Optional<Doctor> findByEmail(String email );
    Optional<Doctor> findByLicenseNo(String licenseNo );

}
