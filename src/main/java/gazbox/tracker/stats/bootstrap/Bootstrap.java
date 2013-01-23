package gazbox.tracker.stats.bootstrap;

import gazbox.tracker.stats.model.User;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by: gareth
 * Date: 23/01/13
 * Time: 9:42 PM
 */
@Singleton
@Startup
public class Bootstrap {

    @Inject
    private EntityManager em;

    @PostConstruct
    public void bootstrap() {

        System.out.println("Bootstrapping");

        User user = new User();
        user.setUsername("gareth");
        user.setPassword("password");

        em.persist(user);

        System.out.println("Default user added");
    }
}
