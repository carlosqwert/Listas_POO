package Exercicio4;

public class Vip extends ingresso {

    protected double valorAdicional;

    public double ingressoVip(double valorVip) {
        imprimeValor();
        this.setValorAdicional(this.getValorIngresso() + valorVip*2);
        return this.valorAdicional;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }  
}