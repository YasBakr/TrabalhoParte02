/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BNTecnologia
 */
public class Serviço_de_Autenticação {

    private Login_Imobiliaria usuarioCadastrado = new Login_Imobiliaria(
        "Breno Nunes",
        "Breno@imobiliaria.com",
        "Teste123",
        "ADMINISTRADOR"
    );

    public Respostas_Login login(String email, String senha) {
    if (usuarioCadastrado.getEmail().equals(email) &&
        usuarioCadastrado.getSenha().equals(senha)) {
        String token = "token-gerado-" + email;
        return new Respostas_Login(token, usuarioCadastrado);
    }
    throw new IllegalArgumentException("Usuário ou senha incorretos");
}
}