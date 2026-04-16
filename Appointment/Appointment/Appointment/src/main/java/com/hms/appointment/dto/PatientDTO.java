package com.hms.appointment.dto;




import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class PatientDTO {

    private Long id;
    private String name;

    private String email;
    private LocalDate dob;
    private String phone;
    private String address;

    private String aadharNo;
    private BloodGroup bloodGroup;
    private String allergies;
    private String chronicDisease;



    public PatientDTO(Long id, String name, String email, LocalDate dob, String phone,String address,String aadharNo, BloodGroup bloodGroup,String allergies,String chronicDisease) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.aadharNo = aadharNo;
        this.bloodGroup = bloodGroup;
        this.allergies = allergies;
        this.chronicDisease=chronicDisease;
    }

    public PatientDTO() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob.toString();
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public String getAadharNo() {
        return aadharNo;
    }
    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(String chronicDisease) {
        this.chronicDisease = chronicDisease;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setDob(String password) {
        this.dob = dob;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "aadharNo='" + aadharNo + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", bloodGroup=" + bloodGroup +
                ", allergies='" + allergies + '\'' +
                ", chronicDisease='" + chronicDisease + '\'' +
                '}';
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
//
//    public Patient toEntity(){
//        return new Patient(this.id,this.name,this.email,this.dob,this.phone,this.address,this.aadharNo,this.bloodGroup,this.allergies,this.chronicDisease);
//    }
}

