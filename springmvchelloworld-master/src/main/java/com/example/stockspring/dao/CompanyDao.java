package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.example.stockspring.model.Company;

public interface CompanyDao extends JpaRepository<Company,Integer> {
  
	/* public Company insertCompany(Company company) throws SQLException, ClassNotFoundException;
	public Company updateCompany(Company company) throws SQLException, ClassNotFoundException;
	public List<Company> getAllCompany(); */
	
	
	
}
