package Pck_Control;

import Pck_Model.ClienteModel;

public class ClienteControl {
    ClienteModel objClienteModel = new ClienteModel();
    
    public void inserirCliente (String sNome, String sEndereco, String sTelefone, String sCpf, double dCredito){
        objClienteModel.setA01_nome(sNome);
        objClienteModel.setA01_endereco(sEndereco);
        objClienteModel.setA01_telefone(sTelefone);
        objClienteModel.setA01_cpf(sCpf);
        objClienteModel.setA01_credito(dCredito);
    }
    
    public void atualizarCliente(int iCodigo_01, String sNome, String sEndereco, String sTelefone, double dCredito){
        objClienteModel.setA01_codigo(iCodigo_01);
        objClienteModel.setA01_nome(sNome);
        objClienteModel.setA01_endereco(sEndereco);
        objClienteModel.setA01_telefone(sTelefone);
        objClienteModel.setA01_credito(dCredito);
    }
    
    public void removerCliente(int iCodigo_01){
        objClienteModel.setA01_codigo(iCodigo_01);
    }
    
}
