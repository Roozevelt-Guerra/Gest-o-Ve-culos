package br.com.cz.veiculos.model;

import br.com.cz.veiculos.contratos.Tributavel;
import br.com.cz.veiculos.enumerador.TipoCombustivel;

public class Moto extends Veiculo implements Tributavel {

    public int cilindradas;

    public Moto(String modelo,
                int anoFabricacao,
                String placa,
                TipoCombustivel tipoCombustivel,
                Motor motor,
                Proprietario proprietario,
                int cilindradas) {
        super(modelo, anoFabricacao, placa, tipoCombustivel, motor, proprietario);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void ligar(){
        System.out.println("ligando...");
    }


    @Override
    public double calcularImposto() {
        return 100;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                ", tipoCombustivel=" + tipoCombustivel +
                ", motor=" + motor +
                '}';
    }
}
