package Veiculo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main1 {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private JFrame frame;
    private JTextArea displayArea;

    public Main1() {
        frame = new JFrame("Sistema de Gerenciamento de Veículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Área de exibição
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Botões
        JButton btnAddCarro = new JButton("Adicionar Carro");
        JButton btnAddMoto = new JButton("Adicionar Moto");
        JButton btnMostrarVeiculos = new JButton("Mostrar Todos os Veículos");

        JPanel panel = new JPanel();
        panel.add(btnAddCarro);
        panel.add(btnAddMoto);
        panel.add(btnMostrarVeiculos);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Ações dos botões
        btnAddCarro.addActionListener(e -> adicionarCarro());
        btnAddMoto.addActionListener(e -> adicionarMoto());
        btnMostrarVeiculos.addActionListener(e -> mostrarVeiculos());

        frame.setVisible(true);
    }

    private void adicionarCarro() {
        try {
            String marca = JOptionPane.showInputDialog(frame, "Digite a marca do carro:");
            String modelo = JOptionPane.showInputDialog(frame, "Digite o modelo do carro:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite o ano do carro:"));
            int portas = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite o número de portas:"));

            Carro carro = new Carro(marca, modelo, ano, portas);
            veiculos.add(carro);
            JOptionPane.showMessageDialog(frame, "Carro adicionado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Erro ao adicionar carro! Verifique os dados.");
        }
    }

    private void adicionarMoto() {
        try {
            String marca = JOptionPane.showInputDialog(frame, "Digite a marca da moto:");
            String modelo = JOptionPane.showInputDialog(frame, "Digite o modelo da moto:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite o ano da moto:"));
            int cilindrada = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite a cilindrada da moto (cc):"));

            Moto moto = new Moto(marca, modelo, ano, cilindrada);
            veiculos.add(moto);
            JOptionPane.showMessageDialog(frame, "Moto adicionada com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Erro ao adicionar moto! Verifique os dados.");
        }
    }

    private void mostrarVeiculos() {
        displayArea.setText(""); // limpa a área
        if (veiculos.isEmpty()) {
            displayArea.setText("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo v : veiculos) {
                displayArea.append(v.informacoesVeiculo() + "\n\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main1::new);
    }
}
