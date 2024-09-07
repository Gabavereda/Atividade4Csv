package atividade4csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DadosPacienteCSV {

    //caminho do arquivo no pc
    private static final String nomeArquivo = "./export2Csv.Aferimento.csv";

    public static boolean AdicionarDados(Paciente p) {
        try {
            File arquivo = new File(nomeArquivo);
            boolean arquivoExiste = arquivo.exists();

            // 'true' no FileWriter para modo append (adicionar ao final)
            try (FileWriter escritor = new FileWriter(arquivo, StandardCharsets.ISO_8859_1, true)) {

                if (!arquivoExiste) {
                    // Adiciona o cabeçalho se o arquivo não existir
                    escritor.write("Data;Hora;Pressão Sistólica;Pressão Diastólica;Situação de Estresse;\n");
                }

                // Adiciona os dados do paciente no CSV
                escritor.write(p.getData()
                        + ";" + p.getHora()
                        + ";" + p.getPressaoSistolica()
                        + ";" + p.getPressaoDiastolica()
                        + ";" + (p.isStress() ? "Sim" : "Não") + "\n");

                System.out.println("Dados salvos no CSV com sucesso");
                return true;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar dados");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo CSV" + e.getMessage());
            return false;
        }
    }

    //Excluir uma linha da tabela 
    public void excluir(int indice) {
        ArrayList<Paciente> listaPaciente = listarPaciente();

        if (indice >= 0 && indice < listaPaciente.size()) {
            // Remove o paciente da lista
            listaPaciente.remove(indice);

            // Reescreve o CSV com a lista atualizada
            try (FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1, false)) {
                // Reescreve o cabeçalho
                escritor.write("Data;Hora;Pressão Sistólica;Pressão Diastólica;Situação de Estresse;\n");

                // Reescreve os dados
                for (Paciente p : listaPaciente) {
                    escritor.write(p.getData()
                            + ";" + p.getHora()
                            + ";" + p.getPressaoSistolica()
                            + ";" + p.getPressaoDiastolica()
                            + ";" + (p.isStress() ? "Sim" : "Não") + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao atualizar o CSV");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido para remoção");
        }
    }

    //para a exibição na tabela
    public static ArrayList<Paciente> listarPaciente() {
        ArrayList<Paciente> lista = new ArrayList<>();

        try {
            File arquivo = new File(nomeArquivo);
            if (!arquivo.exists()) {
                // Não exibe a mensagem de erro aqui para evitar loop. Apenas retorna uma lista vazia.

                return lista; // Retorna uma lista vazia, pois o arquivo ainda não foi criado.
            }

            // 'try-with-resources' para BufferedReader
            try (BufferedReader leitor = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), StandardCharsets.ISO_8859_1))) {
                String linha;
                boolean PrimeiraLinha = true;

                while ((linha = leitor.readLine()) != null) {
                    if (PrimeiraLinha) {
                        PrimeiraLinha = false;
                        continue; // Pula o cabeçalho
                    }

                    // Divide a linha em partes
                    String[] partes = linha.split(";");

                    // Cria um objeto Paciente e configura seus valores
                    Paciente p = new Paciente();
                    p.setData(partes[0]);
                    p.setHora(partes[1]);
                    p.setPressaoSistolica(Integer.parseInt(partes[2]));
                    p.setPressaoDiastolica(Integer.parseInt(partes[3]));
                    p.setStress((partes[4]).equalsIgnoreCase("Sim"));

                    // Adiciona o paciente à lista
                    lista.add(p);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao ler o CSV");
        }

        return lista;
    }

}
