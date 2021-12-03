/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class Conexao {

    Connection conexao;

    public Conexao() {
        String dbURL = "jdbc:mysql://localhost:3306/produto";
        String username = "root";
        String password = "YWRtaW4u";
        try {
            this.conexao = DriverManager.getConnection(dbURL, username, password);
            if (this.conexao != null) {
                System.out.println("Connected");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Connection getConexao() {
        return conexao;
    }
    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
}
