package com.redolf.developer.ecentials.controller;

import com.redolf.developer.ecentials.model.Staff;
import com.redolf.developer.ecentials.service.StaffServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@AllArgsConstructor
public class StaffController {

    private StaffServiceImp serviceImp;

    @GetMapping("/hello")
    private String hello(){
        return "Service is up an running";
    }

    @GetMapping("/{staffId}")
    private ResponseEntity<?> getStaffById(@PathVariable("staffId") String Id){
        return serviceImp.getStaffById(Id);
    }

    @GetMapping("/list")
    private ResponseEntity<?> getAllStaff(){
        return serviceImp.getAllStaff();
    }

    @PostMapping("/save")
    private ResponseEntity<?> createStaff(@RequestBody Staff staff){
        return serviceImp.createStaff(staff);
    }

    @PutMapping("/updateStaff/{staffId}")
    private ResponseEntity<?> updateStaffById(@PathVariable("staffId") String staffId, @RequestBody Staff staff){
        return serviceImp.updateStaffById(staffId,staff);
    }


    @DeleteMapping("/delete/{staffId}")
    private ResponseEntity<?> deleteStaffById(@PathVariable("staffId") String staffId){
        return serviceImp.deleteStaffById(staffId);
    }

}
