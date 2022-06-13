package com.redolf.developer.ecentials.model;

import com.redolf.developer.ecentials.facility.FacilityType;
import com.redolf.developer.ecentials.type.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.io.File;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Staff {

    @Id
    private String id;

    private String facilityId;
    private FacilityType facilityType;
    private String employeeId;
    private String name;
    private String specification;
    private String experience;
    private String imageUrl;
    private String phoneNumber;
    private String about;
    private Type type;
    private String availability;
    private String username;
    private String password;
    private LocalTime timestamp;
}
