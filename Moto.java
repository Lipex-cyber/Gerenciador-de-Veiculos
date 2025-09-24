package Veiculo;

// Classe Moto herdeira de Veiculo com atributo adicional cilindrada(privado)
public class Moto extends Veiculo {
    private int cilindrada;

    // Adicionada informações sobre veiculo "moto"
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Implementação  do método abstrato "informacoesVeiculo()" na classe Moto
    @Override
    public String informacoesVeiculo() {
        return "Moto: " + marca + " " + modelo + " - Ano: " + getAno() + 
               " - Cilindrada: " + cilindrada + "cc";
    }
}
