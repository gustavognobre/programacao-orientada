/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unimontes.modelo;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import br.unimontes.procedure.Conexao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class ComputadorDAO {
    
    void inserir (Computador computador){
        
        try {
            Conexao conexao = new Conexao();
            
            String sql = "INSERT INTO dados_computador(placa_manutencao, hostname, modelo, memoria, processador, disco_rigido, estado_conservacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            
            PreparedStatement statement = conexao.getConexao().prepareStatement(sql);
            statement.setString(1, computador.getPlaca_manutencao());
            statement.setString(2, computador.getHostname());
            statement.setString(3, computador.getModelo());
            statement.setFloat(4, computador.getMemoria());
            statement.setString(5, computador.getProcessador());
            statement.setInt(6, computador.getDisco_rigido());
            statement.setString(7, computador.getEstado_conservacao());
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                System.out.println("A new computer was inserted sucessfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
