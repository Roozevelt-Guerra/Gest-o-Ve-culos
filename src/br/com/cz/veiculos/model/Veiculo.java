package br.com.cz.veiculos.model;

import br.com.cz.veiculos.enumerador.TipoCombustivel;

public abstract class Veiculo {

    private String modelo;
    private int anoFabricacao;
    private String placa;
    public TipoCombustivel tipoCombustivel;
    public  Motor motor;
    private Proprietario proprietario;

    public Veiculo(String modelo,
                   int anoFabricacao,
                   String placa,
                   TipoCombustivel tipoCombustivel,
                   Motor motor,
                   Proprietario proprietario) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.length() == 7){
            this.placa = placa;
        }
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", placa='" + placa + '\'' +
                ", tipoCombustivel=" + tipoCombustivel +
                ", motor=" + motor +
                ", proprietario=" + proprietario +
                '}';
    }
}
