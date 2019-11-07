/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author hochforce
 */
public class EstudanteController {

    private Model.EstudanteModel model;
    private View.EstudanteView view;

    public EstudanteController(Model.EstudanteModel model, View.EstudanteView view) {
        this.model = model;
        this.view = view;
    }

    public void setEstudanteNome(String nome) {
        model.setNome(nome);
    }

    public String getEstudanteNome() {
        return model.getNome();
    }

    public void setEstudanteId(Integer id) {
        model.setId(id);
    }

    public Integer getEstudanteId() {
        return model.getId();
    }
    
    public void setEstudanteSobrenome(String sobrenome){
        model.setNome(sobrenome);
    }
    
    public String getEstudanteSobrenome(){
        return model.getSobrenome();
    }
    
    public void setEstudanteIdade(Integer idade){
        model.setIdade(idade);
    }
    
    public Integer getEstudanteIdade(){
        return model.getIdade();
    }

    public void alterarView() {
        view.imprimeDetalhesEstudante(model.getNome(), model.getId(), model.getSobrenome(), model.getIdade());
    }
}
