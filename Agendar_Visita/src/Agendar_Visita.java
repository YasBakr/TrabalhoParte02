/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class Agendar_Visita {

    // Identificador único do imóvel
    private String id;

    // Estado atual do imóvel: "DISPONIVEL", "ALUGADO", "VENDIDO", "EM_NEGOCIACAO"
    private String estado;

    /**
     * Construtor do imóvel
     * @param id identificador único do imóvel
     * @param estado estado atual do imóvel
     */
    public Agendar_Visita(String id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    /**
     * Retorna o identificador do imóvel
     * @return id do imóvel
     */
    public String getId() { return id; }

    /**
     * Retorna o estado atual do imóvel
     * @return estado do imóvel
     */
    public String getEstado() { return estado; }
}