package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService {
    private static List<Warehouse>warehouseList;
    private WarehouseDAO warehouseDAO;
    
    public WarehouseServiceImplArraylist(WarehouseDAO warehouseDAO) {
        this.warehouseDAO = warehouseDAO;
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseList;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouseList.add(warehouse);
        return warehouseList.size();

    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse>sortedWarehouses=warehouseList;
        sortedWarehouses.sort(Comparator.comparing(Warehouse::getCapacity));
        return sortedWarehouses;
    }
    @Override
    public void emptyArrayList(){
        warehouseList=new ArrayList<>();
    }

}