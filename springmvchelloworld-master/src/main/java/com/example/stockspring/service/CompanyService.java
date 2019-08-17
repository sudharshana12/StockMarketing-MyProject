package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyService {
	public Company insertCompany(Company company) throws SQLException, ClassNotFoundException;
    public Company updateCompany(Company company) throws ClassNotFoundException, SQLException;
	public List<Company> getAllCompanyList();
}
