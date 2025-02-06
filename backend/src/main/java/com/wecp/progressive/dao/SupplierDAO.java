package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

public interface SupplierDAO {
    int addSupplier(Supplier supplier) throws SQLException;
    Supplier getSupplierById(int supplierId) throws SQLException;
    void updateSupplier(Supplier supplier) throws SQLException;
<<<<<<< HEAD
    void deleteSupplier(int supplierId) throws SQLException;
    List<Supplier> getAllSuppliers() throws SQLException;
=======
    void deleteSupplier(int supplierId) throws SQLException ;
    List<Supplier> getAllSuppliers()  throws SQLException;
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}
