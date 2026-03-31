package com.carbonsync.carbon.controller;

import com.carbonsync.carbon.model.CarbonEntry;
import com.carbonsync.carbon.service.CarbonService;
import com.carbonsync.utils.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD endpoints for carbon entries under /api/carbon
@RestController
@RequestMapping("/api/carbon")
public class CarbonController {

    private final CarbonService carbonService;

    public CarbonController(CarbonService carbonService) {
        this.carbonService = carbonService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper<List<CarbonEntry>>> getAll() {
        return ResponseEntity.ok(ResponseWrapper.success(carbonService.getAll()));
    }

    @GetMapping("/company/{companyId}")
    public ResponseEntity<ResponseWrapper<List<CarbonEntry>>> getByCompany(@PathVariable Long companyId) {
        return ResponseEntity.ok(ResponseWrapper.success(carbonService.getByCompany(companyId)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper<CarbonEntry>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(ResponseWrapper.success(carbonService.getById(id)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper<CarbonEntry>> create(@RequestBody CarbonEntry entry) {
        return ResponseEntity.ok(ResponseWrapper.success(carbonService.create(entry)));
    }
}
