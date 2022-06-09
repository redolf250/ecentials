package com.redolf.developer.ecentials.staff;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.io.File;
import java.math.BigInteger;
import java.time.LocalTime;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Document
public class Staff {

    @Id
    private BigInteger id;

    @Indexed(unique=true)
    private BigInteger facilityId;

    private FacilityType facilityType;
    @Indexed(unique=true)
    private BigInteger hospitalId;

    @Indexed(unique=true)
    private BigInteger employeeId;

    private String name;
    private String specification;
    private String experience;
    private File imageFile;

    @Indexed(unique=true)
    private BigInteger phoneNumber;

    private String about;
    private Type type;

    private boolean availability;

    @Indexed(unique=true)
    private String username;

    private String passwords;
    private LocalTime timeStamp;

}
