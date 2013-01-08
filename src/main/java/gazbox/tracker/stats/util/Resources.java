package gazbox.tracker.stats.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by: gareth
 * Date: 8/01/13
 * Time: 4:29 PM
 */
public class Resources {

    @Produces
    @PersistenceContext
    private EntityManager em;
}
