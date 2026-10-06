package com.saraFarina.bicicorunaia.model;

import java.time.LocalDateTime;

public class Viaje {

    private int id;
    private Usuario usuario;
    private Bicicleta bicicleta;
    private Estacion estacionSalida;
    private Estacion estacionLlegada;
    private LocalDateTime horaSalida;
    private LocalDateTime horaLlegada;

    public Viaje(int id, Usuario usuario, Bicicleta bicicleta, Estacion estacionSalida){
        this.id = id;
        this.usuario = usuario;
        this.bicicleta = bicicleta;
        this.estacionSalida = estacionSalida;

        //Hora se calcula una vez se crea el viaje
        this.horaSalida = LocalDateTime.now();

        this.horaLlegada = null;
        this.estacionLlegada = null;
    }

    //GETTERS
    public int getId(){ return this.id; }
    public Usuario getUsuario(){ return this.usuario; }
    public Bicicleta getBicicleta(){ return this.bicicleta; }
    public Estacion getEstacionSalida(){ return this.estacionSalida; }
    public Estacion getEstacionLlegada(){ return this.estacionLlegada; }
    public LocalDateTime getHoraSalida(){ return this.horaSalida; }
    public LocalDateTime getHoraLlegada(){ return this.horaLlegada; }

    //MÉTODOS CLASE VIAJE

    public void finalizarViaje(Estacion estacionLlegada){
        this.estacionLlegada = estacionLlegada;
        this.horaLlegada = LocalDateTime.now();
    }

}
