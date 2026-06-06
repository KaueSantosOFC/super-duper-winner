package com.example.demo.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nome;
    LocalDate dataInicio;
    LocalDate dataFim;
    List<Entrada> entradas;
    List<Saida> saidas;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public List<Entrada> getEntradas() {
        return entradas;
    }
    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
    public List<Saida> getSaidas() {
        return saidas;
    }
    public void setSaidas(List<Saida> saidas) {
        this.saidas = saidas;
    }

    
}
