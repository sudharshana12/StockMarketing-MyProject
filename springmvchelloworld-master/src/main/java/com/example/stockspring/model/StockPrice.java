package com.example.stockspring.model;


import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="stockpricedetail")
public class StockPrice {
	@Id
	@Column(name="stock_code")
	private int stockCode;
	
   @Column(name="stockexchange_id")
   private int stockExchange;
   @Column(name="current_price")
   private double currentPrice;
   @Column(name="date")
   private String date;
   @Column(name="time")
   private String time;
   
   @ManyToOne(cascade = CascadeType.ALL )
   @JoinColumn(name="company_code")
   public Company company;
   
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}

public int getStockExchange() {
	return stockExchange;
}
public void setStockExchange(int stockExchange) {
	this.stockExchange = stockExchange;
}
public double getCurrentPrice() {
	return currentPrice;
}
public void setCurrentPrice(double currentPrice) {
	this.currentPrice = currentPrice;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getStockCode() {
	return stockCode;
}
public void setStockCode(int stockCode) {
	this.stockCode = stockCode;
}
@Override
public String toString() {
	return "StockPrice [stockCode=" + stockCode + ", stockExchange="
			+ stockExchange + ", currentPrice=" + currentPrice + ", date=" + date + ", time=" + time + "]";
}

}
