/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultarimoveis;

/**
 * CT02 - Consultar Imóveis
 */
public class ConsultarImoveis {

    public static void main(String[] args) {

        Imovel imovel =
                new Imovel("Casa", 2000);

        // Exibe descrição
        System.out.println(imovel.getDescricao());

        // Simula Estratégia de Preço
        double precoFinal =
                imovel.getValor() * 1.10;

        System.out.println(
                "Preco calculado: "
                + precoFinal);
    }
}