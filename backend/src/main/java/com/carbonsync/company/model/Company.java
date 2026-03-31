package com.carbonsync.company.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO representing a registered company on the platform
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private Long id;
    private String name;
    private String industry;
    private Double emissionTarget; // tonnes CO₂e per year
}
