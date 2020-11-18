package com.project.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String orderId;
    private String date;
    private String quantity;
    private String sales;
    private String mode;
    private String profit;
    private String unitPrice;
    private String customerName;
    private String customerSegment;
    private String productCategory;

   public Orders(String orderId, String date, String quantity, String sales, String mode, String profit, String unitPrice, String customerName, String customerSegment, String productCategory) {
        this.orderId = orderId;
        this.date = date;
        this.quantity = quantity;
        this.sales = sales;
        this.mode = mode;
        this.profit = profit;
        this.unitPrice = unitPrice;
        this.customerName = customerName;
        this.customerSegment = customerSegment;
        this.productCategory = productCategory;
    }

/*
    public Orders() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public long getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getDate() {
        return date;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getSales() {
        return sales;
    }

    public String getMode() {
        return mode;
    }

    public String getProfit() {
        return profit;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public String getProductCategory() {
        return productCategory;
    }*/
}
