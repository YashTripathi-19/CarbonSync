package com.carbonsync.auditor.controller;

import com.carbonsync.auditor.model.Auditor;
import com.carbonsync.auditor.service.AuditorService;
import com.carbonsync.utils.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD endpoints for auditors under /api/auditors
@RestController
@RequestMapping("/api/auditors")
public class AuditorController {

    private final AuditorService auditorService;

    public AuditorController(AuditorService auditorService) {
        this.auditorService = auditorService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper<List<Auditor>>> getAll() {
        return ResponseEntity.ok(ResponseWrapper.success(auditorService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper<Auditor>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(ResponseWrapper.success(auditorService.getById(id)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper<Auditor>> create(@RequestBody Auditor auditor) {
        return ResponseEntity.ok(ResponseWrapper.success(auditorService.create(auditor)));
    }
}
