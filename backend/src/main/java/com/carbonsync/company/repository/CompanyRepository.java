package com.carbonsync.company.repository;

import com.carbonsync.company.model.Company;
import java.util.List;
import java.util.Optional;

// Stub repository — extend JpaRepository<Company, Long> when DB is wired
public interface CompanyRepository {
    List<Company> findAll();
    Optional<Company> findById(Long id);
    Company save(Company company);
}
