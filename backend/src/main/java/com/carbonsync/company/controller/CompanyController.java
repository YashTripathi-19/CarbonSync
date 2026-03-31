package com.carbonsync.company.controller;

import com.carbonsync.company.model.Company;
import com.carbonsync.company.service.CompanyService;
import com.carbonsync.utils.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD endpoints for companies under /api/companies
@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper<List<Company>>> getAll() {
        return ResponseEntity.ok(ResponseWrapper.success(companyService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper<Company>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(ResponseWrapper.success(companyService.getById(id)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper<Company>> create(@RequestBody Company company) {
        return ResponseEntity.ok(ResponseWrapper.success(companyService.create(company)));
    }
}
