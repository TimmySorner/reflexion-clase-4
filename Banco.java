public class Banco {
    private String nombre;
    private String direccion;
    private int numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Banco(String nombre, String direccion, int numeroCuenta, double saldo, String tipoCuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void verDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
    public Banco() {
        this.nombre = "sin nombre";
        this.direccion = "sin direccion";
        this.numeroCuenta = 102459;
        this.saldo = 0;
        this.tipoCuenta = "sin tipo de cuenta";
    }
    // Seeders y Getters. Se utilizan para modificar y consultar datos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   // Los métodos getter y sedder nos permiten acceder o modificar objetos

    public int retirarDinero(double monto) {
        if(saldo >= monto){
            saldo -= monto;
            return 1;
        }
        return 0;
    }
    public int depositarDinero(double monto) {
        saldo += monto;
        return 1;
    }

}
