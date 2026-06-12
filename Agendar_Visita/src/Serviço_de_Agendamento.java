/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Serviço_de_Agendamento {

    // Simulando um imóvel cadastrado no banco de dados
    // com estado "DISPONIVEL" para permitir agendamento
    private final Agendar_Visita imovelCadastrado = new Agendar_Visita("IMOVEL001", "DISPONIVEL");

    /**
     * Agenda uma visita para um imóvel disponível
     * @param idImovel identificador do imóvel a ser visitado
     * @param data data desejada para a visita
     * @param hora hora desejada para a visita
     * @param nomeCliente nome do cliente que deseja visitar
     * @return Agendamento com idAgendamento gerado
     */
    public Agendamento agendarVisita(String idImovel, String data,
                                     String hora, String nomeCliente) {

        // Verifica se o imóvel existe no sistema
        if (!imovelCadastrado.getId().equals(idImovel)) {
            throw new IllegalArgumentException("Imóvel não encontrado");
        }

        // Verifica se o imóvel está disponível para visita
        // Lança exceção se estiver ALUGADO, VENDIDO ou EM_NEGOCIACAO
        if (!imovelCadastrado.getEstado().equals("DISPONIVEL")) {
            throw new IllegalStateException("Imóvel não está disponível para visita");
        }

        // Gera o identificador único do agendamento
        // Formato: AGD-{idImovel}-{data}-{hora}
        String idAgendamento = "AGD-" + idImovel + "-" + data + "-" + hora;

        // Salva e retorna o agendamento criado
        return new Agendamento(idAgendamento, idImovel, data, hora, nomeCliente);
    }
}