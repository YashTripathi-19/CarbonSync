package com.carbonsync.carbon.service;

import com.carbonsync.carbon.model.CarbonEntry;
import com.carbonsync.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Returns hardcoded stub data until JPA repository is wired
@Service
public class CarbonService {

    private static final List<CarbonEntry> STUB = List.of(
        CarbonEntry.builder().id(1L).companyId(1L).emissionValue(48200.0).creditBalance(1800.0).reportDate("2025-03-31").build(),
        CarbonEntry.builder().id(2L).companyId(2L).emissionValue(11500.0).creditBalance(500.0).reportDate("2025-03-31").build()
    );

    public List<CarbonEntry> getAll() {
        return STUB;
    }

    public List<CarbonEntry> getByCompany(Long companyId) {
        return STUB.stream()
                .filter(e -> e.getCompanyId().equals(companyId))
                .collect(Collectors.toList());
    }

    public CarbonEntry getById(Long id) {
        return STUB.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("CarbonEntry", id));
    }

    public CarbonEntry create(CarbonEntry entry) {
        // TODO: persist via repository
        entry.setId((long) (STUB.size() + 1));
        return entry;
    }
}
