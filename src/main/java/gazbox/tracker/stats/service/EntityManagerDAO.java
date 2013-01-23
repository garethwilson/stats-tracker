package gazbox.tracker.stats.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;


@Stateless
public class EntityManagerDAO implements Serializable {

    @Inject
    private EntityManager em;

    public Object updateObject(Object object) {
        return em.merge(object);
    }

    public void createObject(Object object) {
        em.persist(object);
    }

    public void refresh(Object object) {
        em.refresh(object);
    }

    public <T> T find(Class<T> clazz, Long id) {
        return em.find(clazz, id);
    }

    public void deleteObject(Object object) {
        em.remove(em.merge(object));
    }

}
