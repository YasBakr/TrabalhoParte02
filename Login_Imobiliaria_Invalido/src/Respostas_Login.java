/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BNTecnologia
 */
public class Respostas_Login {

    // Token gerado pelo sistema após autenticação bem sucedida
    private String token;

    // Objeto com os dados do usuário autenticado
    private Login_Imobiliaria usuario;

    /**
     * Construtor da resposta de login
     * @param token token de acesso gerado pelo sistema
     * @param usuario objeto com os dados do usuário autenticado
     */
    public Respostas_Login(String token, Login_Imobiliaria usuario) {
        this.token = token;
        this.usuario = usuario;
    }

    /**
     * Retorna o token de acesso gerado
     * @return token
     */
    public String getToken() { return token; }

    /**
     * Retorna os dados do usuário autenticado
     * @return usuario com nome, email, senha e perfil
     */
    public Login_Imobiliaria getUsuario() { return usuario; }
}