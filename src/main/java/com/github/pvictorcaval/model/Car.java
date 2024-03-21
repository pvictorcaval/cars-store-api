package com.github.pvictorcaval.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Car extends PanacheEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    @Column(name="model_year")
    private LocalDate modelYear;

    @Column(name="model_fabrication")
    private LocalDate modelFabrication;

    @Column(name="created_date_time")
    private LocalDateTime createdDateTime;

    @Column(name="is_available_sale")
    private Boolean isAvailableSale;

    private BigDecimal price;
}
