package com.travel_agency.model.user;

public enum UserRoleNameEnum {

    USER("USER"),
    ADMIN("ADMIN");


    private String message;

    UserRoleNameEnum(String message) {
        this.message = message;
    }
}
