/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.SQLException;

public class ProdutoRN {

    public void inserir(Produto produto) throws SQLException {
        ProdutoDAO produtodao = new ProdutoDAO();
        produtodao.inserir(produto);
    }

}
