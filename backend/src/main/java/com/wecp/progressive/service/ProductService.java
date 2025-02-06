package com.wecp.progressive.service;

import com.wecp.progressive.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws SQLException;

    Product getProductById(int productId) throws SQLException;

<<<<<<< HEAD
    int addProduct(Product Product) throws SQLException;

    void updateProduct(Product Product) throws SQLException;
=======
    int addProduct(Product product) throws SQLException;

    void updateProduct(Product product) throws SQLException;
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

    void deleteProduct(int productId) throws SQLException;

    //Do not implement these methods in ProductServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Product> getAllProductByWarehouse(int warehouseId) throws SQLException {
=======
    default List<Product> getAllProductByWarehouse(int warehouseId) {
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
        return null;
    }
}
