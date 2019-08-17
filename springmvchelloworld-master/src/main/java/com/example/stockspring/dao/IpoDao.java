package com.example.stockspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.stockspring.model.IPOsPlanned;

public interface IpoDao extends JpaRepository<IPOsPlanned,Integer>{

}
