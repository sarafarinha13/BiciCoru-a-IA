package com.saraFarina.bicicorunaia.model;

public class BicicletaElectrica extends Bicicleta {

    private int nivelBateria;

    public BicicletaElectrica(int id, Estacion estacionActual){
        super(id, estacionActual);
        this.nivelBateria = 100;
    }

    //GETTERS
    public int getNivelBateria(){
        return this.nivelBateria;
    }

    //METODO BICI ELECTRICA
    public void actualizarBateria(int bateriaActual){
        if(bateriaActual < 0 || bateriaActual > 100){
            this.marcarAveriada("La batería funciona mal");
            return;
        }
        this.nivelBateria = bateriaActual;
    }

    //METODO ABSTRACTO HEREDADO DEL PADRE
    @Override
    public String getTipo(){
        return "Electrica";
    }

}
