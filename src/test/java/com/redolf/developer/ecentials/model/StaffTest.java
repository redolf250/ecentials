package com.redolf.developer.ecentials.model;

import com.redolf.developer.ecentials.facility.FacilityType;
import com.redolf.developer.ecentials.repository.StaffRepository;
import com.redolf.developer.ecentials.type.Type;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

@SpringBootTest
class StaffTest {

    @Autowired
    private StaffRepository repository;
    @Autowired
    private Staff staff;

    @BeforeEach
    void setUp() {
        staff = new Staff();
        staff.setName("Blessing");
        staff.setUsername("blessing@100");
        staff.setFacilityType(FacilityType.HOSPITAL);
        staff.setType(Type.TECHNICIAN);
        staff.setPhoneNumber("2335690543");
        staff.setExperience("Average");
        staff.setTimestamp(LocalTime.now());
    }

    @AfterEach
    void tearDown() {
        staff = null;
    }

    @Test
    void saveStaff(){
        repository.insert(staff);
    }
}