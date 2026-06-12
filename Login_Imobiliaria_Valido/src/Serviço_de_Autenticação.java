/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BNTecnologia
 */
public class Serviço_de_Autenticação {

    // Simulando um usuário cadastrado no banco de dados
    // com perfil ADMINISTRADOR para fins de teste
    private Login_Imobiliaria usuarioCadastrado = new Login_Imobiliaria(
        "Breno Nunes",
        "Breno@imobiliaria.com",
        "Magonegro21@",
        "ADMINISTRADOR"
    );

    /**
     * Realiza a autenticação do usuário no sistema
     * @param email email informado pelo usuário
     * @param senha senha informada pelo usuário
     * @return Respostas_Login com token gerado e dados do usuário
     * @throws IllegalArgumentException se o email ou senha estiverem incorretos
     */
    public Respostas_Login login(String email, String senha) {

        // Verifica se o email e a senha conferem com o usuário cadastrado
        if (usuarioCadastrado.getEmail().equals(email) &&
            usuarioCadastrado.getSenha().equals(senha)) {

            // Gera o token de acesso para o usuário autenticado
            String token = "token-gerado-" + email;

            // Retorna o token e os dados do usuário autenticado
            return new Respostas_Login(token, usuarioCadastrado);
        }

        // Lança exceção se as credenciais estiverem incorretas
        throw new IllegalArgumentException("Usuário ou senha incorretos");
    }
}