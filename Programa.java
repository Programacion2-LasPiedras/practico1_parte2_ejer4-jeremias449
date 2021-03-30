import java.util.Scanner;

public class Programa {
  

    //escribe aquí tú código
      
      double inicio() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Bienvenido al programa!");
      System.out.println("A continuacion...");
      System.out.println("");
      System.out.println("Ingrese un valor para 'a'");
      double a = sc.nextDouble();
      return a;
    }
      

      double inicio1(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un valor para 'b'");
      double b = sc.nextDouble();
      return b;
    }

      double inicio2() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un valor para 'c'");
      double c = sc.nextDouble();
      return c;
    }
    
    void iniciar(){
    double a = inicio();
    double b = inicio1();
    double c = inicio2();
    menu(a,b,c);
    }
  
  

     static void menu(double a, double b, double c){
       int menu;
       do{
         Scanner sc=new Scanner(System.in);
	       System.out.println("");  
	       System.out.println("1. El cuadrado y la raíz cuadrada de cada uno de los valor."); 
	       System.out.println("2. Bhaskara, (ax2 + bx + c).");
	       System.out.println("3. El mayor de los tres números ingresados");
	       System.out.println("4. Circunferencia (a,b,c son 3 valores distintos)");
	       System.out.println("5. Exit");
	       System.out.println("");
	       System.out.println("Ingrese una opcion");
	       System.out.println("");
	       menu = sc.nextInt(); 
	            
	      switch(menu) 
	      {
          case 1:
          case1(a,b,c);
          break;

          case 2:
          case2(a,b,c);

          case 3:
          case3(a,b,c);

          case 4:
          case4(a,b,c);

          case 5:
          case5(a,b,c);


       }

     }while(menu!=5);
     }

     static void case1(double a, double b, double c){
      System.out.println("");
	    System.out.println("a=" + a);
	    System.out.println("b=" + b);
	    System.out.println("c=" + c);
	    System.out.println("");
	    System.out.println("El cuadrado del valor " + a + " es " + Math.pow(a,2));
	    System.out.println("El cuadrado del valor " + b + " es " + Math.pow(b,2));
	    System.out.println("El cuadrado del valor " + c + " es " + Math.pow(c,2));
	    System.out.println("");
	    System.out.println("La raíz cuadrada de " + a + " es " + Math.sqrt(a));
	    System.out.println("La raíz cuadrada de " + b + " es " + Math.sqrt(b));
	    System.out.println("La raíz cuadrada de " + c + " es " + Math.sqrt(c));
     }

     static void case2(double a, double b, double c){
       System.out.println("");
	    System.out.println("a =" + a);
	    System.out.println("b =" + b);
	    System.out.println("c =" + c);
	    System.out.println("");
	    bhaskara(a,b,c);
	  }
	  static void bhaskara(double a, double b, double c){
      // (ax2 + bx + c)
	    double determinante = Math.pow(b,2) - ((4*a)*c);
	    if (determinante > 0){
	      double bhaskara1=(-(b)+Math.sqrt(determinante))/(2*a);
	      double bhaskara2=(-(b)-Math.sqrt(determinante))/(2*a);
	    }

	    if (determinante == 0){
	      double bhaskara1=(-(b))/(2*a);
	    }

	    if (determinante < 0){
	      System.out.println("No se puede hacer raíz cuadrada de un número negativo, no seas tan pelotudo");
	    }
	  }

    static void case3(double a, double b, double c){
      System.out.println("");
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	    System.out.println("c = " + c);
	    System.out.println("");
	    double elmasgrande3 = Math.max(a,b);
	    System.out.println("El número mayor entre los tres valores es " + Math.max(elmasgrande3,c));
    }

    static void case4(double a, double b, double c){
      System.out.println("");
	    System.out.println("a=" + a);
	    System.out.println("b=" + b);
	    System.out.println("c=" + c);
	    System.out.println("");
	    System.out.println("La circunferencia tomando el valor 'a' como radio es " + Math.PI*(a*2));
	    System.out.println("La circunferencia tomando el valor 'b' como radio es " + Math.PI*(b*2));
	    System.out.println("La circunferencia tomando el valor 'c' como radio es " + Math.PI*(c*2));
    }

    static void case5(double a, double b, double c){
      System.out.println("Gracias por utilizar el programa,espero que te haya servido. Un saludo!");
    }
  }



	//Escribe aquí el resto de métodos que necesites para resolver el problema
	


	
