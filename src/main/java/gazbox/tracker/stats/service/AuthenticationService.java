package gazbox.tracker.stats.service;

import gazbox.tracker.stats.model.User;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by: gareth
 * Date: 30/12/12
 * Time: 10:03 AM
 */
public class AuthenticationService {

    @Inject
    EntityManager em;

    public User authenticateUser(final String username, final String password) {

        User user = (User) em.createQuery("select user from User user where user.username = :username").setParameter("username", username).getSingleResult();

        if (user.getHashedPassword().equals(password)) {
            return user;
        }

        return null;
    }
}
