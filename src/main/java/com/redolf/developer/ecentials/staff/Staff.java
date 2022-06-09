package com.redolf.developer.ecentials.staff;

import lombok.*;
import org.springframework.stereotype.Component;

import java.io.File;
import java.math.BigInteger;
import java.time.LocalTime;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Staff {

    private BigInteger id;
    private BigInteger facilityId;
    private FacilityType facilityType;
    private BigInteger hospitalId;
    private BigInteger employeeId;
    private String name;
    private String specification;
    private String experience;
    private File imageFile;
    private BigInteger phoneNumber;
    private String about;
    private Type type;
    private String availability;
    private String username;
    private String passwords;
    private LocalTime timeStamp;

}
