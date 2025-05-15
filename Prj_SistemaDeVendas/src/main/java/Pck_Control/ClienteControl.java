package Pck_Control;

import Pck_Model.ClienteModel;
import Pck_Persistencia.ClientePersistencia;
import java.sql.SQLException;

public class ClienteControl {

    public void inserirCliente(String sNome, String sEndereco, String sTelefone, String sCpf, double dCredito) throws SQLException {
        ClienteModel objClienteModel = new ClienteModel();
        objClienteModel.setA01_nome(sNome);
        objClienteModel.setA01_endereco(sEndereco);
        objClienteModel.setA01_telefone(sTelefone);
        objClienteModel.setA01_cpf(sCpf);
        objClienteModel.setA01_credito(dCredito);

        ClientePersistencia persistencia = new ClientePersistencia();
        persistencia.inserirCliente(objClienteModel);
    }

    public void atualizarCliente(String sCpf, String sNome, String sEndereco, String sTelefone, double dCredito) throws SQLException {
        ClienteModel objClienteModel = new ClienteModel();
        objClienteModel.setA01_cpf(sCpf);
        objClienteModel.setA01_nome(sNome);
        objClienteModel.setA01_endereco(sEndereco);
        objClienteModel.setA01_telefone(sTelefone);
        objClienteModel.setA01_credito(dCredito);

        ClientePersistencia persistencia = new ClientePersistencia();
        persistencia.atualizarCliente(objClienteModel);
    }

    public void removerCliente(String sCpf) throws SQLException {
        ClientePersistencia persistencia = new ClientePersistencia();
        persistencia.removerCliente(sCpf);
    }

    public int buscarCodigoClientePorCPF(String cpf) {
        return ClientePersistencia.buscarCodigoClientePorCPF(cpf);
    }
}
