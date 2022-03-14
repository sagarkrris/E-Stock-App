package com.stockmarket.repositories;

import java.util.List;
import com.stockmarket.entities.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {

    List<Stock> findByCompanyCode(String companyCode);

}
