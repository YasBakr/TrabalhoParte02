/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class Serviço_de_AutenticaçãoTest {

    @Test
    public void loginComCredenciaisValidas_SD9() {
        // Arrange — Pegando os dados do Usuario para fazer Login
        String email = "Breno@imobiliaria.com";
        String senha = "Magonegro21@";
        String perfilEsperado = "ADMINISTRADOR";

        Serviço_de_Autenticação service = new Serviço_de_Autenticação();

        // Act — Fazendo a execução de login para teste
        Respostas_Login response = service.login(email, senha);

        // Assert — Verificação do teste para ver se esta tudo correto
        assertNotNull(response);
        assertNotNull(response.getToken());
        assertNotNull(response.getUsuario());
        assertEquals(perfilEsperado, response.getUsuario().getPerfil());
        assertEquals(email, response.getUsuario().getEmail());
    }
}