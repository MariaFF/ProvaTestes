package banco;

import java.lang.reflect.Method;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DAO {
	

	EntityManager em;

	public List listar(Class classe) {
		Query q = null;
		try {
			em = Banco.getInstancia().getEm();
			em.getTransaction().begin();
			q = em.createQuery("from " + classe.getSimpleName());
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return q.getResultList();
	}

	public void inserir(Object obj) {
		try {
			em = Banco.getInstancia().getEm();
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	public void exluir(Object objeto) throws Exception {
		try {
			em = Banco.getInstancia().getEm();
			em.getTransaction().begin();
			Method getChave = objeto.getClass().getMethod("getId", new Class[0]);
			objeto = em.find(objeto.getClass(), getChave.invoke(objeto, new Object[0]));
			em.remove(objeto);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}

	}

	public void alterar(Object objeto) {
		em = Banco.getInstancia().getEm();
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
	}


}
