package gazbox.tracker.stats.service;

import gazbox.tracker.stats.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by: gareth
 * Date: 30/12/12
 * Time: 10:03 AM
 */
public class AuthenticationService {

    @PersistenceContext
    EntityManager manager;


    public User authenticateUser(final String username, final String password) {
        return null;
    }
}
