package gazbox.tracker.stats.model;

import javax.inject.Named;
import java.util.Date;

/**
 * Created by: gareth
 * Date: 26/12/12
 * Time: 10:55 AM
 */
@Named
public class Person {

    private String name;

    private Date createdDate;

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
