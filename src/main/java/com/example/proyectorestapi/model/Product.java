package com.example.proyectorestapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.util.List;

@Document(collection="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String productId;
    private String nombre;
    private Float oferta;
    private String descripcion;
    private Float precio;

    private String tipo;

    private String categoria;

    private String utilidad;

    private String marca;

    private String sexo;

    private List color;

    private List talla;

    private String imagen;


}
