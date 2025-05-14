package Pck_Control;

import Pck_DAO.ClienteDAO;
import Pck_Model.ClienteModel;
import java.sql.SQLException;

public class ClienteControl {

    ClienteModel objClienteModel = new ClienteModel();

    public void inserirCliente(String sNome, String sEndereco, String sTelefone, String sCpf, double dCredito) throws SQLException {
        objClienteModel.setA01_nome(sNome);
        objClienteModel.setA01_endereco(sEndereco);
        objClienteModel.setA01_telefone(sTelefone);
        objClienteModel.setA01_cpf(sCpf);
        objClienteModel.setA01_credito(dCredito);

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserirCliente(objClienteModel);
    }

    public void atualizarCliente(String sCpf, String sNome, String sEndereco, String sTelefone, double dCredito) throws SQLException {
        objClienteModel.setA01_cpf(sCpf);
        objClienteModel.setA01_nome(sNome);
        objClienteModel.setA01_endereco(sEndereco);
        objClienteModel.setA01_telefone(sTelefone);
        objClienteModel.setA01_credito(dCredito);

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.atualizarCliente(objClienteModel);
    }

    public void removerCliente(String sCpf) throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.removerCliente(sCpf);
    }
}
