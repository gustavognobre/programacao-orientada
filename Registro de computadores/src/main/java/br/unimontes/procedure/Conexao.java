/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unimontes.procedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gusta
 */
public class Conexao {
    private Connection conexao;
    private Statement comando;
  
    public Conexao()
    {
        this.conexao = null;
        this.comando = null;
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            this.conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/almoxarifado?useTimezone=true&serverTimezone=UTC", "root", "YWRtaW4u");
            System.out.println("Connection is created successfully😊");
            this.comando = (Statement) this.conexao.createStatement();
        } catch (SQLException excep) {
            excep.printStackTrace();
        } catch (Exception excep) {
            excep.printStackTrace();
        }
                

    }
    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public Statement getComando() {
        return comando;
    }

    public void setComando(Statement comando) {
        this.comando = comando;
    }
    
    
    

    
    
} 