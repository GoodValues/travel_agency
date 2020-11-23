package com.travel_agency.model.user;

public enum UserRoleNameEnum {

    ROLE_USER("User"),
    ROLE_ADMIN("Admin");


    private String message;

    UserRoleNameEnum(String message) {
        this.message = message;
    }
}
