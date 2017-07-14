package br.edu.ifmt.cba.alphalab.business;

import java.util.List;

import br.edu.ifmt.cba.alphalab.dao.IDAO;
import br.edu.ifmt.cba.alphalab.dao.IProfessorDAO;
import br.edu.ifmt.cba.alphalab.entity.ProfessorEntity;
import br.edu.ifmt.cba.alphalab.entity.exception.ProfessorException;

/**
 * 
 * @author St�villis Sousa
 *
 */

public class Professor extends ABusiness<ProfessorEntity, ProfessorException, IProfessorDAO> {

	public Professor(IDAO<ProfessorEntity> dao) {
		super(dao);
	}

	public List<ProfessorEntity> getByNome(String nome) {
		return ((IProfessorDAO) dao).getByNome(nome);
	}

}