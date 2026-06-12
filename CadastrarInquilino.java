/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criarcontrato;

/**
 * CT05 - Criar Contrato
 */
public class CriarContrato {

    public static void main(String[] args) {

        Imovel imovel = new Imovel(1);

        Contrato contrato = criarContrato(1, imovel, 1500);

        System.out.println(
                "Contrato numero: "
                        + contrato.getNumero());

        System.out.println(
                "Estado do imovel: "
                        + imovel.getEstado());
    }

    public static Contrato criarContrato(
            int idInquilino,
            Imovel imovel,
            double valor) {

        // Verifica disponibilidade
        if (imovel.getEstado()
                .equals("Disponivel")) {

            // Altera estado
            imovel.setEstado("Alugado");

            // Retorna contrato criado
            return new Contrato(1, idInquilino, valor);
        }

        throw new RuntimeException(
                "Imovel indisponivel");
    }
}