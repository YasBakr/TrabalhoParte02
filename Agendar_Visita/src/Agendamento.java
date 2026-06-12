/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Agendamento {

    // Identificador único do agendamento gerado pelo sistema
    private String idAgendamento;

    // Identificador do imóvel que será visitado
    private String idImovel;

    // Data da visita agendada
    private String data;

    // Hora da visita agendada
    private String hora;

    // Nome do cliente que agendou a visita
    private String nomeCliente;

    /**
     * Construtor do agendamento
     * @param idAgendamento identificador único gerado pelo sistema
     * @param idImovel identificador do imóvel a ser visitado
     * @param data data da visita
     * @param hora hora da visita
     * @param nomeCliente nome do cliente que agendou
     */
    public Agendamento(String idAgendamento, String idImovel,
                       String data, String hora, String nomeCliente) {
        this.idAgendamento = idAgendamento;
        this.idImovel = idImovel;
        this.data = data;
        this.hora = hora;
        this.nomeCliente = nomeCliente;
    }

    /**
     * Retorna o identificador do agendamento
     * @return idAgendamento
     */
    public String getIdAgendamento() { return idAgendamento; }

    /**
     * Retorna o identificador do imóvel
     * @return idImovel
     */
    public String getIdImovel()      { return idImovel; }

    /**
     * Retorna a data da visita
     * @return data
     */
    public String getData()          { return data; }

    /**
     * Retorna a hora da visita
     * @return hora
     */
    public String getHora()          { return hora; }

    /**
     * Retorna o nome do cliente
     * @return nomeCliente
     */
    public String getNomeCliente()   { return nomeCliente; }
}