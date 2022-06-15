package org.empresa;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria("Diego", "Pesos", "Cuenta de ahorros");
        //Pueden tener 3 parametros siempre que los tipos sean distintos
        CuentaBancaria cb2 = new CuentaBancaria("Dolares","Caja corriente");
//        cb2.setTipo("Caja de ahorros");
        cb.mostrarDatos();
        cb2.mostrarDatos();

    }
}