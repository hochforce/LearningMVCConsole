package Model;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EstudanteService {
	
	private ArrayList<EstudanteModel> estudantes; 
	
	public void loadEstudantes() {
		estudantes = new ArrayList<EstudanteModel>();
		
		try {
	         File inputFile = new File("Estudante.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         
	         NodeList nList = doc.getElementsByTagName("estudante");
	         	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	        	 	        	 
	        	 Node nNode = nList.item(temp);
	        	 
	        		            
	        	 if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	        		 Element eElement = (Element) nNode;
	               
	        		 EstudanteModel estudante = new EstudanteModel();
	               
	        		 Integer id = Integer.parseInt(eElement.getAttribute("id"));
	        		 estudante.setId(id);
	        		 System.out.println("Estudante id : " + id);
	               
	        		 String nome = eElement.getElementsByTagName("nome").item(0).getTextContent();
	        		 estudante.setNome(nome);
	        		 System.out.println("Nome : " + nome);
	        		 
	        		 
	        		 // Fazer em sala de aula
	        		 // criar os atributos sobrenome e idade na classe EstudanteModel
	        		 // setar os valores dos atributos sobrenome e idade com os dados recuperados do arquivo xml
                                 String sobrenome = eElement.getElementsByTagName("sobrenome").item(0).getTextContent();
                                 estudante.setSobrenome(sobrenome);
                                 System.out.println("Sobrenome: " + sobrenome);
                                 
                                 Integer idade = Integer.parseInt(eElement.getAttribute("idade"));
                                 estudante.setIdade(idade);
                                 System.out.println("Idade: " + idade);
	        		 
	        		 System.out.println("Sobrenome : " + eElement.getElementsByTagName("sobrenome").item(0).getTextContent());
	        		 System.out.println("Idade : " + eElement.getElementsByTagName("idade").item(0).getTextContent());
	        		 System.out.println();
	        		 // adiciona o estudante na lista
	        		 estudantes.add(estudante);
	            }
	         }
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
		
	}
	
	// implementar em sala de aula
	public EstudanteModel getEstudante(Integer id){
		return null;
	}
	
	// implementar em sala de aula
	public void adicionaNovoEstudante(EstudanteModel estudante){
		
	}
	
	public void gavarEstudantesNaBaseXML(){
		
	}
		
	public ArrayList<EstudanteModel> getEstudantes(){
		return estudantes;
	}
	
	public void setEstudantes(ArrayList<EstudanteModel> estudantes){
		this.estudantes = estudantes;
	}
	
	public void limparEstudantes(){
		if (estudantes != null)
			estudantes.clear();
	}	
}
