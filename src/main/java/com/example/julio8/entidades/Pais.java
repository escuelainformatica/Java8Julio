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
@Table(name = "Countries")
public class Pais {
    @Id
    private int idCountry;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

}
