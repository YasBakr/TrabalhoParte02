/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class Serviço_de_AgendamentoTest {

    /**
     * Teste — Agendar visita com estado Disponivel
     * Verifica que agendarVisita() com imóvel disponível
     * salva o agendamento e retorna idAgendamento
     */
    @Test
    public void agendarVisitaComEstadoDisponivel_SD11() {

        // Preparação — define os dados que serão usados no teste
        String idImovel = "IMOVEL001";
        String data = "20-06-2026";
        String hora = "14:00";
        String nomeCliente = "Breno Nunes";

        // Instancia o serviço de agendamento
        Serviço_de_Agendamento service = new Serviço_de_Agendamento();

        // Executar — chama o método que será testado
        Agendamento agendamento = service.agendarVisita(idImovel, data, hora, nomeCliente);

        // Verificação — confere se os resultados estão corretos
        assertNotNull(agendamento);                                // agendamento foi salvo
        assertNotNull(agendamento.getIdAgendamento());             // id foi gerado
        assertEquals(idImovel, agendamento.getIdImovel());         // imóvel correto
        assertEquals(nomeCliente, agendamento.getNomeCliente());   // cliente correto
        assertEquals(data, agendamento.getData());                 // data correta
        assertEquals(hora, agendamento.getHora());                 // hora correta
    }
}