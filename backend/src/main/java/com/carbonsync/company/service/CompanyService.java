package com.carbonsync.company.service;

import com.carbonsync.company.model.Company;
import com.carbonsync.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

// Returns hardcoded stub data until JPA repository is wired
@Service
public class CompanyService {

    private static final List<Company> STUB = List.of(
        Company.builder().id(1L).name("Tata Steel Ltd").industry("Steel").emissionTarget(50000.0).build(),
        Company.builder().id(2L).name("Infosys Ltd").industry("Technology").emissionTarget(12000.0).build()
    );

    public List<Company> getAll() {
        return STUB;
    }

    public Company getById(Long id) {
        return STUB.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Company", id));
    }

    public Company create(Company company) {
        // TODO: persist via repository
        company.setId((long) (STUB.size() + 1));
        return company;
    }
}
