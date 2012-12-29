package gazbox.tracker.stats.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by: gareth
 * Date: 29/12/12
 * Time: 2:23 PM
 */
@Entity
public class User {

    @Id
    private long id;

    private String username;

    private String hashedPassword;

    private String salt;
}
