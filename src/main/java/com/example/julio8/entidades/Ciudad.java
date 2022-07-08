package com.example.julio8.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cities")
public class Ciudad {
    @Id
    @Column(name = "idCity")
    private int idCity; // ---> id_city
    private String name;
    private int idCountry;
    private int population;
    @ManyToOne
    @JoinColumn(name = "idCountry",updatable = false,insertable = false)
    private Pais pais;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
}
