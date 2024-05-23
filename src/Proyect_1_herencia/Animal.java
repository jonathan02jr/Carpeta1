package Proyect_1_herencia;

public class Animal {
    String nombre;
    String sexo;
    String tipo;

    public Animal(String nombre, String sexo, String tipo){
        this.nombre=nombre;
        this.sexo=sexo;
        this.tipo=tipo;
    }

    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sexo: "+sexo);
        System.out.println("Tipo(domestico/salvaje): "+tipo);
    }
}

class Perro extends Animal{
    String raza;
    String color;

    public Perro(String nombre, String sexo, String tipo, String raza, String color){
        super(nombre, sexo, tipo);
        this.raza=raza;
        this.color=color;
    }

    public void infoPerro(){
        System.out.println("---- INFORMACIÓN DEL PERRO -----");
        super.mostrar();
        System.out.println("Raza: "+raza);
        System.out.println("Color: "+color);
    }
}

class PerroGuardia extends Perro{
    String tamanio;
    int anio;
    String direccion;

    public PerroGuardia(String nombre, String sexo, String tipo, String raza, String color, String tamanio, int anio, String direccion ){
        super(nombre, sexo, tipo, raza, color);
        this.tamanio=tamanio;
        this.anio=anio;
        this.direccion=direccion;
    }

    public void infoPGuardia(){
        System.out.println("---- INFROMACION DEL PERRO GUARDIAN -----");
        super.infoPerro();
        System.out.println("Tamaño: "+tamanio);
        System.out.println("Año: "+anio);
        System.out.println("Direccion: "+direccion);
    }
}