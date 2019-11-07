/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningmvcconsole;

/**
 *
 * @author hochforce
 */
public class LearningMVCconsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Auto-generated method stub
//        Model.ProfessorModel model = RecuperarDadosProfessor();
//        Model.EstudanteModel model = RecuperarDadosEstudante();

        //Cria a view para escrever os detalhes do estudante no console
//        View.ProfessorView view = new View.ProfessorView();
//        View.EstudanteView view = new View.EstudanteView();

        // Instancia o controlador para a classe estudante
//        Controller.ProfessorController controller = new Controller.ProfessorController(model, view);
//        Controller.EstudanteController controller = new Controller.EstudanteController(model, view);
        // chama a classe view para mostrar dados do estudante
//        controller.alterarView();
//        controller.alterarView();
        //altera dados do modelo
//        controller.setProfessorNome("Hugo");
//        controller.setEstudanteNome("Joao");
        // chama a classe view para mostrar as alterações nos dados do estudante
//        controller.alterarView();

/*    }

    private static Model.EstudanteModel RecuperarDadosEstudante() {
        Model.EstudanteModel estudante = new Model.EstudanteModel();
        estudante.setNome("Roberto");
        estudante.setId(10);
        return estudante;
    }

    
    private static Model.ProfessorModel RecuperarDadosProfessor(){
        Model.ProfessorModel professor = new Model.ProfessorModel();
        professor.setId(01);
        professor.setNome("Wilson");
        professor.setDisciplina("Padrões de Projeto e Reuso de Software");
        return professor;
    }
*/
    
//    =========================================================================================
    Model.EstudanteService estudante = new Model.EstudanteService();
    estudante.loadEstudantes();
    
    
 }   
}
