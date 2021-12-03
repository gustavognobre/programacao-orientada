/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Produto {
    private Integer codigo;
    private String Descricao;
    private float preco;

    public String getDescricao() {
        return Descricao;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    public float getpreco() {
        return preco;
    }
    public void setpreco(float preco) {
        this.preco = preco;
    }

   
}
