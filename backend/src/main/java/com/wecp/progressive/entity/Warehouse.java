package com.wecp.progressive.entity;

public class Warehouse implements Comparable <Warehouse> {
private int warehouseid;
private int supplierId;
private String warehouseName;
private String location;
private int capacity;
public Warehouse() {
}
public Warehouse(int warehouseid, int supplierId, String warehouseName, String location, int capacity)  {
    this.warehouseid = warehouseid;
    this.supplierId = supplierId;
    this.warehouseName = warehouseName;
    this.location = location;
    this.capacity = capacity;
}
public int getWarehouseid() {
    return warehouseid;
}
public void setWarehouseid(int warehouseid) {
    this.warehouseid = warehouseid;
}
public int getSupplierId() {
    return supplierId;
}
public void setSupplierId(int supplierId) {
    this.supplierId = supplierId;
}
public String getWarehouseName() {
    return warehouseName;
}
public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
}
public String getLocation() {
    return location;
}
public void setLocation(String location) {
    this.location = location;
}
public int getCapacity() {
    return capacity;
}
public void setCapacity(int capacity) {
    this.capacity = capacity;
}
@Override
public int compareTo(Warehouse o) {
    return Integer.compare(o.getCapacity(), this.getCapacity());
}


}