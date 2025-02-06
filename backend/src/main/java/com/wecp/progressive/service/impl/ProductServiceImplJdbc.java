package com.wecp.progressive.service.impl;

<<<<<<< HEAD
=======
import java.sql.SQLException;
import java.util.List;

>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public class ProductServiceImplJdbc implements ProductService {

    private ProductDAO productDAO;

    public ProductServiceImplJdbc(ProductDAO productDAO) {
=======
public class ProductServiceImplJdbc implements ProductService  {

    private ProductDAO productDAO;

    public ProductServiceImplJdbc (ProductDAO productDAO) {
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        return productDAO.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
        return productDAO.getProductById(productId);
    }

    @Override
    public int addProduct(Product product) throws SQLException {
        return productDAO.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        productDAO.updateProduct(product);
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
<<<<<<< HEAD
        productDAO.deleteProduct(productId);
    }
=======
       productDAO.deleteProduct(productId);
    }


>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}