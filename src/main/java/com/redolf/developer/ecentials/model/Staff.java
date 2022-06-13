package com.redolf.developer.ecentials.model;

import com.redolf.developer.ecentials.facility.FacilityType;
import com.redolf.developer.ecentials.type.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(value = "", description = "This is the model is used to perform operations on staff")
public class Staff {

    @Id
    @ApiModelProperty(dataType = "String" ,notes = "staff id, auto generated")
    private String id;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Facility id")
    private String facilityId;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Facility type")
    private FacilityType facilityType;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Employee id")
    private String employeeId;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff name")
    private String name;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff specification")
    private String specification;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff experience")
    private String experience;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff imageUrl")
    private String imageUrl;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff phone number")
    private String phoneNumber;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff about")
    private String about;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Type")
    private Type type;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff availability")
    private String availability;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff username")
    private String username;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff password")
    private String password;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Timestamp for staff create")
    private LocalTime timestamp;
}
