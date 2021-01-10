package com.travel_agency.model.user;

public enum UserRoleNameEnum {

    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN");


    private String message;

    UserRoleNameEnum(String message) {
        this.message = message;
    }
}
