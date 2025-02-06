package com.wecp.progressive.service;


import com.wecp.progressive.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

<<<<<<< HEAD
=======
import org.springframework.stereotype.Service;

>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
public interface SupplierService {
    List<Supplier> getAllSuppliers() throws SQLException;

    int addSupplier(Supplier supplier) throws SQLException;

    List<Supplier> getAllSuppliersSortedByName() throws SQLException;

    default public void emptyArrayList() {
    }

    //Do not implement these methods in SupplierServiceImplArraylist.java class
    default void updateSupplier(Supplier supplier) throws SQLException {
    }

    default void deleteSupplier(int supplierId) throws SQLException {
    }

    default Supplier getSupplierById(int supplierId) throws SQLException {
        return null;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
