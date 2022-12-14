package com.pp.helpdesk.model.company;

import com.pp.helpdesk.model.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String name;
    private String street;
    private String zipCode;
    private String country;
    private String nip;
    private String regon;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users;

    public Company(String name, String street, String zipCode, String country, String nip, String regon) {
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
        this.country = country;
        this.nip = nip;
        this.regon = regon;
    }

    public Company() {

    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
