package com.bootcamp20.afp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Afp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;
    private int dni;
    private Double amountavailable;
    private Timestamp time;
    private String nroCta;
}
