package com.carbonsync.government.controller;

import com.carbonsync.government.model.GovernmentBody;
import com.carbonsync.government.service.GovernmentService;
import com.carbonsync.utils.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD endpoints for government bodies under /api/government
@RestController
@RequestMapping("/api/government")
public class GovernmentController {

    private final GovernmentService governmentService;

    public GovernmentController(GovernmentService governmentService) {
        this.governmentService = governmentService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper<List<GovernmentBody>>> getAll() {
        return ResponseEntity.ok(ResponseWrapper.success(governmentService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper<GovernmentBody>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(ResponseWrapper.success(governmentService.getById(id)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper<GovernmentBody>> create(@RequestBody GovernmentBody body) {
        return ResponseEntity.ok(ResponseWrapper.success(governmentService.create(body)));
    }
}
