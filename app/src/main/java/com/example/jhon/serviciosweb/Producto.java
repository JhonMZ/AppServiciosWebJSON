package com.example.jhon.serviciosweb;

/**
 * Created by jhon on 24/02/15.
 */
public class Producto {
    private String codigo;
    private String Nombre;
    private String Precio;
    private String Imagen;

    public Producto(String codigo, String nombre, String imagen, String precio) {
        this.codigo = codigo;
        Nombre = nombre;
        Imagen = imagen;
        Precio = precio;
    }

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }
}
