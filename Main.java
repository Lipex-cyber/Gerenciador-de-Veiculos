package Veiculo;

public class Main {
    public static void main(String[] args) {

        // Criando um carro
        Carro carro = new Carro("Renault", "Clio", 2022, 4);
        
        // Criando uma moto
        Moto moto = new Moto("Honda", "CB500", 2021, 500);

        // Imprimindo informações
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
