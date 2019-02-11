/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Random;

/**
 *
 * @author andrei
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Vehiculo() {

    }

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return matricula + " " + marca + " " + modelo + " " + color + " " + tarifa + " " + disponible;
    }

    public void vehiculoAleatorio() {
        Random aleatorio = new Random();
        String[] matricula = {"123R", "456T", "789V", "23456RU", "32556PI"};
        String[] marca = {"Seat", "audi", "bmw", "mercedes", "pegout"};
        String[] modelo = {"badman", "A1", "X7X", "B101", "Leon"};
        String[] color = {"rojo", "blanco", "amarillo", "azul", "negro"};
        Double[] tarifa = {1.7, 5.5, 24.3, 2.5, 9.9};
        Boolean[] disponible = {true, false};


        String matriculaSelecionada = matricula[aleatorio.nextInt(matricula.length)];
        System.out.println(matriculaSelecionada);
        
        String marcaSelecionada = marca[aleatorio.nextInt(marca.length)];
        System.out.println(marcaSelecionada);
        
        String modeloSelecionada = modelo[aleatorio.nextInt(modelo.length)];
        System.out.println(modeloSelecionada);
        
        String colorSelecionada = color[aleatorio.nextInt(color.length)];
        System.out.println(colorSelecionada);
        
        Double tarifaSelecionada = tarifa[aleatorio.nextInt(tarifa.length)];
        System.out.println(tarifaSelecionada);

        Boolean disponibleSelecionada = disponible[aleatorio.nextInt(disponible.length)];
        System.out.println(disponibleSelecionada);

    }

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.vehiculoAleatorio();
    }
}
