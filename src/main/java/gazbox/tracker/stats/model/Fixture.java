package gazbox.tracker.stats.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by: gareth
 * Date: 27/12/12
 * Time: 9:10 AM
 */
@Entity
public class Fixture extends BaseEntity{

    @ManyToOne(fetch = FetchType.EAGER)
    private Opposition opposition;

    @Column(nullable = false)
    private Date datePlayed;

    @Override
    public String getDisplayText() {
        return "Fixture against " + opposition.getName() + " on " + datePlayed;
    }

    public Opposition getOpposition() {
        return opposition;
    }

    public void setOpposition(Opposition opposition) {
        this.opposition = opposition;
    }

    public Date getDatePlayed() {
        return datePlayed;
    }

    public void setDatePlayed(Date datePlayed) {
        this.datePlayed = datePlayed;
    }



}
