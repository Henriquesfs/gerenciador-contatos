package com.crud.dao;
import com.crud.model.Contato;
import com.crud.util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    public void adicionarContato (Contato contato){
        String sql = "INSERT INTO contatos (nome, telefone, email) VALUES (?,?,?)";

        try(Connection conn = DatabaseConnection.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.setString(3,  contato.getEmail());
            stmt.executeUpdate();
            System.out.println("Contato adicionado com sucesso!");
        } catch(SQLException e){
            System.out.println("Erro ao adicionar contato "+ e.getMessage());
        }
    }

    public List<Contato> listarContatos() {
        String sql = "SELECT * FROM contatos";


        List<Contato> contatos = new ArrayList<>();
        Contato contato;
        try (Connection conn = DatabaseConnection.conectar();
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {

            while (resultSet.next()) {
                contato = new Contato(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("telefone"),
                        resultSet.getString("email")
                );
                contatos.add(contato);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar os contatos " + e.getMessage());
        }
        return contatos;
    }

    public void alterarContato (Contato contato) {
        String sql = "UPDATE contatos SET nome = ?, telefone = ?, email = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.setString(3, contato.getEmail());
            stmt.setInt(4, contato.getId());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Contato atualizado com sucesso!");
            } else {
                System.out.println("Nenhum contato encontrado com o ID informado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o contato: " + e.getMessage());
        }
    }


    public void deletarContato(int id){
        String sql = "DELETE FROM contatos WHERE id = ?";
        try(Connection conn = DatabaseConnection.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0){
                System.out.println("com.crud.model.Contato deletado!");
            } else{
                System.out.println("Nenhum contato encontrado com o ID informado.");
            }
        } catch (SQLException e){
            System.out.println("Erro ao deletar o contato: "+ e.getMessage());
        }
    }
}
