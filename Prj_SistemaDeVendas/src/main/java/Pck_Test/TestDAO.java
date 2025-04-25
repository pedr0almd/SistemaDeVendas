package Pck_Test;

import Pck_DAO.ClienteDAO;
import Pck_Model.ClienteModel;
import java.sql.SQLException;
import java.util.List;

public class TestDAO {
    public static void main(String[] args) {
        try {
            ClienteDAO dao = new ClienteDAO();
            List<ClienteModel> clientes = dao.listarClientes();

            for (ClienteModel c : clientes) {
                System.out.println("Nome: " + c.getA01_nome() + " | CPF: " + c.getA01_cpf());
            }

        } catch (SQLException e) {
            System.err.println("Erro no teste: " + e.getMessage());
        }
    }
}
