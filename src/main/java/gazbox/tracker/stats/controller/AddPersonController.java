package gazbox.tracker.stats.controller;

import gazbox.tracker.stats.model.Person;
import gazbox.tracker.stats.service.PersonService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by: gareth
 * Date: 8/01/13
 * Time: 3:44 PM
 */
@Named
@RequestScoped
public class AddPersonController implements Serializable {

    private Person person = new Person();

    @Inject
    private PersonService personService;

    public void addPerson() {
           personService.persistPerson(person);

          System.out.println("DB now contains: " + personService.getAllPlayers());
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Person> getPlayers() {
        return personService.getAllPlayers();
    }
}
