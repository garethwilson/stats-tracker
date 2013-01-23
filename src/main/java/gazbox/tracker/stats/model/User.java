package gazbox.tracker.stats.model;

import javax.persistence.*;

/**
 * Created by: gareth
 * Date: 29/12/12
 * Time: 2:23 PM
 */
@Entity
public class User extends BaseEntity {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Override
    public String getDisplayText() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
