package com.saraFarina.bicicorunaia.model;

import java.util.ArrayList;

public class Estacion {

    private int id;
    private String nombre;
    private boolean activa;
    private int capacidadEstacion;
    private ArrayList<Bicicleta> bicisEnEstacion;

    //GOOGLE MAPS
    private double latitud;
    private double longitud;

    //CONSTRUCTOR. La lista de bicis almacenadas no la recibo por parametro, por eso no esta en los parentesis.
    //La crea la propia estacion al crearse un objeto Estacion.

    public Estacion(int id, String nombre, boolean activa, int capacidadEstacion, double latitud, double longitud){
        this.id = id;
        this.nombre = nombre;
        this.activa = activa;
        this.capacidadEstacion = capacidadEstacion;
        this.bicisEnEstacion = new ArrayList<>();
        //API GOOGLE MAPS
        this.latitud = latitud;
        this.longitud = longitud;
    }

    //GETTERS
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public boolean isActiva(){
        return this.activa;
    }
    public int getCapacidadEstacion(){
        return this.capacidadEstacion;
    }
    public ArrayList<Bicicleta> getBicisEnEstacion(){
        return this.bicisEnEstacion;
    }
    public double getLatitud(){
        return this.latitud;
    }
    public double getLongitud(){
        return this.longitud;
    }

    //METODOS ESTACION
    public int getHuecosLibres(){
        return this.capacidadEstacion - this.bicisEnEstacion.size(); //devuelve el nº de bicis enganchadas
    }

    public int getBicisDisponibles(){
        int contador = 0;

        // Equivale a  for(int i=0; i < bicisEnEstacion.size(); i++)
        for(Bicicleta bici : this.bicisEnEstacion){
            if(bici.estaDisponible()){
                contador++;
            }
        }

        return contador;
    }

    public int getBicisAveriadas(){
        int contador = 0;

        for(Bicicleta bici : this.bicisEnEstacion){
            if(bici.isAveriada()){
                contador++;
            }
        }

        return contador;
    }

    public int getHuecosLibres(){
        return this.capacidadEstacion - this.getBicisEnEstacion().size();
    }


}

