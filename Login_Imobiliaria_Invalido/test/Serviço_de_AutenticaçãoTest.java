/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class Serviço_de_AutenticaçãoTest {

    @Test
public void loginComCredenciaisInvalidas_SD9() {
    // Executar — dados com senha errada
    String email = "Breno@imobiliaria.com";
    String senhaErrada = "Teste123";

    Serviço_de_Autenticação service = new Serviço_de_Autenticação();

    // Verificar a execuçao — verifica se lançou a exceção correta
    Exception exception = assertThrows(
        IllegalArgumentException.class,
        () -> service.login(email, senhaErrada)
    );

    // Verifica a mensagem da exceção
    assertEquals("Usuário ou senha incorretos", exception.getMessage());
}
}