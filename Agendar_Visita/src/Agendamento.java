/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BNTecnologia
 */
public class Agendamento {
    private String idAgendamento;
    private String idImovel;
    private String data;
    private String hora;
    private String nomeCliente;

    public Agendamento(String idAgendamento, String idImovel, 
                       String data, String hora, String nomeCliente) {
        this.idAgendamento = idAgendamento;
        this.idImovel = idImovel;
        this.data = data;
        this.hora = hora;
        this.nomeCliente = nomeCliente;
    }

    public String getIdAgendamento() { return idAgendamento; }
    public String getIdImovel()      { return idImovel; }
    public String getData()          { return data; }
    public String getHora()          { return hora; }
    public String getNomeCliente()   { return nomeCliente; }
}