
import java.util.Scanner;

// Fig. 3.13: Cuenta.java
// La clase Cuenta con un constructor para validar e
// inicializar la variable de instancia saldo de tipo double.

public class Cuenta
{   
   private double saldo; // variable de instancia que almacena el saldo
   // constructor  
   public Cuenta( double saldoInicial )
   {
      // valida que saldoInicial sea mayor que 0.0; 
      // si no lo es, saldo se inicializa con el valor predeterminado 0.0
      if ( saldoInicial > 0.0 ) 
         saldo = saldoInicial; 
   } // fin del constructor de Cuenta

   // abona (suma) un monto a la cuenta
   public void abonar( double monto )
   {      
      saldo = saldo + monto; // suma el monto al saldo 
   } // fin del m�todo abonar
   public String cargar( double monto){
       String mensaje ;
       if (saldo<monto) {
           this.saldo=saldo;
           mensaje="El monto a retirar excede al saldo Existente";
       }else{
           this.saldo=saldo-monto;
           mensaje="Transaccion exitosa ";
       }
      return mensaje;
      
   }
   // devuelve el saldo de la cuenta
   public double obtenerSaldo()
   {
      return saldo; // proporciona el valor de saldo al m�todo que hizo la llamada
   } // fin del m�todo obtenerSaldo
   public String toString() {
       return "Saldo de la cuenta: " + obtenerSaldo();
   }//Fin Método toString
} // fin de la clase Cuenta

class TestCuenta{
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta( 50.00 ); // crea objeto Cuenta
        Cuenta cuenta2 = new Cuenta( -7.53 ); // crea objeto Cuenta

        // muestra el saldo inicial de cada objeto
        System.out.printf( "Saldo de cuenta1: $%.2f\n", 
        cuenta1.obtenerSaldo() );
        System.out.printf( "Saldo de cuenta2: $%.2f\n\n", 
        cuenta2.obtenerSaldo() );

        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        double montoDeposito; // deposita el monto escrito por el usuario

        System.out.println( "Escriba el monto a depositar para cuenta1: " ); // indicador
        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf( "sumando %.2f al saldo de cuenta1\n", 
        montoDeposito );
        cuenta1.abonar( montoDeposito ); // suma al saldo de cuenta1
        // muestra los saldos
        System.out.printf( "Saldo de cuenta1: $%.2f\n", 
        cuenta1.obtenerSaldo() );


        System.out.println( "Escriba el monto a depositar para cuenta2: " ); // indicador
        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf( "sumando %.2f al saldo de cuenta2\n", 
        montoDeposito );
        cuenta2.abonar( montoDeposito ); // suma al saldo de cuenta2
        // muestra los saldos
        System.out.printf( "Saldo de cuenta2: $%.2f\n", 
        cuenta2.obtenerSaldo() );

        System.out.print( "Escriba el monto a retirar para cuenta1: " ); // indicador
        double montoRetiro = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf( "restando %.2f al saldo de cuenta1\n", 
        montoRetiro );
        System.out.println(cuenta1.cargar( montoRetiro )); // suma al saldo de cuenta1

        // muestra los saldos
        System.out.printf( "Saldo de cuenta1: $%.2f\n", 
        cuenta1.obtenerSaldo() );


        System.out.print( "Escriba el monto a retirar para cuenta2: " ); // indicador
        montoRetiro = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf( "restando %.2f al saldo de cuenta2\n\n", montoRetiro );
        System.out.println(cuenta2.cargar( montoRetiro )); // suma al saldo de cuenta2
        // muestra los saldos
        System.out.printf( "Saldo de cuenta2: $%.2f\n \n", 
        cuenta2.obtenerSaldo() );
      
        //Empleando toString
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}