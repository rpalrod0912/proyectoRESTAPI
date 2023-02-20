package com.example.proyectorestapi.service;

import com.example.proyectorestapi.model.Product;
import com.example.proyectorestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired




    private ProductRepository repository;

    //CRUD CREATE,READ,UPDATE,DELETE

    public Product addProduct(Product product){

        product.setProductId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(product);
    }

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(String productId){
        return repository.findById(productId).get();
    }

    public List<Product> getProductByPrecio(int precio){
        return repository.findByPrecio(precio);
    }

    public  List<Product> getProductByNombre(String nombre){
        return repository.findByNombre(nombre);
    }


    public Product updateProduct(Product productRequest){
        //obtener docs de la DB
        //Dar valor de lar equisit al existete documento/entidad/objeto
        Product existingProduct=repository.findById(productRequest.getProductId()).get();
        existingProduct.setDescripcion(productRequest.getDescripcion());
        existingProduct.setNombre(productRequest.getNombre());
        existingProduct.setCategoria(productRequest.getCategoria());
        existingProduct.setPrecio(productRequest.getPrecio());
        existingProduct.setColor(productRequest.getColor());
        existingProduct.setMarca(productRequest.getMarca());
        existingProduct.setTalla(productRequest.getTalla());
        existingProduct.setTipo(productRequest.getTipo());
        existingProduct.setUtilidad(productRequest.getUtilidad());
        return repository.save(existingProduct);
    }

    public String deleteProduct(String productId){
        repository.deleteById(productId);
        return productId+" producto eliminado de API ";
    }
}
