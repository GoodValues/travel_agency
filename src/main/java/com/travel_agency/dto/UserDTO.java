package com.travel_agency.dto;

import com.travel_agency.model.address.Address;
import com.travel_agency.model.reservation.Reservation;
import com.travel_agency.model.user.Role;
import com.travel_agency.model.user.UserRoleNameEnum;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private UserRoleNameEnum roleName;
    private Set<Role> roles;
    private List<TripDTO> trips = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private Address address;

    public UserDTO(Long id, String firstName, String lastName, String userName, String email, String password, String confirmPassword, UserRoleNameEnum roleName, Set<Role> roles, List<TripDTO> trips, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.roleName = roleName;
        this.roles = roles;
        this.trips = trips;
        this.address = address;
    }


    public UserDTO() {
    }

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
