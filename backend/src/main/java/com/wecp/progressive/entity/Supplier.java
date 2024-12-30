package com.wecp.progressive.entity;

public class Supplier implements Comparable <Supplier> {
private int supplierId;
private String supplierName;
private String email;
private String phone;
private String address;
private String password;
private String role;

public Supplier(){

}
public Supplier(int supplierId, String supplierName, String email, String phone, String address, String password,
        String role)  {
    this.supplierId = supplierId;
    this.supplierName = supplierName;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.password = password;
    this.role = role;
}
public int getSupplierId() {
    return supplierId;
}
public void setSupplierId(int supplierId) {
    this.supplierId = supplierId;
}
public String getSupplierName() {
    return supplierName;
}
public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getRole() {
    return role;
}
public void setRole(String role) {
    this.role = role;
}
@Override
public int compareTo(Supplier o) {
    return this.getSupplierName().compareTo(o.getSupplierName());
}



}