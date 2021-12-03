/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unimontes.modelo;

/**
 *
 * @author gusta
 */
public class Computador {
    private String placa_manutencao;
    private String hostname;
    private String modelo;
    private float memoria;
    private String processador;
    private Integer disco_rigido;
    private String estado_conservacao;

    public String getPlaca_manutencao() {
        return placa_manutencao;
    }

    public void setPlaca_manutencao(String placa_manutencao) {
        this.placa_manutencao = placa_manutencao;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getMemoria() {
        return memoria;
    }

    public void setMemoria(float memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public Integer getDisco_rigido() {
        return disco_rigido;
    }

    public void setDisco_rigido(Integer disco_rigido) {
        this.disco_rigido = disco_rigido;
    }

    public String getEstado_conservacao() {
        return estado_conservacao;
    }

    public void setEstado_conservacao(String estado_conservacao) {
        this.estado_conservacao = estado_conservacao;
    }
    
    
}
