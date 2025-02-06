package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.*;
=======
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

@Entity
public class Warehouse implements Comparable<Warehouse> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouseId;
    
<<<<<<< HEAD
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "supplierId")
    private Supplier supplier;
=======
    // @ManyToOne(cascade = CascadeType.MERGE)
    // @JoinColumn(name = "supplierId")
    private int supplierId;
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
    private String warehouseName;
    private String location;
    private int capacity;

<<<<<<< HEAD
    public Warehouse() {
    }

    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouseId;
        this.supplier.setSupplierId(supplierId);
=======
    public Warehouse() {}

    // Warehouse(int,int,java.lang.String,java.lang.String,int)
    

    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouseId;
        this.supplierId = supplierId;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }

    public Warehouse(int supplierId, String warehouseName, String location, int capacity) {
        this.supplierId = supplierId;
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

<<<<<<< HEAD
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
=======
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplier) {
        this.supplierId = supplier;
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
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
    public int compareTo(Warehouse otherWarehouse) {
<<<<<<< HEAD
        // Implement comparison logic based on warehouse capacity
        return Double.compare(otherWarehouse.getCapacity(), this.getCapacity());
=======
        return otherWarehouse.getCapacity() - this.getCapacity();
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
    }
}