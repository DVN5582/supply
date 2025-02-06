package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
<<<<<<< HEAD
    int addProduct(Product accounts) throws SQLException;
=======
    int addProduct(Product product) throws SQLException;
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
    Product getProductById(int productId) throws SQLException;
    void updateProduct(Product product) throws SQLException;
    void deleteProduct(int productId) throws SQLException;
    List<Product> getAllProducts() throws SQLException;
}