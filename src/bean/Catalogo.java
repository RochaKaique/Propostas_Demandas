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
public class Catalogo {
    
    private int idCatalogo;
    private String codigo;
    private String descricao;
    private String descritivo;
    private boolean recursoHumano;
    private int idLinhaServico;

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public boolean isRecursoHumano() {
        return recursoHumano;
    }

    public void setRecursoHumano(boolean recursoHumano) {
        this.recursoHumano = recursoHumano;
    }

    public int getIdLinhaServico() {
        return idLinhaServico;
    }

    public void setIdLinhaServico(int idLinhaServico) {
        this.idLinhaServico = idLinhaServico;
    }
    
    @Override
    public String toString(){
       return this.descricao;
    }
    
    
}
