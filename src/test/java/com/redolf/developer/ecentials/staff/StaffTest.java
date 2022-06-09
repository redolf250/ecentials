package com.redolf.developer.ecentials.staff;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StaffTest {

    @Autowired
    private Staff staff;

    @BeforeEach
    void setUp() {
        staff = new Staff();
        staff.setId(BigInteger.valueOf(1234));
        staff.setName("redolf");
        staff.setAbout("Hello Am redolf");
        staff.setFacilityType(FacilityType.PHARMACY);
        staff.setFacilityId(BigInteger.valueOf(2346));
        staff.setTimeStamp(LocalTime.now());
        staff.setEmployeeId(BigInteger.valueOf(123457890));
        staff.setSpecification("Specification");
        staff.setExperience("Perfect");
        staff.setType(Type.DOCTOR);
        staff.setPasswords("123445677787");
        staff.setHospitalId(BigInteger.valueOf(5745737));
        staff.setAvailability(true);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
        System.out.println(staff.toString());
    }

    @Test
    void getId() {
        staff.getId();
    }

    @Test
    void getFacilityId() {
        staff.getFacilityId();
    }

    @Test
    void getFacilityType() {
        staff.getFacilityType();
    }

    @Test
    void getHospitalId() {
        staff.getHospitalId();
    }

    @Test
    void getEmployeeId() {
        staff.getEmployeeId();
    }

    @Test
    void getName() {
        staff.getName();
    }

    @Test
    void getSpecification() {
        staff.getSpecification();
    }

    @Test
    void getExperience() {
        staff.getExperience();
    }

    @Test
    void getImageFile() {

    }

    @Test
    void getPhoneNumber() {
        staff.getPhoneNumber();
    }

    @Test
    void getAbout() {
        staff.getAbout();
    }

    @Test
    void getType() {
        staff.getType();
    }

    @Test
    void getAvailability() {
        staff.isAvailability();
    }

    @Test
    void getUsername() {
        staff.getUsername();
    }

    @Test
    void getPasswords() {
        staff.getPasswords();
    }

    @Test
    void getTimeStamp() {
        staff.getTimeStamp();
    }

    @Test
    void setId() {
    }

    @Test
    void setFacilityId() {
    }

    @Test
    void setFacilityType() {
    }

    @Test
    void setHospitalId() {
    }

    @Test
    void setEmployeeId() {
    }

    @Test
    void setName() {
    }

    @Test
    void setSpecification() {
    }

    @Test
    void setExperience() {
    }

    @Test
    void setImageFile() {
    }

    @Test
    void setPhoneNumber() {
    }

    @Test
    void setAbout() {
    }

    @Test
    void setType() {
    }

    @Test
    void setAvailability() {
    }

    @Test
    void setUsername() {
    }

    @Test
    void setPasswords() {
    }

    @Test
    void setTimeStamp() {
    }
}