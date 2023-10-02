/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.ClienteDTO;
import VIEW.frmPesquisarVIEW;
//import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;
/**
 *
 * @author JC
 */
public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ArrayList<ClienteDTO> lista = new ArrayList<>();
    ResultSet rs;
    
    public void cadastrarCliente(ClienteDTO objclientedto){
        String sql = "insert into clientes (Nome, Telefone, Sexo, Rua, Casa, Bloco) values (?, ?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().ConectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objclientedto.getNome());
            pstm.setString(2, objclientedto.getTelefone());
            pstm.setString(3, objclientedto.getSexo());
            pstm.setString(4, objclientedto.getRua());
            pstm.setString(5, objclientedto.getCasa());
            pstm.setString(6, objclientedto.getBloco());
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO" + erro);
        }
    
    }
    
    /*public ArrayList<ClienteDTO> PesquisarCliente(){
    String sql = "select * from clientes";
    conn = new ConexaoDAO().ConectaDB();
    
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
            ClienteDTO objclientedto = new ClienteDTO();
            objclientedto.setId(rs.getInt("idClientes"));
            lista.add(objclientedto);
            
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar" + lista);
        }
        return lista;
    }*/
}
