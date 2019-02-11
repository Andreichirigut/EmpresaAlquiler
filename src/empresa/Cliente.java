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
public class Cliente {

    private String nif;
    private String nombre;
    private String apellidos;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Cliente(){
        
    }
    
    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return nif + " " + apellidos + " " + nombre;
    }

    public void clienteAleatorio() {
        Random aleatorio = new Random();
        String[] nif = {"12345567X", "123424357O", "321454687Y", "3452154Q", "23457986P"};
        String[] nombre = {"Esteban", "Jose", "Antonio", "Alvaro", "Daniel"};
        String[] apellido = {"Lopez", "Sánchez", "Roman", "Rodriguez", "Ramirez"};
        
        String nifSelecionada = nif[aleatorio.nextInt(nif.length)];
        System.out.println(nifSelecionada);
        
        String nombreSelecionada = nombre[aleatorio.nextInt(nombre.length)];
        System.out.println(nombreSelecionada);
        
        String apellidoSelecionada = apellido[aleatorio.nextInt(apellido.length)];
        System.out.println(apellidoSelecionada);
    }
    
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.clienteAleatorio();
    }
}
