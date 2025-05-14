package Pck_Persistencia;

import Pck_Model.ClienteModel;
import Pck_DAO.ClienteDAO;

import java.sql.SQLException;
import java.util.List;

public class ClientePersistencia {

    // Inserir cliente
    public static boolean inserirCliente(ClienteModel cliente) {
        try (ClienteDAO dao = new ClienteDAO()) {
            dao.inserirCliente(cliente);
            return true;
        } catch (SQLException e) {
            System.err.println("Erro na persistência (inserção): " + e.getMessage());
            return false;
        }
    }

    // Atualizar cliente
    public static boolean atualizarCliente(ClienteModel cliente) {
        try (ClienteDAO dao = new ClienteDAO()) {
            dao.atualizarCliente(cliente);
            return true;
        } catch (SQLException e) {
            System.err.println("Erro na persistência (atualização): " + e.getMessage());
            return false;
        }
    }

    // Remover cliente
    public static boolean removerCliente(String cpf) {
        try (ClienteDAO dao = new ClienteDAO()) {
            dao.removerCliente(cpf);
            return true;
        } catch (SQLException e) {
            System.err.println("Erro na persistência (remoção): " + e.getMessage());
            return false;
        }
    }

    // Listar clientes
    public static List<ClienteModel> listarClientes() {
        try (ClienteDAO dao = new ClienteDAO()) {
            return dao.listarClientes();
        } catch (SQLException e) {
            System.err.println("Erro na persistência (listar): " + e.getMessage());
            return null;
        }
    }
}
