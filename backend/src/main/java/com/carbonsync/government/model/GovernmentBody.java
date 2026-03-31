package com.carbonsync.government.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO representing a government regulatory body on the platform
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GovernmentBody {
    private Long id;
    private String name;
    private String jurisdiction; // e.g. "Central", "Maharashtra"
    private String role;         // e.g. "Regulator", "Monitor"
}
