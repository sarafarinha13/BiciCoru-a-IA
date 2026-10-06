package com.saraFarina.bicicorunaia.model;


public abstract class Bicicleta {
    private int id;
    private Estacion estacionActual;
    private boolean enUso;
    private boolean averiada;
    private String descripcionAveria;

    // CONSTRUCTOR. Como una bici nueva se crea aparcada en una estacion, nace sin uso, sin averia y sin descripcion.
    public Bicicleta(int id, Estacion estacionActual){
        this.id = id;
        this.estacionActual = estacionActual;
        this.enUso = false;
        this.averiada = false;
        this.descripcionAveria = null;
    }

    //GETTERS
    public int getId(){
        return this.id;
    }
    public Estacion getEstacionActual(){
        return this.estacionActual;
    }
    public boolean isEnUso(){
        return this.enUso;
    }
    public boolean isAveriada(){ return this.averiada; }
    public String getDescripcionAveria(){
        return this.descripcionAveria;
    }


    //MÉTODOS BICICLETA

    //MÉTODOS DE CONSULTA. Busca que devuelvas información
    public boolean estaDisponible(){
        return !this.enUso && !this.averiada && this.estacionActual != null;
    }

    //MÉTODOS DE ACCIÓN. Busca que cambies el estado de la bicicleta (suele ser void)
    public void ponerEnUso(){
        this.estacionActual = null;
        this.enUso = true;
    }

    public void aparcarEn(Estacion estacion){
        this.estacionActual = estacion;
        this.enUso = false;
    }

    public void marcarAveriada(String descripcionAveria){
        this.averiada = true;
        this.descripcionAveria = descripcionAveria;
    }

    public void reparar(){
        this.averiada = false;
        this.descripcionAveria = null;
    }

    //MÉTODOS ABSTRACTOS
    public abstract String getTipo();

}
