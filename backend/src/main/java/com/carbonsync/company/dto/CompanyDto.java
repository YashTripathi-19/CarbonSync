package com.carbonsync.company.dto;

// DTO for transferring company data between API layer and service layer
public class CompanyDto {

    private Long id;
    private String name;
    private String registrationNumber;
    private String industry;
    private String country;

    public CompanyDto() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public String getIndustry() { return industry; }
    public void setIndustry(String industry) { this.industry = industry; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
