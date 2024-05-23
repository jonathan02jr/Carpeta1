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