package com.example.sprinbgoot.project.demo.dao;

import com.example.sprinbgoot.project.demo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    public List<Company> findAllByOrderByCompanyNameAsc();
}
