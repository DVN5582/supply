package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;
import org.springframework.stereotype.Service;
=======
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

<<<<<<< HEAD
@Service
public class WarehouseServiceImplArraylist implements WarehouseService {

    private static List<Warehouse> warehouseList = new ArrayList<>();
=======
import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

@Service
public class WarehouseServiceImplArraylist implements WarehouseService {

    private static List<Warehouse> warehouseList;

    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplArraylist (WarehouseDAOImpl warehouseDAO)  {
        this.warehouseDAO = warehouseDAO;
    }
 
    public WarehouseServiceImplArraylist() {
        warehouseList = new ArrayList<>();
    }
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

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
        List<Warehouse> sortedWarehouses = warehouseList;
<<<<<<< HEAD
        sortedWarehouses.sort(Comparator.comparing(Warehouse::getCapacity)); // Sort by supplier name
=======
        sortedWarehouses.sort(Comparator.comparing(Warehouse::getCapacity));
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
        return sortedWarehouses;
    }

    @Override
    public void emptyArrayList() {
        warehouseList = new ArrayList<>();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
