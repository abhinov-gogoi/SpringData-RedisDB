package com.learning.controller;

import com.learning.entity.Product;
import com.learning.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product")
public class MainController {

    @Autowired
    private ProductDao dao;

    @GetMapping("/test")
    public String testWorks() {
        return "Test works";
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return dao.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id) {
        return dao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return dao.deleteProduct(id);
    }


}
