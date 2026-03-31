package com.carbonsync.auditor.dto;

// DTO for transferring auditor data between API layer and service layer
public class AuditorDto {

    private Long id;
    private String name;
    private String email;
    private String certificationNumber;
    private String organization;

    public AuditorDto() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCertificationNumber() { return certificationNumber; }
    public void setCertificationNumber(String certificationNumber) { this.certificationNumber = certificationNumber; }
    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }
}
