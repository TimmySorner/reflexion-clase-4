//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Banco juanDiego = new Banco("Diegallo", "Calle 123", 123456789, 1000000, "Corriente");
       juanDiego.verDatos();
        System.out.println("En la siguiente linea vemos los valores en blanco");
       Banco enBlanco= new Banco();
       enBlanco.verDatos();
       // La sobrecarga de constructores me permite reutilizar varias veces un método según los parametros de entrada. Dos metodos que se llaman igual pero tienen diferentes parametros
        juanDiego.depositarDinero(10000);
        juanDiego.verDatos();
        juanDiego.retirarDinero(10000);
        juanDiego.verDatos();


    }
}