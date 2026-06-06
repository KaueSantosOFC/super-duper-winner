package com.example.demo.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.example.demo.Enums.TipoEntrada;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entrada {

    @Id
    private UUID id;
    private TipoEntrada tipoEntrada;
    private BigDecimal valor;
    private LocalDate dataEntrada;

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }
    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    
    
}
