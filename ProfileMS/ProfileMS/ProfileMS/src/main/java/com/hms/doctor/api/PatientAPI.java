package com.hms.doctor.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.hms.doctor.dto.PatientDTO;
import com.hms.doctor.entity.Patient;
import com.hms.doctor.exception.HmsException;
import com.hms.doctor.service.PatientService;

@RestController
@CrossOrigin
@RequestMapping("profile/patient")
@Validated
public class PatientAPI {
    @Autowired
    private PatientService patientService;
    @PostMapping("/add")
    public ResponseEntity<Long> addPatient(@RequestBody PatientDTO patientDTO) throws HmsException {
        return new ResponseEntity<>(patientService.addPatient(patientDTO), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable long id) throws HmsException {
        return new ResponseEntity<>(patientService.getPatientById(id), HttpStatus.OK);
    }
@GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> patientExists(@PathVariable Long id) throws HmsException{
        return new ResponseEntity<>(patientService.patientExists(id),HttpStatus.OK);
}

}
