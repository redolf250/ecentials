package com.redolf.developer.ecentials.response;

import org.springframework.stereotype.Component;

@Component
public class Response {

    public static String create(String message){
        return message+" was created successfully";
    }
    public static String error(String message){
        return "An error occurred while "+message+" staff";
    }

    public static String notFound(){
        return "Staff was not found";
    }

    public static String emptyList(String message){
        return message+"list is empty";
    }

    public static String delete(String message){
        return message+" was deleted successfully";
    }
}
