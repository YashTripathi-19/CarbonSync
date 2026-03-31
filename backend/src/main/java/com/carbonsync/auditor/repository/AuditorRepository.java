package com.carbonsync.auditor.repository;

import com.carbonsync.auditor.model.Auditor;
import java.util.List;
import java.util.Optional;

// Stub repository — extend JpaRepository<Auditor, Long> when DB is wired
public interface AuditorRepository {
    List<Auditor> findAll();
    Optional<Auditor> findById(Long id);
    Auditor save(Auditor auditor);
}
