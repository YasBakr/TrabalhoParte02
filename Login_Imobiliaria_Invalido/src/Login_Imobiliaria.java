/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package login_imobiliaria;

/**
 *
 * @author BNTecnologia
 */
public class Login_Imobiliaria {

    // Nome completo do usuário
    private String nome;

    // Email do usuário usado para autenticação
    private String email;

    // Senha do usuário usada para autenticação
    private String senha;

    // Perfil de acesso do usuário: "CORRETOR", "CLIENTE", "ADMINISTRADOR"
    private String perfil;

    /**
     * Construtor do usuário da imobiliária
     * @param nome nome completo do usuário
     * @param email email de acesso ao sistema
     * @param senha senha de acesso ao sistema
     * @param perfil perfil de acesso: CORRETOR, CLIENTE ou ADMINISTRADOR
     */
    public Login_Imobiliaria(String nome, String email, String senha, String perfil) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    /**
     * Retorna o nome do usuário
     * @return nome
     */
    public String getNome()   { return nome; }

    /**
     * Retorna o email do usuário
     * @return email
     */
    public String getEmail()  { return email; }

    /**
     * Retorna a senha do usuário
     * @return senha
     */
    public String getSenha()  { return senha; }

    /**
     * Retorna o perfil de acesso do usuário
     * @return perfil
     */
    public String getPerfil() { return perfil; }
}

    

