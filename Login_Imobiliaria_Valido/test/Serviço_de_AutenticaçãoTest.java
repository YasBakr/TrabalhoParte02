/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class Serviço_de_AutenticaçãoTest {

    /**
     * Teste — Login com credenciais válidas
     * Verifica que login() com credenciais corretas
     * gera token e retorna perfil do usuário
     */
    @Test
    public void loginComCredenciaisValidas_SD9() {

        // Arrange — define os dados corretos do usuário para o teste
        String email = "Breno@imobiliaria.com";
        String senha = "Magonegro21@";
        String perfilEsperado = "ADMINISTRADOR";

        // Instancia o serviço de autenticação
        Serviço_de_Autenticação service = new Serviço_de_Autenticação();

        // Act — executa o login com as credenciais corretas
        Respostas_Login response = service.login(email, senha);

        // Assert — verifica se os resultados estão corretos
        assertNotNull(response);                                          // login retornou algo
        assertNotNull(response.getToken());                               // token foi gerado
        assertNotNull(response.getUsuario());                             // perfil foi retornado
        assertEquals(perfilEsperado, response.getUsuario().getPerfil()); // perfil é ADMINISTRADOR
        assertEquals(email, response.getUsuario().getEmail());            // email bate com o cadastrado
    }
}