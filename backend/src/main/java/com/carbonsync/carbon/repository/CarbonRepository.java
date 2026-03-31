package com.carbonsync.carbon.repository;

import com.carbonsync.carbon.model.CarbonEntry;
import java.util.List;
import java.util.Optional;

// Stub repository — extend JpaRepository<CarbonEntry, Long> when DB is wired
public interface CarbonRepository {
    List<CarbonEntry> findAll();
    List<CarbonEntry> findByCompanyId(Long companyId);
    Optional<CarbonEntry> findById(Long id);
    CarbonEntry save(CarbonEntry entry);
}
