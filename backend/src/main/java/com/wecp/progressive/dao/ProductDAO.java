package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
    int addProduct(Product product) throws SQLException;
    Product getProductById(int productId) throws SQLException;
<<<<<<< HEAD
    void updateProduct(Product product) throws SQLException;
    void deleteProduct(int productId) throws SQLException;
    List<Product> getAllProducts() throws SQLException;
=======
    void updateProduct(Product product)throws SQLException;
    void deleteProduct(int productId)throws SQLException;
    List<Product> getAllProducts()throws SQLException;
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
}