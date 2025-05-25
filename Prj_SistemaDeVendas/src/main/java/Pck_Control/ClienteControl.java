package Pck_Control;

import Pck_Model.ClienteModel;
import Pck_Persistencia.ClientePersistencia;
import java.sql.SQLException;
import java.util.List;

public class ClienteControl {

    //01- Inserir cliente
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

    //02- Listar clientes
    public List<ClienteModel> listarClientes() throws SQLException {
        ClientePersistencia persistencia = new ClientePersistencia();
        return persistencia.listarClientes();
    }

    //03- Atualizar cliente
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

    //04- Apagar Cliente
    public void apagarCliente(String sCpf) throws SQLException {
        ClientePersistencia persistencia = new ClientePersistencia();
        persistencia.apagarCliente(sCpf);
    }

    public int buscarClientePorCPF(String sCpf) throws SQLException {
        ClienteModel objClienteModel = new ClienteModel();
        objClienteModel.setA01_cpf(sCpf);

        ClientePersistencia persistencia = new ClientePersistencia();
        persistencia.buscarClientePorCPF(objClienteModel);
        return objClienteModel.getA01_codigo();
    }
}
