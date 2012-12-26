package gazbox.tracker.stats.model;

import javax.persistence.Entity;

/**
 * Created by: gareth
 * Date: 26/12/12
 * Time: 11:47 AM
 */
@Entity
public class StatisticType {

    private long id;

    private String name;

    private String description;

    private AppliesTo appliesTo;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppliesTo getAppliesTo() {
        return appliesTo;
    }

    public void setAppliesTo(AppliesTo appliesTo) {
        this.appliesTo = appliesTo;
    }
}
