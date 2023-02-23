/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.fle.model;

/**
 *
 * @author jonai
 */
public class Flete {

    private double distancia;
    private double costoUnidad;
    private double costoTotal;
    private String tipoFlete;
    private coordenadas origen;
    private coordenadas destino;

    public Flete() {
    }

    public Flete(double distancia, double costoUnidad, double costoTotal, String tipoFlete, coordenadas origen, coordenadas destino) {
        this.distancia = distancia;
        this.costoUnidad = costoUnidad;
        this.costoTotal = costoTotal;
        this.tipoFlete = tipoFlete;
        this.origen = origen;
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getTipoFlete() {
        return tipoFlete;
    }

    public void setTipoFlete(String tipoFlete) {
        this.tipoFlete = tipoFlete;
    }

    public coordenadas getOrigen() {
        return origen;
    }

    public void setOrigen(coordenadas origen) {
        this.origen = origen;
    }

    public coordenadas getDestino() {
        return destino;
    }

    public void setDestino(coordenadas destino) {
        this.destino = destino;
    }
    
    
    
}
