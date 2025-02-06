package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

=======
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

<<<<<<< HEAD
public class SupplierServiceImplJdbc implements SupplierService {
=======
import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJdbc implements SupplierService  {
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

    private SupplierDAO supplierDAO;

    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
        return supplierDAO.getAllSuppliers();
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        return supplierDAO.addSupplier(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException {
        List<Supplier> sortedSuppliers = supplierDAO.getAllSuppliers();
        if (sortedSuppliers != null) {
            sortedSuppliers.sort(Comparator.comparing(Supplier::getSupplierName)); // Sort by supplier name
        }
        return sortedSuppliers;
    }

    @Override
    public void updateSupplier(Supplier supplier) throws SQLException {
        supplierDAO.updateSupplier(supplier);
    }

    @Override
    public void deleteSupplier(int supplierId) throws SQLException {
        supplierDAO.deleteSupplier(supplierId);
    }

    @Override
    public Supplier getSupplierById(int supplierId) throws SQLException {
        return supplierDAO.getSupplierById(supplierId);
    }
<<<<<<< HEAD
}
=======
    
}

>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
