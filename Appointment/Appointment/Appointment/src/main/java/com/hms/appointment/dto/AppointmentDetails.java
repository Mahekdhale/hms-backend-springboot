package com.hms.appointment.dto;

import com.hms.appointment.entity.Appointment;

import java.time.LocalDateTime;

public class AppointmentDetails {
        private Long id;
        private Long patientId;
        private String patientName;
        private Long doctorId;
        private String doctorName;
        private LocalDateTime appointmentTime;
        private Status status;
        private String reason;
        private String notes;

        public AppointmentDetails() {
        }

        public AppointmentDetails(Long id, Long patientId,String patientName, Long doctorId,String doctorName, LocalDateTime appointmentTime, Status status, String reason, String notes) {
            this.appointmentTime = appointmentTime;
            this.doctorId = doctorId;
            this.patientName = patientName;
            this.doctorName = doctorName;
            this.id = id;
            this.patientId = patientId;
            this.status = status;
            this.reason = reason;
            this.notes = notes;
        }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDateTime getAppointmentTime() {
            return appointmentTime;
        }

        public void setAppointmentTime(LocalDateTime appointmentTime) {
            this.appointmentTime = appointmentTime;
        }

        public Long getDoctorId() {
            return doctorId;
        }

        public void setDoctorId(Long doctorId) {
            this.doctorId = doctorId;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public  Long getPatientId() {
            return patientId;
        }

        public void setPatientId(Long patientId) {
            this.patientId = patientId;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }


    }

