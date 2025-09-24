package Veiculo;

// Classe herdeira de Veiculo com atributo adicional numeroPortas(público)
public class Carro extends Veiculo {
    public int numeroPortas;

    // Adicionada informações sobre veiculo "carros"
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Implementação  do método abstrato "informacoesVeiculo()" na classe Carro
    @Override
    public String informacoesVeiculo() {
        return "Carro: " + marca + " " + modelo + " - Ano: " + getAno() + 
               " - Número de portas: " + numeroPortas;
    }
}
