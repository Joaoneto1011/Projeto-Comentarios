package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Post;

public class ProgramaPrincipal {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Faça uma boa viagem!");
		Comentario c2 = new Comentario("Eita, isso é incrivel!");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajando para a espanha", 
				"Vou visitar esse país maravilhoso", 
				12);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Que Deus esteja com você");
		
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Boa noite pessoal",
				"Vejo vocês amanhã",
				5);
		
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	
	}

}
