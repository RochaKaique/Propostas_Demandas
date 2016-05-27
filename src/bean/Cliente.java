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
public class Cliente {
    
    private int idCliente;
    private String razaoSocial;
    private String pep;
    private String descricaoPep;
    private String respocsavelPep;
    private boolean possuiArq;
    private String localizacao;
    private boolean ativo;
    private int idRegiao;
    private int idBo;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getPep() {
        return pep;
    }

    public void setPep(String pep) {
        this.pep = pep;
    }

    public String getDescricaoPep() {
        return descricaoPep;
    }

    public void setDescricaoPep(String descricaoPep) {
        this.descricaoPep = descricaoPep;
    }

    public String getRespocsavelPep() {
        return respocsavelPep;
    }

    public void setRespocsavelPep(String respocsavelPep) {
        this.respocsavelPep = respocsavelPep;
    }

    public boolean isPossuiArq() {
        return possuiArq;
    }

    public void setPossuiArq(boolean possuiArq) {
        this.possuiArq = possuiArq;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getIdRegiao() {
        return idRegiao;
    }

    public void setIdRegiao(int idRegiao) {
        this.idRegiao = idRegiao;
    }

    public int getIdBo() {
        return idBo;
    }

    public void setIdBo(int idBo) {
        this.idBo = idBo;
    }
    
    @Override
    public String toString(){
       return this.razaoSocial;
    }
    
}
