/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendar_visita;

public class Agendar_Visita {
    private String id;
    private String estado; // "DISPONIVEL", "ALUGADO", "VENDIDO", "EM_NEGOCIACAO"

    public Agendar_Visita(String id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public String getId()     { return id; }
    public String getEstado() { return estado; }
}