package com.vegamex.crudbasico;

import java.util.Calendar;

public class Contacto {
    int id;
    String usuario;
    String email;
    String telefono;
    long fechaNacimiento;

    public Contacto() {
    }

    public Contacto(int id, String usuario, String email, String telefono, long fechaNacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(long fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}