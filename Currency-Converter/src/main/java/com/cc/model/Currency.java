package com.cc.model;

public class Currency {
 private double usd;
 private double rupee;
 private double euro;
 private double pound;

public double getEuro() {
	return euro;
}

public void setEuro(double euro) {
	this.euro = euro;
}

public double getUsd() {
	return usd;
}

public double getPound() {
	return pound;
}

public void setPound(double pound) {
	this.pound = pound;
}

public void setUsd(double usd) {
	this.usd = usd;
}

public double getRupee() {
	return rupee;
}

public void setRupee(double rupee) {
	this.rupee = rupee;
}
}
