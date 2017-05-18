package br.com.dansilva.sisorcamento.infraestrutura.persistencia;

import javax.persistence.EntityManager;

public class PersistenciaTest {
	
	public void deveCriarOEntityManagerFactoryEEntityManager(){
		
		EntityManager em = JPAUtil.getEntityManager();
		em.close();
	}
}
