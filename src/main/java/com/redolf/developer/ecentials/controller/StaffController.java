package com.redolf.developer.ecentials.controller;

import com.redolf.developer.ecentials.methods.StaffService;
import com.redolf.developer.ecentials.model.Staff;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class StaffController {

    private StaffService serviceImp;

    @ApiOperation(value = "Finds a staff based on the the id passed", notes = "Returns a JSON object if available")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "You are not allowed to access this staff"),
            @ApiResponse(code = 403, message = "The server understands the request but refuses to authorize it."),
            @ApiResponse(code = 404, message = "The url does not exist or maybe under upgrade"),
            @ApiResponse(code = 500, message = "The server encountered an unexpected condition that prevented it from fulfilling the request")
    })
    @GetMapping("/getStaffById/{staffId}")
    private ResponseEntity<?> getStaffById(@PathVariable("staffId") String Id){
        return this.serviceImp.getStaffById(Id);
    }

    @ApiOperation(value = "Returns list of all the staff members", notes = "Returns a list JSON objects")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "You are not allowed to access all staff members"),
            @ApiResponse(code = 403, message = "The server understands the request but refuses to authorize it."),
            @ApiResponse(code = 404, message = "The url does not exist or maybe under upgrade"),
            @ApiResponse(code = 500, message = "The server encountered an unexpected condition that prevented it from fulfilling the request")
    })
    @GetMapping("/getAllStaff/list")
    private ResponseEntity<?> getAllStaff(){
        return serviceImp.getAllStaff();
    }

    @ApiOperation(value = "Create a new staff", notes = "Returns a JSON object")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "You are not allowed to create staff"),
            @ApiResponse(code = 403, message = "The server understands the request but refuses to authorize it."),
            @ApiResponse(code = 404, message = "The url does not exist or maybe under upgrade"),
            @ApiResponse(code = 500, message = "The server encountered an unexpected condition that prevented it from fulfilling the request")
    })
    @PostMapping("/createStaff")
    private ResponseEntity<?> createStaff(@RequestBody Staff staff){
        return this.serviceImp.createStaff(staff);
    }

    @ApiOperation(value = "Updates a staff based on Id", notes = "Returns an updated JSON object")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "You are not allowed to perform this action on this staff member"),
            @ApiResponse(code = 403, message = "The server understands the request but refuses to authorize it."),
            @ApiResponse(code = 404, message = "The url does not exist or maybe under upgrade"),
            @ApiResponse(code = 500, message = "The server encountered an unexpected condition that prevented it from fulfilling the request")
    })
    @PutMapping("/updateStaff/{staffId}")
    private ResponseEntity<?> updateStaffById(@PathVariable("staffId") String staffId, @RequestBody Staff staff){
        return this.serviceImp.updateStaffById(staffId,staff);
    }

    @ApiOperation(value = "Delete staff based on Id", notes = "Returns http response of 200")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "You are not allowed to remove this staff member"),
            @ApiResponse(code = 403, message = "The server understands the request but refuses to authorize it."),
            @ApiResponse(code = 404, message = "The url does not exist or maybe under upgrade"),
            @ApiResponse(code = 500, message = "The server encountered an unexpected condition that prevented it from fulfilling the request")
    })
    @DeleteMapping("/deleteStaffById/{staffId}")
    private ResponseEntity<?> deleteStaffById(@PathVariable("staffId") String staffId){
        return serviceImp.deleteStaffById(staffId);
    }

}
