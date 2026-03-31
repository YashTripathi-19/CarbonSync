package com.carbonsync.government.service;

import com.carbonsync.exception.ResourceNotFoundException;
import com.carbonsync.government.model.GovernmentBody;
import org.springframework.stereotype.Service;

import java.util.List;

// Returns hardcoded stub data until JPA repository is wired
@Service
public class GovernmentService {

    private static final List<GovernmentBody> STUB = List.of(
        GovernmentBody.builder().id(1L).name("Ministry of Environment").jurisdiction("Central").role("Regulator").build(),
        GovernmentBody.builder().id(2L).name("Maharashtra Pollution Control Board").jurisdiction("Maharashtra").role("Monitor").build()
    );

    public List<GovernmentBody> getAll() {
        return STUB;
    }

    public GovernmentBody getById(Long id) {
        return STUB.stream()
                .filter(g -> g.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("GovernmentBody", id));
    }

    public GovernmentBody create(GovernmentBody body) {
        // TODO: persist via repository
        body.setId((long) (STUB.size() + 1));
        return body;
    }
}
