package com.carbonsync.auditor.service;

import com.carbonsync.auditor.model.Auditor;
import com.carbonsync.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

// Returns hardcoded stub data until JPA repository is wired
@Service
public class AuditorService {

    private static final List<Auditor> STUB = List.of(
        Auditor.builder().id(1L).name("Priya Sharma").agencyName("GreenAudit India").certificationId("GA-2024-001").build(),
        Auditor.builder().id(2L).name("Rahul Mehta").agencyName("EcoVerify Ltd").certificationId("EV-2024-042").build()
    );

    public List<Auditor> getAll() {
        return STUB;
    }

    public Auditor getById(Long id) {
        return STUB.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Auditor", id));
    }

    public Auditor create(Auditor auditor) {
        // TODO: persist via repository
        auditor.setId((long) (STUB.size() + 1));
        return auditor;
    }
}
