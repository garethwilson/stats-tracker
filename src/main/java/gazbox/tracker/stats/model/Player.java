package gazbox.tracker.stats.model;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by: gareth
 * Date: 26/12/12
 * Time: 10:55 AM
 */
@Named
@Entity
public class Player extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Override
    public String getDisplayText() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
