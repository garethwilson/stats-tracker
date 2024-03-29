package gazbox.tracker.stats.model;

import javax.persistence.*;

/**
 * Created by: gareth
 * Date: 27/12/12
 * Time: 9:10 AM
 */
@Entity
public class Opposition extends BaseEntity {

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
}
