package Veiculo;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Construtor opcional
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos de acesso (getter e setter) para ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método abstrato
    public abstract String informacoesVeiculo();
}