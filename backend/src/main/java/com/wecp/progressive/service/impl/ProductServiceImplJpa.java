package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
<<<<<<< HEAD
import com.wecp.progressive.repository.ProductRepository;
=======
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJpa implements ProductService  {

<<<<<<< HEAD
    private ProductRepository productRepository;

    public ProductServiceImplJpa (ProductRepository productRepository) {
        this.productRepository = productRepository;
=======
    private ProductDAO productDAO;

    public ProductServiceImplJpa (ProductDAO productDAO) {
        this.productDAO = productDAO;
>>>>>>> 2877139363ec064b7e0a8480defa7b1dcabcf405
    }
   
    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Product getProductById(int productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int addProduct(Product product) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void updateProduct(Product product) {
        // TODO Auto-generated method stub
    }

    @Override
    public void deleteProduct(int productId) {
        // TODO Auto-generated method stub
    }

}