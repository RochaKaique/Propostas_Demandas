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
public class StatusReport {
    
    private int idStatusReport;
    private String status;
    private String observacao;
    private String anexo;
    private int alteracoesRealizadas;
    private String data;
    private int idProposta;

    public int getIdStatusReport() {
        return idStatusReport;
    }

    public void setIdStatusReport(int idStatusReport) {
        this.idStatusReport = idStatusReport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public int getAlteracoesRealizadas() {
        return alteracoesRealizadas;
    }

    public void setAlteracoesRealizadas(int alteracoesRealizadas) {
        this.alteracoesRealizadas = alteracoesRealizadas;
    }

    public String getData() {
        return data;
    }

    public int getIdProposta() {
        return idProposta;
    }

    public void setIdProposta(int idProposta) {
        this.idProposta = idProposta;
    }
    
    @Override
    public String toString(){
       return this.status;
    }
}
