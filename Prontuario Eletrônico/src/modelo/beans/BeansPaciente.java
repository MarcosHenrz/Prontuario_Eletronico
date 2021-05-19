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
public class BeansPaciente {
    
    private int codPaciente;
    private String dtNascimento;
    private String nomePaciente;
    private String rg;
    private String cpf;
    private int numCartaoSus;
    private String telefone;
    private String rua;
    private int num_casa;
    private String bairro;
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumCartaoSus() {
        return numCartaoSus;
    }

    public void setNumCartaoSus(int numCartaoSus) {
        this.numCartaoSus = numCartaoSus;
    }
   
   

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

       public int getNum_casa() {
        return num_casa;
    }

    public void setNum_casa(int num_casa) {
        this.num_casa = num_casa;
    }

   

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
