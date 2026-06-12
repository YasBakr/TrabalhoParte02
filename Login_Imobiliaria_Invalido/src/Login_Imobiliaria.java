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
    private String nome;
    private String email;
    private String senha;
    private String perfil; // "CORRETOR", "CLIENTE", "ADMINISTRADOR"

    public Login_Imobiliaria(String nome, String email, String senha, String perfil) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getNome()   { return nome; }
    public String getEmail()  { return email; }
    public String getSenha()  { return senha; }
    public String getPerfil() { return perfil; }
}

    

