/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Conexao;


/**
 *
 * @author gusta
 */
public class ProdutoDAO {
    void inserir(Produto produto) throws SQLException {
        
        Conexao conexao = new Conexao();
        
        String sql = "INSERT INTO produto (descricao, preco) VALUES (?, ?)";

        PreparedStatement statement = conexao.getConexao().prepareStatement(sql);
        statement.setString(1, produto.getDescricao());
        statement.setFloat(2, produto.getpreco());

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new user was inserted successfully!");
        }

    }
}
