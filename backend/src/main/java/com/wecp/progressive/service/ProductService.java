package com.wecp.progressive.service;

import com.wecp.progressive.entity.Product;

<<<<<<< HEAD
=======
import java.sql.SQLDataException;
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
import java.sql.SQLException;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws SQLException;

<<<<<<< HEAD
    Product getProductById(int productId) throws SQLException;

    int addProduct(Product product) throws SQLException;

    void updateProduct(Product product) throws SQLException;

    void deleteProduct(int productId) throws SQLException;
=======
    Product getProductById(int productId)throws SQLException;

    int addProduct(Product product)throws SQLException;

    void updateProduct(Product product)throws SQLException;

    void deleteProduct(int productId)throws SQLException;
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405

    //Do not implement these methods in ProductServiceImplJdbc.java class
    default List<Product> getAllProductByWarehouse(int warehouseId) {
        return null;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
