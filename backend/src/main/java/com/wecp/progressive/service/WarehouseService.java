package com.wecp.progressive.service;

import com.wecp.progressive.entity.Warehouse;

import java.sql.SQLException;
import java.util.List;

<<<<<<< HEAD
=======
import org.springframework.stereotype.Service;

>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
public interface WarehouseService {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse) throws SQLException;

    List<Warehouse> getWarehousesSortedByCapacity() throws SQLException;

<<<<<<< HEAD
    default public void emptyArrayList() {
=======
    default public void emptyArrayList() throws SQLException {
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
    default void updateWarehouse(Warehouse warehouse) throws SQLException {
    }

    default void deleteWarehouse(int warehouseId) throws SQLException {
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
    default List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
        return null;
    }
}
