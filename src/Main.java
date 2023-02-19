public class Main {
    public static void main(String[] args) {

        //Instanciar - crear un objeto
        Coche coche = new Coche();
        System.out.println(coche.numeroPuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche(4, 200);
        System.out.println(coche2.numeroPuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);

    }
}

class Coche {

    //Propiedades que son variables
    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    //Contructor. Inicializar variables y propiedades

    public Coche(){
        numeroPuertas = 2;  //Siempre que se cree un coche, el constructor le asigna 5 puertas
        velocidadMaxima = 100;
        System.out.println("Estoy en el constructor vacio");
    }

    //Sobrecarga de constructores, pero se activa diferente
    public Coche(int numeroPuertas, int velocidadMaxima){
        this.numeroPuertas = numeroPuertas;  //Siempre que se cree un coche, el constructor le asigna 5 puertas
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor con parametros");
    }

    //Funciones. Funciones dentro de una clase, métodos
    public void acelerar() {
        velocidadActual +=15;
    }
    public void desacelerar() {}
}