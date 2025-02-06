package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    void deleteBySupplierId(@Param("supplierId") int supplierId);

    Supplier findBySupplierId(@Param("supplierId") int supplierId);

    Supplier findByUsername(String username);

    Supplier findByEmail(String email);
=======

public interface SupplierRepository {
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}
