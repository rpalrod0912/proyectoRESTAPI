package com.example.proyectorestapi.controller;

import com.example.proyectorestapi.model.Product;
import com.example.proyectorestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    @ResponseStatus
    public Product createProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return service.findAllProducts();
    }

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable String productId){
        return service.getProductById(productId);
    }

    @GetMapping("/precio/{precio}")
    public List<Product> findProductUsingPrecio(@PathVariable int precio){
        return service.getProductByPrecio(precio);
    }
    @GetMapping("/nombre/{nombre}")
    public  List<Product> findProductUsingNombre(@PathVariable String nombre){
        return service.getProductByNombre(nombre);
    }

    @GetMapping("marca/{marca}")
    public List<Product> findProducstUsingMarca(@PathVariable String marca){
        return service.getProductByMarca(marca);
    }
    @PutMapping
    public Product modifyProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable String productId){
        return service.deleteProduct(productId);
    }


}
