package com.travel_agency.dto;

import com.travel_agency.model.user.UserRoleNameEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private String confirmPassword;
    private UserRoleNameEnum roleName;
    private List<TripDTO> trips = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoleNameEnum getRoleName() {
        return roleName;
    }

    public void setRoleName(UserRoleNameEnum roleName) {
        this.roleName = roleName;
    }

    public List<TripDTO> getTrips() {
        return trips;
    }

    public void setTrips(List<TripDTO> trips) {
        this.trips = trips;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
