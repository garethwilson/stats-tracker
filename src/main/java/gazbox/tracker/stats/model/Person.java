package gazbox.tracker.stats.model;

import javax.annotation.Generated;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by: gareth
 * Date: 26/12/12
 * Time: 10:55 AM
 */
@Named
@Entity
public class Person {

    @Id
    private long id;

    private String name;

    private Date createdDate;

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
