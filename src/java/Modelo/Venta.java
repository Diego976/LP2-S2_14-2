/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author w10
 */
public class Venta {
    private int idventa;
    private String nombre;
    private double utilidad;
    private String vendedor;
    private double precio;

    public Venta() {
    }

    public Venta(int idventa, String nombre, double utilidad, String vendedor, double precio) {
        this.idventa = idventa;
        this.nombre = nombre;
        this.utilidad = utilidad;
        this.vendedor = vendedor;
        this.precio = precio;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    
    
}
