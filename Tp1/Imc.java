public class Imc {
    public static void main(String[] args) {
        System.out.println("Calclulo de IMC");

        System.out.print("Ingrese su altura en cm:");
        double altura = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Ingrese su peso en Kg:");
        double peso = new java.util.Scanner(System.in).nextDouble();
        double imc = (peso / (altura / 100 * altura / 100));

        if (imc <= 15)                          System.out.println("Su imc es de:" + imc + "Delgadez muy severa");

        if (imc > 15 && Imc < 15.9)             System.out.println("Su IMC es de: " + imc + "Delgadez severa");

        if (imc >= 16 && Imc < 18.4)            System.out.println("Su IMC es de: " + imc + "Delgadez");

        if (imc >= 18.5 && Imc <= 24.9)         System.out.println("Su IMC es de: " + imc + "Normal");

        if (imc >= 25 && Imc <= 29.9)           System.out.println("Su IMC es de: " + imc + "Sobrepeso");

        if (imc >= 30 && Imc <= 39.9)           System.out.println("Su IMC es de: " + imc + "Obesidad");
        
        else {
                                                System.out.println("Su IMC es de: " + imc + "Obesidad morbida");

        }
    }
}
