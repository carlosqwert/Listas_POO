package Exercicio4;

public class camaroteSuperior extends Vip {

    public double valorCamaroteSuperior() {
        return ingressoVip(100) + this.getValorAdicional();
    }
    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}