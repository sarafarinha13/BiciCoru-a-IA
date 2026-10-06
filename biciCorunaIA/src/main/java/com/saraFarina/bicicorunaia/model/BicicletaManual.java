package com.saraFarina.bicicorunaia.model;

public class BicicletaManual extends Bicicleta{

    public BicicletaManual(int id, Estacion estacionActual){
        super(id, estacionActual);
    }

    //MÉTODO ABSTRACTO HEREDADO DEL PADRE
    @Override
    public String getTipo() {
        return "Manual";
    }
}
