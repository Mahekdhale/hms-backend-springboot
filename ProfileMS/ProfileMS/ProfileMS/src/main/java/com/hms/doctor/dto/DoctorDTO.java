package com.hms.doctor.dto;
import java.time.LocalDate;

import com.hms.doctor.entity.Doctor;
public class DoctorDTO {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private String phone;
    private String address;
    private String licenseNo;
    private String specialization;
    private String department;
    private Integer totalExp;
    private BloodGroup bloodGroup;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Integer getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(Integer totalExp) {
        this.totalExp = totalExp;
    }

    public DoctorDTO() {
        super();
    }

    public DoctorDTO(Long id, String name, String email, LocalDate dob, String phone, String address, String licenseNo, String specialization, String department, Integer totalExp,BloodGroup bloodGroup) {
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.department = department;
        this.dob = dob;
        this.email = email;
        this.id = id;
        this.licenseNo = licenseNo;
        this.name = name;
        this.phone = phone;
        this.specialization = specialization;
        this.totalExp = totalExp;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                ", licenseNo='" + licenseNo + '\'' +
                ", specialization='" + specialization + '\'' +
                ", department='" + department + '\'' +
                ", totalExp=" + totalExp +
                ", bloodGroup=" + bloodGroup +
                '}';
    }
    public Doctor toEntity(){
        return new Doctor(id,name,email,dob,phone,address,licenseNo,specialization,department,totalExp,bloodGroup);
    }
}

