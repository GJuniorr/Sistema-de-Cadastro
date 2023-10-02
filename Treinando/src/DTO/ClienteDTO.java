/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author JC
 */
public class ClienteDTO {
    private String Nome;
    private String Rua;
    private String Telefone;
    private String Sexo;
    private String Casa;
    private String Bloco;
    private Integer id;

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Endereço
     */
    public String getRua() {
        return Rua;
    }

    /**
     * @param Endereço the Endereço to set
     */
    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Gênero
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Gênero the Gênero to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the PrédioCasa
     */
    public String getCasa() {
        return Casa;
    }

    /**
     * @param PrédioCasa the PrédioCasa to set
     */
    public void setCasa(String Casa) {
        this.Casa = Casa;
    }

    /**
     * @return the Bloco
     */
    public String getBloco() {
        return Bloco;
    }

    /**
     * @param Bloco the Bloco to set
     */
    public void setBloco(String Bloco) {
        this.Bloco = Bloco;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
}
