package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	public static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("musicHibernate");
	
	public static EntityManager getEntityManager() {
		return JPAUtil.FACTORY.createEntityManager();
	}

}
