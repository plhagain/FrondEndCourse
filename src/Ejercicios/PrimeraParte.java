package Ejercicios;

public class PrimeraParte {


    public static void main(String[] args) {
        int ResultadoSuma = 0 ;
        ResultadoSuma = Sumar( 10, 20, 30 );
        System.out.println(ResultadoSuma);
        //......
       // Coche miCoche = new Coche();
        Coche miCoche = new Coche();
        prueba MiPrueba = new prueba();
        System.out.println(MiPrueba.numero);
        MiPrueba.verNumero();
        System.out.println(MiPrueba.numero);



        miCoche.SumarPuertas();
        System.out.println(miCoche.numPuertas);

    }
    public static  int Sumar(int a, int b, int c){
        return a + b + c;
        // la función Sumar devuelve un Entero - pasaje por valor

    }
     static class Coche{
        public int numPuertas = 1;
        public void  SumarPuertas(){
            numPuertas++;
        }
        // ver porque debo declarar Static la clase para que me pueda crear una Instancia

    }


}
// acá la clase está afuera de la clase Primera parte y no tengo que declararla estatica para que  funcione
class prueba{
    public int numero = 98 ;
    public void verNumero(){
        this.numero++;
    }


}
