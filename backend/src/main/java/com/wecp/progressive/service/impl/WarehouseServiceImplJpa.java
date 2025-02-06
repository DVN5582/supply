package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.exception.NoWarehouseFoundForSupplierException;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.repository.ShipmentRepository;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Service
public class WarehouseServiceImplJpa implements WarehouseService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShipmentRepository shipmentRepository;

    private WarehouseRepository warehouseRepository;

    @Autowired
    public WarehouseServiceImplJpa(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
        return warehouseRepository.findAll();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
        return warehouseRepository.save(warehouse).getWarehouseId();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
        List<Warehouse> sortedWarehouses = warehouseRepository.findAll();
        Collections.sort(sortedWarehouses);
        return sortedWarehouses;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
        warehouseRepository.save(warehouse);
    }

    @Override
    public void deleteWarehouse(int warehouseId) throws SQLException {
        shipmentRepository.deleteByWarehouseId(warehouseId);
        productRepository.deleteByWarehouseId(warehouseId);
        warehouseRepository.deleteById(warehouseId);
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return warehouseRepository.findByWarehouseId(warehouseId);
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) throws NoWarehouseFoundForSupplierException {
        List<Warehouse> warehouseList = warehouseRepository.findAllBySupplier_SupplierId(supplierId);
        if (warehouseList.isEmpty()) {
            throw new NoWarehouseFoundForSupplierException("No warehouse found with the given supplier Id");
        }
        return warehouseList;
    }
=======
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;
@Service
public class WarehouseServiceImplJpa implements WarehouseService  {


    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplJpa (WarehouseDAOImpl warehouseDAO)  {
        this.warehouseDAO = warehouseDAO;
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        // TODO Auto-generated method stub
        return List.of();
    }
    
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}