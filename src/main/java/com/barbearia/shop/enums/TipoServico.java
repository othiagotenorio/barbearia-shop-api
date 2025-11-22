package com.barbearia.shop.enums;

public enum TipoServico {
    CORTE("Corte de cabelo"),
    SOBRANCELHA("Sobrancelha"),
    PINTURA("Pintar cabelo"),
    FACIAL("Limpeza facial"),
    BARBA("Barba");

    private final String descricao;

    TipoServico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
