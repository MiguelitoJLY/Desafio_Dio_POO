package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso Spring Boot");
		curso2.setDescricao("Descrição Curso Spring Boot");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
//			System.out.println(curso1);
//			System.out.println(curso2);
//			System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Miguel");
		dev1.inscrever(bootcamp);
		dev1.progredir();
		dev1.progredir();
		
		System.out.println("Conteúdos Inscritos do " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos do " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
		System.out.println("XP total do " + dev1.getNome() + ": " + dev1.calcularTotalXp());
		
		System.out.println("---------------------------------------------");

		Dev dev2 = new Dev();
		dev2.setNome("Ícaro");
		dev2.inscrever(bootcamp);
		dev2.progredir();	
		
		System.out.println("Conteúdos Inscritos do " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos do " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
		System.out.println("XP total do " + dev2.getNome() + ": " + dev2.calcularTotalXp());
	}

}
