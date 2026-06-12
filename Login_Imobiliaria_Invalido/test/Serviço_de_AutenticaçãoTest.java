/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class Serviço_de_AutenticaçãoTest {

    /**
     * Teste SD_9 — Login com credenciais inválidas
     * Verifica que login() com senha errada lança exceção
     * com a mensagem "Usuário ou senha incorretos"
     */
    @Test
    public void loginComCredenciaisInvalidas_SD9() {

        // Preparação — define email correto mas senha errada
        String email = "Breno@imobiliaria.com";
        String senhaErrada = "Teste123";

        // Instancia o serviço de autenticação
        Serviço_de_Autenticação service = new Serviço_de_Autenticação();

        // Executar e Verificar — confirma que a exceção foi lançada
        // assertThrows executa o login e verifica se lançou IllegalArgumentException
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> service.login(email, senhaErrada)
        );

        // Verifica se a mensagem da exceção está correta
        assertEquals("Usuário ou senha incorretos", exception.getMessage());
    }
}