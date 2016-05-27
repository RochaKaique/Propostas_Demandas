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
public class TipoAcesso {
    
    private int idTipoAcesso;
    private String descricao;

    public int getIdTipoAcesso() {
        return idTipoAcesso;
    }

    public void setIdTipoAcesso(int idTipoAcesso) {
        this.idTipoAcesso = idTipoAcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
       return this.descricao;
    }
}
