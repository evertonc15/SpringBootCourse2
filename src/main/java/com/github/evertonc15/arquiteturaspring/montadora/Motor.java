package com.github.evertonc15.arquiteturaspring.montadora;

public class Motor {

    private String Modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipo;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
