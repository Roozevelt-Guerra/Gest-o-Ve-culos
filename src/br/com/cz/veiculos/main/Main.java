package br.com.cz.veiculos.main;

import br.com.cz.veiculos.enumerador.TipoCombustivel;
import br.com.cz.veiculos.model.Carro;
import br.com.cz.veiculos.model.Motor;
import br.com.cz.veiculos.model.Proprietario;

public class Main {
    public static void main(String[] args) {

        Motor carro = new Motor(1000);
        Proprietario proprietario = new Proprietario("Roozevelt", "000.000.000-00");
        Carro ferrari = new Carro("SF90 Spider", 2022, "ASF256",
                TipoCombustivel.GASOLINA, carro, proprietario, 2);

        ferrari.calcularImposto();
        ferrari.verificarManuntencao();
        System.out.println(ferrari);
    }
}
