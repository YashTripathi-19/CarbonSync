package com.carbonsync.government.repository;

import com.carbonsync.government.model.GovernmentBody;
import java.util.List;
import java.util.Optional;

// Stub repository — extend JpaRepository<GovernmentBody, Long> when DB is wired
public interface GovernmentRepository {
    List<GovernmentBody> findAll();
    Optional<GovernmentBody> findById(Long id);
    GovernmentBody save(GovernmentBody body);
}
