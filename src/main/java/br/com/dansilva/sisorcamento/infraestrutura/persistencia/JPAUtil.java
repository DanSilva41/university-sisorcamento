package br.com.dansilva.sisorcamento.infraestrutura.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class JPAUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("sisorcamento");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
