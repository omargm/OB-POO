public class Polimorfismos {
    public static void main(String[] args) {
        Nave nave = new Nave();
        nave.sumaNumeros(4.12, 4.8);
    }
}
 class Ranfla {
     public void diHola(){
         System.out.println("Hola!!");
     }
 }

 class Nave extends Ranfla {

     //Esto es polimorfismo, porque es la misma funcion, pero hace algo diferente a la clase padre
     public void diHola() {
         System.out.println("Nave");
     }

     public int sumaNumeros(int a, int b){
         System.out.println("Soy el sumanumeros de int");
         return a + b;
     }
     public float sumaNumeros(float a, float b){
         System.out.println("Soy el sumanumeros de float");
         return a + b * (float)9.0;
     }
     public void sumaNumeros(double a, double b){
         System.out.println("Soy el sumanumeros de double");
         System.out.println("El resultado es: " + (a+b));
     }

 }
