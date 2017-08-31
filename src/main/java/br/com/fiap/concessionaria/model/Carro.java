package br.com.fiap.concessionaria.model;

import br.com.fiap.concessionaria.model.Fabricante;

import javax.persistence.*;


@Entity
@Table(name = "Carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String modelo;
    private int ano;

    @ManyToOne(targetEntity = Fabricante.class)
    @JoinColumn(name = "fabricante_id")
    private Fabricante fabricante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
