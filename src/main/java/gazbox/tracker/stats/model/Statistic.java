package gazbox.tracker.stats.model;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Created by: gareth
 * Date: 26/12/12
 * Time: 11:02 AM
 */
public class Statistic {

    @Id
    private long id;

    @ManyToOne
    private StatisticType type;

    private int count;

    @ManyToMany
    private Person person;
}
