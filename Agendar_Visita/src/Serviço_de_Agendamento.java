
import agendar_visita.Agendar_Visita;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BNTecnologia
 */
public class Serviço_de_Agendamento {

    // Simulando imóvel cadastrado no banco
    private final Agendar_Visita imovelCadastrado = new Agendar_Visita("IMOVEL001", "DISPONIVEL");

    public Agendamento agendarVisita(String idImovel, String data,
                                     String hora, String nomeCliente) {

        if (!imovelCadastrado.getId().equals(idImovel)) {
            throw new IllegalArgumentException("Imóvel não encontrado");
        }

        if (!imovelCadastrado.getEstado().equals("DISPONIVEL")) {
            throw new IllegalStateException("Imóvel não está disponível para visita");
        }

        // Gera o id do agendamento
        String idAgendamento = "AGD-" + idImovel + "-" + data + "-" + hora;

        return new Agendamento(idAgendamento, idImovel, data, hora, nomeCliente);
    }
}