package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;

import com.example.stockspring.model.Company;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
    CompanyDao companydao;
	@Override
	public Company insertCompany(Company company) throws SQLException, ClassNotFoundException {
		companydao.save(company);
		return null;
	}

	@Override
	public Company updateCompany(Company company) throws ClassNotFoundException, SQLException {
		//companydao.updateCompany(company);
		return null;
	}

	@Override
	public List<Company> getAllCompanyList() {
		return companydao.findAll();
		
	}

}
