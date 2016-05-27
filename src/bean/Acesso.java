/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author KAIQUE
 */
public class Acesso {
    
   private int idAcesso;
   private String nome;
   private String login;
   private String senha;
   private boolean acessoCompleto;
   private boolean ativo;
   private int idTipoAcesso;

    public Acesso() {
    }

    public Acesso(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }

    public int getIdAcesso() {
        return idAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAcessoCompleto() {
        return acessoCompleto;
    }

    public void setAcessoCompleto(boolean acessoCompleto) {
        this.acessoCompleto = acessoCompleto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getIdTipoAcesso() {
        return idTipoAcesso;
    }

    public void setIdTipoAcesso(int idTipoAcesso) {
        this.idTipoAcesso = idTipoAcesso;
    }
    
}
