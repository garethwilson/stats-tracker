package gazbox.tracker.stats.model;

import javax.persistence.*;

/**
 * Created by: gareth
 * Date: 27/12/12
 * Time: 9:10 AM
 */
@Entity
public class Opposition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
