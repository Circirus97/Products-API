package com.riwi.products.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data /* Anotacion para generar getter y setter */
@AllArgsConstructor /* Anotacion para crear contructor lleno */
@NoArgsConstructor /* Anotacion para crear contructor vacio */
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer quantity;

    private Double price;

}
