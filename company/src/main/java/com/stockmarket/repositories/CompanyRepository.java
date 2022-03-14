package com.stockmarket.repositories;

import com.stockmarket.entities.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {

    List<Company> findByCompanyCode(String companyCode);

}
