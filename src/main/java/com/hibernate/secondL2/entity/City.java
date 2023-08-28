package com.hibernate.secondL2.entity;

import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.*;

@Entity
@Table( name = "city")
@Cacheable
@Cache( usage = CacheConcurrencyStrategy.READ_WRITE)
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private Long population;

}
