package com.example.demo.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.example.demo.Enums.Categorias;
import com.example.demo.Enums.Tipos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Saida {

    @Id
    private UUID id;
    private Categorias categoria;
    private Tipos tipo;
    private String descricao;
    private BigDecimal valor;
    private LocalDate dataSaida;
    
    public Categorias getCategoria() {
        return categoria;
    }
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    public Tipos getTipo() {
        return tipo;
    }
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    
}
