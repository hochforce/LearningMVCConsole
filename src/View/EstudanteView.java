/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author hochforce
 */
public class EstudanteView {

    public void imprimeDetalhesEstudante(String estudanteNome, Integer estudanteId, String estudanteSobrenome, Integer estudanteIdade) {
        System.out.println("Estudante ");
        System.out.println("Id: " + estudanteId);
        System.out.println("Nome: " + estudanteNome);
        System.out.println("Sobrenome: " + estudanteSobrenome);
        System.out.println("Idade: " + estudanteIdade);
    }
}
