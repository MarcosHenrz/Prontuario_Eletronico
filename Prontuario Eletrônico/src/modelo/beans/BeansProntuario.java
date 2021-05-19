/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.beans;

/**
 *
 * @author PC
 */
public class BeansProntuario {
   private int codProntuario;
   private String nomePaciente;
   private String diagnostico;
   private String receita;
   private String exame;
   private String situaçao;
   private String localização;

    public int getCodProntuario() {
        return codProntuario;
    }

    public void setCodProntuario(int codProntuario) {
        this.codProntuario = codProntuario;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public String getSituaçao() {
        return situaçao;
    }

    public void setSituaçao(String situaçao) {
        this.situaçao = situaçao;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }
}
