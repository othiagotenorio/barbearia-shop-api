package com.barbearia.shop.entity;

import com.barbearia.shop.enums.TipoServico;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private TipoServico tipo;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorAtual;

    @Column(nullable = false)
    private Boolean ativo;
}
