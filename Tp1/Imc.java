public class Imc{
    public static void main (String[]args){
        System.out.println("Calclulo de IMC");
      
        System.out.print("Ingrese su altura:");
        double altura=new java.util.Scanner(System.in).nextDouble();
        System.out.print("Ingrese su peso:");        
        double peso=new java.util.Scanner(System.in).nextDouble();
        double Imc=(peso/(altura*2));
       
        if(Imc<=15){
        System.out.print("Su imc es:" + Imc + "Delgadez muy severa");
        
        } 
         else if(Imc>15 && Imc<15.9 ){
            System.out.println("Su imc es de:"+ Imc + " Delgadez severa");
        }
        else if(Imc>=16 && Imc<18.4 ){
            System.out.println("Su imc es: "+ Imc + "Delgadez");
        }
        else if ( Imc>=18.5 && Imc<=24.9)
            System.out.println("Su IMC es:" + Imc + " Normal");
       
        else if (Imc>=25 && Imc<=29.9 ){
            System.out.println("Su imc es de:"+ Imc + " Sobrepeso");
        }
        else if(Imc>=30 && Imc<=39.9 ){
            System.out.println("Su imc es: "+ Imc + "Sobrepeso");
        }
        else{
            System.out.println("Su IMC es:" + Imc + " Obesidad morbida");
        }
        }
        }

    
