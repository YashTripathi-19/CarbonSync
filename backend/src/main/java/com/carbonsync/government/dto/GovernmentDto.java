package com.carbonsync.government.dto;

// DTO for transferring government body data between API layer and service layer
public class GovernmentDto {

    private Long id;
    private String name;
    private String country;
    private String jurisdiction;

    public GovernmentDto() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getJurisdiction() { return jurisdiction; }
    public void setJurisdiction(String jurisdiction) { this.jurisdiction = jurisdiction; }
}
