package gazbox.tracker.stats.service;

import gazbox.tracker.stats.model.Person;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by: gareth
 * Date: 8/01/13
 * Time: 3:45 PM
 */
@Stateless
public class PersonService implements Serializable {

    @Inject
    EntityManager em;

    public void persistPerson(Person person) {
        person.setCreatedDate(new Date());
        em.persist(person);
    }

    public List<Person> getAllPlayers() {
        return em.createQuery("select p from Person p").getResultList();
    }

}
