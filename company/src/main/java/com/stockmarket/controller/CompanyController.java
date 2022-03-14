package com.stockmarket.controller;


import com.stockmarket.entities.Company;
import com.stockmarket.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @GetMapping("getAllCompanies")
    // @Cacheable(value = "company")
    public List<Company> getAllAirlines() {
        return this.companyService.getCompanies();
    }

    @PostMapping("saveCompanies")
    // @Cacheable(value = "company")
    public void saveCompanies(@RequestBody List<Company> companies) {
        this.companyService.saveCompanies(companies);
    }

}
