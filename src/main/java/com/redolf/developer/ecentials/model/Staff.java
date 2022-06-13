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

import javax.validation.constraints.NotNull;
import java.time.LocalTime;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(description = "This is the model is used to perform operations on staff")

public class Staff {

    @Id
    @ApiModelProperty(dataType = "String" ,notes = "staff id, auto generated")
    private String id;

    @NotNull(message = "Facility Id must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Facility id")
    private String facilityId;

    @NotNull(message = "Facility type must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Facility type")
    private FacilityType facilityType;

    @NotNull(message = "Employee must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Employee id")
    private String employeeId;

    @NotNull(message = "Name must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff name")
    private String name;

    @NotNull(message = "Specification must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff specification")
    private String specification;

    @NotNull(message = "Experience must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff experience")
    private String experience;

    @NotNull(message = "Image must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff imageUrl")
    private String imageUrl;

    @NotNull(message = "Phone number must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff phone number")
    private String phoneNumber;

    @NotNull(message = "About must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff about")
    private String about;

    @NotNull(message = "Type must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Type")
    private Type type;

    @NotNull(message = "Availability must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff availability")
    private String availability;

    @NotNull(message = "Username must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff username")
    private String username;

    @NotNull(message = "Password must not be null")
    @ApiModelProperty(required = true,dataType = "String" ,notes = "Staff password")
    private String password;

    @ApiModelProperty(required = true,dataType = "String" ,notes = "Timestamp for staff create")
    private LocalTime timestamp;
}
