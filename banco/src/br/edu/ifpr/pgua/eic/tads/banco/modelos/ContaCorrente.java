package br.edu.ifpr.pgua.eic.tads.banco.modelos;

public class ContaCorrente {
    
    //atributos => caracteristicas
    private String numero;
    private String agencia;
    private double saldo;
    //Cliente
    private ClientePF dono;

    
    //métodos => ações
    public ContaCorrente(String numero, String agencia, ClientePF dono, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dono = dono;
    }

    public ContaCorrente(String numero, String agencia, ClientePF dono){
        this(numero,agencia,dono,0.0);
    }
    
    boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public String getNumero(){
        return numero;
    }

    public String getAgencia(){
        return agencia;
    }

    public double getSaldo(){
        return saldo;
    }

    public ClientePF getDono(){
        return this.dono;
    }

    //toString

}
