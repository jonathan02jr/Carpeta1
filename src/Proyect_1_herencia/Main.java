package Proyect_1_herencia;

public class Main {
    public static void main(String[] args){

        Animal animal1 = new Animal("Leon","Macho","Salvaje");

        System.out.println("Informacion de la clase Animal");
        animal1.mostrar();

        Perro animal2 = new Perro("Espanky","Macho","Domestico","Schnauzer","Negro");
        System.out.println("\nInformacion de la subclase Perros");
        animal2.infoPerro();

        PerroGuardia animal3 = new PerroGuardia("Royer","Macho","Domestico","Pitbull","Blanco","Mediano",3,"Tumbaco El Arenal");
        System.out.println("\nInformacion de la subclase Perro guardia de la subclase Perros");
        animal3.infoPGuardia();
    }
}
