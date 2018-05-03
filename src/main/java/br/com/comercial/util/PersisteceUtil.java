package br.com.comercial.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersisteceUtil {
	public static EntityManagerFactory emf = null;
	public static EntityManager em = null;
	
		public static EntityManager getEntityManager() {
			if(emf == null) {
				emf = Persistence.createEntityManagerFactory("comercialPU");
			}
			if(em == null) {
				em = emf.createEntityManager();
			}
			return em;
		}
}
