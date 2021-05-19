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
public class BeansMedico {

    
    private int id_medico;
    private String nome;
    private String especialidade;
    private int crm;
    private String rg;
    private String cpf;
    private String telefone;

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEspecialidade() {
        return especialidade;
    }

    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    public int getCrm() {
        return crm;
    }

    
    public void setCrm(int crm) {
        this.crm = crm;
    }

   
    @Override
    public String toString(){
        return this.getNome();
    }
   
}
