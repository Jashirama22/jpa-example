package com.example.pruebaNahuel;

import jakarta.persistence.*;

@Entity
@Table(name = "tablaAutos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String manofactura;
    private Integer year;

    public Auto() {
    }

    public Auto(Long id, String modelo, String manofactura, Integer year) {
        this.id = id;
        this.modelo = modelo;
        this.manofactura = manofactura;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getManofactura() {
        return manofactura;
    }

    public void setManofactura(String manofactura) {
        this.manofactura = manofactura;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", manofactura='" + manofactura + '\'' +
                ", year=" + year +
                '}';
    }
}
