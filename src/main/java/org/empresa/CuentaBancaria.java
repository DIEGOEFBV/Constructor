package org.empresa;

public class CuentaBancaria {

    //Java siempre coloca un constructor por defecto en toda clase

    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;
    private int estado;

    //Constructor
    //No tiene tipo de retorno, Se llaman igual a la clase
    //El constructor se ejecuta por una única vez en el ciclo de vida de cada objeto
    public CuentaBancaria() {
    }

    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }

    public CuentaBancaria(String moneda, String tipo) {
       //this(), este this es de llamado a contructor, esto nos sirve para no tener lineas repetidas
        this("ALIAS.POR.DEFECTO",moneda, tipo);
    }

    private String generarCBU() {
        return  "1668473"; //Pendiente, de como generar un CBU automatico
    }

    public void mostrarDatos() {
        System.out.println("CBU:"+ CBU + " Alias: " + alias + ", Saldo $: " + saldo + " Moneda: " + moneda + ", cuenta: " + tipo);
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCBU() {
        return CBU;
    }

    public void setCBU(String CBU) {
        this.CBU = CBU;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo != 0) {
            this.saldo = saldo;
        }
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
    }
}
