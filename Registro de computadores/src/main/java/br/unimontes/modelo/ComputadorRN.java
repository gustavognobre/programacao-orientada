/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unimontes.modelo;

import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class ComputadorRN {
    public void inserir(Computador computador)
    {
        ComputadorDAO computadordao = new ComputadorDAO();
        computadordao.inserir(computador);
    }          
}
