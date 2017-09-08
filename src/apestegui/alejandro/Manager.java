package apestegui.alejandro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manager {

	public static void main(String[] args) {

		EntityManagerFactory factory = new Persistence().createEntityManagerFactory("EclipseLink");
		EntityManager entityManager = factory.createEntityManager();

	}
}
