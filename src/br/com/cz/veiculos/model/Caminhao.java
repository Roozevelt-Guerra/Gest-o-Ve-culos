package br.com.cz.veiculos.model;

import br.com.cz.veiculos.contratos.Manutencao;
import br.com.cz.veiculos.contratos.Tributavel;
import br.com.cz.veiculos.enumerador.TipoCombustivel;

public class Caminhao extends Veiculo implements Manutencao, Tributavel {

    public double capacidadeCarga;

    public Caminhao(String modelo,
                    int anoFabricacao,
                    String placa,
                    TipoCombustivel tipoCombustivel,
                    Motor motor,
                    Proprietario proprietario,
                    double capacidadeCarga) {
        super(modelo, anoFabricacao, placa, tipoCombustivel, motor, proprietario);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }




    @Override
    public boolean verificarManuntencao() {
        return false;
    }

    @Override
    public double calcularImposto() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeCarga=" + capacidadeCarga +
                ", tipoCombustivel=" + tipoCombustivel +
                ", motor=" + motor +
                '}';
    }
}
