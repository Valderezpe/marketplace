package com.backend.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "estado")
@Data
public class estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String sigla;
    @Temporal(TemporalType.TIMESTAMP)
    private String dataInicio;
    @Temporal(TemporalType.TIMESTAMP)
    private String dataAtualizacao;
}
