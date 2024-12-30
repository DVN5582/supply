package com.wecp.progressive.entity;

public class Product {
private int productid;
private int warehouseid;
private String productName;
private String productDescription;
private int quantity;
private Long price;
public Product() {
}
public Product(int productid, int warehouseid, String productName, String productDescription, int quantity,
        Long price) {
    this.productid = productid;
    this.warehouseid = warehouseid;
    this.productName = productName;
    this.productDescription = productDescription;
    this.quantity = quantity;
    this.price = price;
}
public int getProductid() {
    return productid;
}
public void setProductid(int productid) {
    this.productid = productid;
}
public int getWarehouseid() {
    return warehouseid;
}
public void setWarehouseid(int warehouseid) {
    this.warehouseid = warehouseid;
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
public Long getPrice() {
    return price;
}
public void setPrice(Long price) {
    this.price = price;
}



}