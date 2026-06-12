/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criarcontrato;

/**
 *
 * @author Cliente
 */
class Imovel {

    private final int id;
    private String estado;

    public Imovel(int id) {

        this.id = id;

        // Estado inicial
        this.estado = "Disponivel";
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(
            String estado) {

        this.estado = estado;
    }
}  
