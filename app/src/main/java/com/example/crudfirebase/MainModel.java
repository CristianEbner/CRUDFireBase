package com.example.crudfirebase;



public class MainModel {
    String Nombre, Apellido, email, imgURl;

    public MainModel(String nombre, String apellido, String email, String imgURl) {
        Nombre = nombre;
        Apellido = apellido;
        this.email = email;
        this.imgURl = imgURl;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getImgURl() {
        return imgURl;
    }
    public void setImgURl(String imgURl) {
        this.imgURl = imgURl;
    }



}
