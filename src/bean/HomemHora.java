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
public class HomemHora {
    
    private int idHomemHora;
    private boolean horarioComercial;
    private String perfil;
    private String qualificacao;

    public int getIdHomemHora() {
        return idHomemHora;
    }

    public void setIdHomemHora(int idHomemHora) {
        this.idHomemHora = idHomemHora;
    }

    public boolean isHorarioComercial() {
        return horarioComercial;
    }

    public void setHorarioComercial(boolean horarioComercial) {
        this.horarioComercial = horarioComercial;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }    
    
}
