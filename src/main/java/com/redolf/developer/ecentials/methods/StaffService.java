package com.redolf.developer.ecentials.methods;

import com.redolf.developer.ecentials.model.Staff;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface StaffService {

     ResponseEntity<?> createStaff(Staff staff);

     ResponseEntity<?> updateStaffById(String staffId, Staff staff);

     ResponseEntity<?> deleteStaffById(String staffId);

     ResponseEntity<?> getStaffById(String staffId);

     ResponseEntity<?> getAllStaff();
}
