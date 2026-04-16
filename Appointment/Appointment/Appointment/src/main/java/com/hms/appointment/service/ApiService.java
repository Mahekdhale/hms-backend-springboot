package com.hms.appointment.service;



import com.hms.appointment.config.WebClientConfig;

import com.hms.appointment.dto.DoctorDTO;
import com.hms.appointment.dto.PatientDTO;
import com.hms.appointment.exception.HmsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.notification.ModelMBeanNotificationPublisher;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiService {
    @Autowired
    private WebClient.Builder webClient;
    public Mono<Boolean> patientExists(Long id){

            return webClient.build().get().uri("http://localhost:9100/profile/patient/exists/"+id).retrieve().bodyToMono(Boolean.class);
        }
    public Mono<Boolean> doctorExists(Long id){

        return webClient.build().get().uri("http://localhost:9100/profile/doctor/exists/"+id).retrieve().bodyToMono(Boolean.class);
    }
    public Mono<PatientDTO> getPatientById(Long id){
        return webClient.build().get().uri("http://localhost:9100/profile/patient/get/"+id).retrieve().bodyToMono(PatientDTO.class);

    }
    public Mono<DoctorDTO> getDoctorById(Long id){
        return webClient.build().get().uri("http://localhost:9100/profile/doctor/get/"+id).retrieve().bodyToMono(DoctorDTO.class);
    }


}

