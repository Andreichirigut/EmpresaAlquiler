/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author andrei
 */
public class EmpresaAlquiler {
    // Atributos de la empresa

    private String cif;
    private String nombre;
    private String paginaWeb;
    /* Atributos para controlar el total de clientes que tiene la
    empresa y array de almacenamiento para los objetos Cliente */
    private int totalClientes;
    private Cliente[] clientes;
    /* Atributos para controlar el total de vehiculos disponibles en
    alquiler que tiene la empresa y array de almacenamiento para los objetos
    Vehiculo */
    private int totalVehiculos;
    private Vehiculo[] vehiculos;
    /* Atributos para controlar el histórico de alquileres: total de
    alquileres realizados y array de almacenamiento para los objetos
    8 VehiculoAlquilado */
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;

    // se omiten los métodos ‘get’ y ‘set’ de la clase
    /* Constructor parametrizado donde se establece que el total de clientes
    será 50, igual que el total de vehiculos disponibles. El histórico de
    vehiculos puede contener hasta 100 elementos */
    EmpresaAlquiler(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        // Incialmente no hay clientes creados en la empresa
        this.totalClientes = 0;
        this.clientes = new Cliente[50]; // apuntan a null
        // Incialmente no hay vehiculos creados en la empresa
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50]; // apuntan a null
        // Incialmente no hay histórico de alquileres en la empresa
        this.totalAlquileres = 0;
        this.alquileres = new VehiculoAlquilado[100]; // apuntan a null

    }

    /*registrarCliente(Cliente nuevo). Añade un nuevo cliente a la lista de
    clientes de la empresa. El método registrarCliente(Cliente cliente)
    almacena un objeto de la clase Cliente en la última posición útil del array
    clientes, dada por la variable totalClientes y a continuación incrementa
    la variable totalClientes.*/
    public void registrarCliente(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;
    }

    /*registrarVehiculo(Vehiculo n u e v o ). Añade un vehículo al catálogo
    de vehículos de la empresa. El método registrarVehiculo(Vehiculo vehiculo)
    almacena un objeto de la clase Vehiculo en la última posición del array
    vehiculos, dada por la variable totalVehiculos y a continuación incrementa
    la variable totalVehiculos.*/
    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;
    }

    /*imprimirClientes(). Muestra la relación de clientes de la empresa. Este
    método recorre el array clientes y va mostrando los datos de cada
    cliente.*/
    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre\n");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i].toString());
        }
    }

    /*imprimirVehiculos(). Muestra el catálogo de vehículos de la empresa,
    recorriendo el array vehiculos y llamando al método getAtributos() de cada
    uno .*/
    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n ");
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos[i].toString());
        }
    }
    

}
