package com.wecp.progressive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    Integer productId;
    Integer warehouseId;
    String productName;
    String productDescription;
    int quantity;
    long price;
    
    public Product(int productId, int warehouseId, String productName, String productDescription, int quantity,
            long price) {
=======
    int productId;
    int warehouseId;
    String productName;
    String productDescription;
    int quantity;
    double price;
    
    public Product () {}
    public Product(int productId, int warehouseId, String productName, String productDescription, int quantity,
    double price) {
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
        this.productId = productId;
        this.warehouseId = warehouseId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }
<<<<<<< HEAD
    public Product () {}
    public Product(int warehouseId, String productName, String productDescription, int quantity,
    long price) {
        this.warehouseId = warehouseId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }
=======
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
<<<<<<< HEAD
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
=======
    public double getPrice() {
        return price;
    }
    public void setPrice(Long price) {
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
        this.price = price;
    }
    


    
}