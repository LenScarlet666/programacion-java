public class Imc {
    public static void main(String[] args) {
        System.out.println("Calclulo de imc");

        System.out.print("Ingrese su altura en cm:");
        double altura = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Ingrese su peso en Kg:");
        double peso = new java.util.Scanner(System.in).nextDouble();
        double imc = (peso / (altura / 100 * altura / 100));

        if (imc <= 15)                          System.out.println("Su imc es de:" + imc + "Delgadez muy severa");

        if (imc > 15 && imc < 15.9)             System.out.println("Su imc es de: " + imc + "Delgadez severa");

        if (imc >= 16 && imc < 18.4)            System.out.println("Su imc es de: " + imc + "Delgadez");

        if (imc >= 18.5 && imc <= 24.9)         System.out.println("Su imc es de: " + imc + "Normal");

        if (imc >= 25 && imc <= 29.9)           System.out.println("Su imc es de: " + imc + "Sobrepeso");

        if (imc >= 30 && imc <= 39.9)           System.out.println("Su imc es de: " + imc + "Obesidad");
        
        if (imc >= 40)                          System.out.println("Su imc es de: " + imc + "Obesidad morbida");
                                                
    }
}
