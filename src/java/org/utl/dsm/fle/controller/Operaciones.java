/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.fle.controller;

/**
 *
 * @author jonai
 */
public class Operaciones {
    public double distancia(double x1, double y1, double x2, double y2){
        double distancia = Math.abs((x1 - x2)) + Math.abs((y1 - y2));
        return distancia;
    }
    
    public double costoUnidad(double x1, double y1, double x2, double y2){
        double distancia = Math.abs((x1 - x2)) + Math.abs((y1 - y2));
        double costo;   
        if (distancia >= 0 && distancia < 200){
            costo = 0.85;
        return costo;}
        else if (distancia >=200 && distancia<500){
                costo = 0.78;
        return costo;}
        else {
                costo = 0.70;
        return costo;}
    }
    public double costoTotal(double distancia, double costoUnidad){
        double costoTotal = distancia * costoUnidad;
        return costoTotal;
    }
    public String tipoflete(double x1, double y1, double x2, double y2){
        double distancia = Math.abs((x1 - x2)) + Math.abs((y1 - y2));
        String tipoFlete;
        if (distancia >=0 && distancia<200){
            tipoFlete = "Corto";
        return tipoFlete;}
        else if (distancia >=200 && distancia<500){
                tipoFlete = "Intermedio";
                return tipoFlete;}
        else {
                tipoFlete = "Largo";
        return tipoFlete;}
    }
}
