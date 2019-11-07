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
public class ProfessorController {
    private Model.ProfessorModel model;
    private View.ProfessorView view;
    
    public ProfessorController(Model.ProfessorModel model, View.ProfessorView view){
        this.model = model;
        this.view = view;
    }
    
    public void setProfessorNome(String nome){
       model.setNome(nome);
    }
    
    public void setProfessorId(int id){
       model.setId(id);
    }
    
    public void setProfessorDisciplina(String disciplina){
        model.setDisciplina(disciplina);
    }
    
    public String getProfessorNome(){
        return model.getNome();
    }
    
    public int getProfessorId(){
        return model.getId();
    }
    
    public String getProfessorDisciplina(){
        return model.getDisciplina();
    }
    
    public void alterarView(){
        view.imprimeDetalhesProfessor(model.getNome(), model.getId(), model.getDisciplina());
    }
}
