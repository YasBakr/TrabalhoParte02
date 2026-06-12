/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BNTecnologia
 */
public class Respostas_Login {
    private String token;
    private Login_Imobiliaria usuario;

    public Respostas_Login(String token, Login_Imobiliaria usuario) {
        this.token = token;
        this.usuario = usuario;
    }

    public String getToken()             { return token; }
    public Login_Imobiliaria getUsuario() { return usuario; }
}