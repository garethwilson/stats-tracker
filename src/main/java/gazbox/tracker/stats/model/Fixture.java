package gazbox.tracker.stats.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by: gareth
 * Date: 27/12/12
 * Time: 9:10 AM
 */
@Entity
public class Fixture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Opposition opposition;

    @Column(nullable = false)
    private Date datePlayed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
