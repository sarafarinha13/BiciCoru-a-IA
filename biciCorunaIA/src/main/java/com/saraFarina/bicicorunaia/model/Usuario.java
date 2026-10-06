package com.saraFarina.bicicorunaia.model;

import java.time.LocalDate;

import static java.time.temporal.TemporalQueries.localDate;

public class Usuario {

    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private String dni;
    private boolean cuentaActiva;
    private TipoSuscripcion tipoSuscripcion;
    private LocalDate fechaFinSuscripcion;

    public Usuario( int id, String nombre, String apellidos, String email, String dni, TipoSuscripcion tipoSuscripcion, LocalDate fechaFinSuscripcion ){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.dni = dni;
        this.cuentaActiva = true;
        this.tipoSuscripcion = tipoSuscripcion;

        this.fechaFinSuscripcion = fechaFinSuscripcion;

        //Calculamos directamente el tipo para acabar la suscripción en funcion del tipo que se elija al crear el usuario

        switch(tipoSuscripcion) {
            case MENSUAL -> this.fechaFinSuscripcion = LocalDate.now().plusMonths(1);
            case ANUAL -> this.fechaFinSuscripcion = LocalDate.now().plusYears(1);
            case OCASIONAL -> this.fechaFinSuscripcion = null;
        }
    }

    //GETTERS
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getEmail(){
        return this.email;
    }
    public String getDni(){
        return this.dni;
    }
    public boolean isCuentaActiva(){
        return this.cuentaActiva;
    }
    public TipoSuscripcion getTipoSuscripcion() {
        return this.tipoSuscripcion;
    }
    public LocalDate getFechaFinSuscripcion(){
        return this.fechaFinSuscripcion;
    }
}
