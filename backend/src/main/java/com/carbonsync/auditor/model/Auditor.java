package com.carbonsync.auditor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO representing a certified auditor on the platform
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Auditor {
    private Long id;
    private String name;
    private String agencyName;
    private String certificationId;
}
