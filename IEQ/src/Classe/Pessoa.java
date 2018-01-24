/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import java.sql.Date;

/**
 *
 * @author calves
 */
public class Pessoa {
    String pes_nome;
    Date   pes_dtnasc;
    String pes_sexo;
    String pes_rg;
    String pes_cpf;
    Date   pes_dtinclusao;
    Date   pes_dtalteracao;
    Integer est_codigo;
    Integer esc_codigo; 

    public String getPes_nome() {
        return pes_nome;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public Date getPes_dtnasc() {
        return pes_dtnasc;
    }

    public void setPes_dtnasc(Date pes_dtnasc) {
        this.pes_dtnasc = pes_dtnasc;
    }

    public String getPes_sexo() {
        return pes_sexo;
    }

    public void setPes_sexo(String pes_sexo) {
        this.pes_sexo = pes_sexo;
    }

    public String getPes_rg() {
        return pes_rg;
    }

    public void setPes_rg(String pes_rg) {
        this.pes_rg = pes_rg;
    }

    public String getPes_cpf() {
        return pes_cpf;
    }

    public void setPes_cpf(String pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

    public Date getPes_dtinclusao() {
        return pes_dtinclusao;
    }

    public void setPes_dtinclusao(Date pes_dtinclusao) {
        this.pes_dtinclusao = pes_dtinclusao;
    }

    public Date getPes_dtalteracao() {
        return pes_dtalteracao;
    }

    public void setPes_dtalteracao(Date pes_dtalteracao) {
        this.pes_dtalteracao = pes_dtalteracao;
    }

    public Integer getEst_codigo() {
        return est_codigo;
    }

    public void setEst_codigo(Integer est_codigo) {
        this.est_codigo = est_codigo;
    }

    public Integer getEsc_codigo() {
        return esc_codigo;
    }

    public void setEsc_codigo(Integer esc_codigo) {
        this.esc_codigo = esc_codigo;
    }
    
    
    
    
    
    
    
}