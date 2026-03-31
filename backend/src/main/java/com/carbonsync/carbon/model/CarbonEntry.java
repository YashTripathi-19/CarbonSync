package com.carbonsync.carbon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO representing a single carbon emissions submission by a company
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarbonEntry {
    private Long id;
    private Long companyId;
    private Double emissionValue;  // tonnes CO₂e
    private Double creditBalance;  // carbon credits held
    private String reportDate;     // ISO-8601 date string e.g. "2025-03-31"
}
