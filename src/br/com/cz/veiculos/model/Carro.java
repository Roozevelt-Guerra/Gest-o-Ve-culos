package br.com.cz.veiculos.model;

import br.com.cz.veiculos.contratos.Manutencao;
import br.com.cz.veiculos.contratos.Tributavel;
import br.com.cz.veiculos.enumerador.TipoCombustivel;

public class Carro extends Veiculo implements Manutencao, Tributavel {

    public int numeroPortas;

    public Carro(String modelo,
                 int anoFabricacao,
                 String placa,
                 TipoCombustivel tipoCombustivel,
                 Motor motor,
                 Proprietario proprietario,
                 int numeroPortas) {
        super(modelo, anoFabricacao, placa, tipoCombustivel, motor, proprietario);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void ligar(){
        System.out.println("ligando...");
    }


    @Override
    public boolean verificarManuntencao() {
        return false;
    }

    @Override
    public double calcularImposto() {
        return 500;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                ", tipoCombustivel=" + tipoCombustivel +
                ", motor=" + motor +
                '}';
    }
}
