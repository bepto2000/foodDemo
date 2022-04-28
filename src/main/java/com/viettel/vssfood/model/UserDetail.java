package com.viettel.vssfood.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.viettel.vssfood.dto.UserDto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class UserDetail implements UserDetails {

    private String fullName;

    private String email;

    private String phoneNumber;

    private String address;
    private String username;

    @JsonIgnore
    private String password;

    private Date createdAt;

    private int status;

    private Collection<? extends GrantedAuthority> authority;

    public UserDetail(String fullName, String email, String phoneNumber, String address, String username, String password, Date createdAt, int status, Collection<? extends GrantedAuthority> authority) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.username = username;
        this.password = password;
        this.createdAt = createdAt;
        this.status = status;
        this.authority = authority;
    }

    public static UserDetail getInstance(UserDto user) {
        Collection<? extends GrantedAuthority> authority = Collections.singleton(new SimpleGrantedAuthority(user.getRoleName()));
        return new UserDetail(
                user.getFullName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getAddress(),
                user.getUsername(),
                user.getPassword(),
                user.getCreatedAt(),
                user.getStatus(),
                authority);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authority;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
