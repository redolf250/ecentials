package com.redolf.developer.ecentials.service;

import com.redolf.developer.ecentials.exception.ResourceException;
import com.redolf.developer.ecentials.methods.StaffService;
import com.redolf.developer.ecentials.model.Staff;
import com.redolf.developer.ecentials.repository.StaffRepository;
import com.redolf.developer.ecentials.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StaffServiceImp implements StaffService {

    private StaffRepository staffRepository;

    @Override
    public ResponseEntity<?> createStaff(Staff staffDTO){
         if (staffDTO.getEmployeeId() == null) {
             return new ResponseEntity<>(Response.error("creating"),HttpStatus.FORBIDDEN);
         }
         try {
             staffRepository.insert(staffDTO);
         }catch (Exception e) {
             throw new ResourceException(e.getMessage());
         }

        return new ResponseEntity<>(Response.create("Staff"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> updateStaffById(String staffId, Staff staff) {
        Optional<Staff> staffDTO = staffRepository.findById(staffId);
        if (staffDTO.isPresent()) {
            staffDTO.get().setId(staff.getId());
            staffDTO.get().setAbout(staff.getAbout());
            staffDTO.get().setAvailability(staff.getAvailability());
            staffDTO.get().setExperience(staff.getExperience());
            staffDTO.get().setName(staff.getName());
            staffDTO.get().setPhoneNumber(staff.getPhoneNumber());
            staffDTO.get().setUsername(staff.getUsername());
            staffDTO.get().setSpecification(staff.getSpecification());
            staffDTO.get().setPassword(staff.getPassword());
            staffDTO.get().setFacilityType(staff.getFacilityType());
            staffDTO.get().setType(staff.getType());
            staffDTO.get().setTimestamp(staff.getTimestamp());
            try {
                staffRepository.insert(staff);
            }catch (Exception e) {
                throw new ResourceException(e.getMessage());
            }
            return new ResponseEntity<>(staff, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(Response.error("updating"), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> deleteStaffById(String staffId) {
        Optional<Staff> getStaff = staffRepository.findById(staffId);
        if (getStaff.isPresent()) {
            staffRepository.delete(getStaff.get());
            return new ResponseEntity<>(Response.delete("Staff"), HttpStatus.OK);
        }
        return new ResponseEntity<>(Response.notFound(), HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<?> getStaffById(String staffId) {
        Optional<Staff> staffDTO = staffRepository.findById(staffId);
        if (staffDTO.isPresent()) {
            return new ResponseEntity<>(staffDTO.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(Response.notFound(), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> getAllStaff() {
        List<Staff> list = staffRepository.findAll();
        if (list.size() > 0) {
            return new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(Response.emptyList("Staff"), HttpStatus.NOT_FOUND);

        }
    }
}
