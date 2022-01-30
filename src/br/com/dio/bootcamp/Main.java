package br.com.dio.bootcamp;

import java.time.LocalDate;

import br.com.dio.bootcamp.dominio.Bootcamp;
import br.com.dio.bootcamp.dominio.Curso;
import br.com.dio.bootcamp.dominio.Dev;
import br.com.dio.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso javascript");
		curso2.setDescricao("descricao curso javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAnderson = new Dev();
		Dev devReginaldo = new Dev();
		
		devAnderson.setNome("Anderson");
		devReginaldo.setNome("Reginaldo");
		
		devAnderson.inscreverBootcamp(bootcamp);
		devReginaldo.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos" + devAnderson.getConteudosInscritos());
		System.out.println("Conteudos Inscritos" + devReginaldo.getConteudosInscritos());
		
		devAnderson.progredir();
		devReginaldo.progredir();
		devReginaldo.progredir();
		
		System.out.println("XP: " + devAnderson.calcularTotalXp());
		System.out.println("XP: " + devReginaldo.calcularTotalXp());
		
		
		
		System.out.println("Conteudos Concluidos" + devAnderson.getConteudosConcluidos());
		System.out.println("Conteudos Concluidos" + devReginaldo.getConteudosConcluidos());
		
		}
	}


