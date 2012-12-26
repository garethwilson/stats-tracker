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

    @ManyToMany
    private Fixture fixture;

    @ManyToMany
    private Person person;

    private int count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StatisticType getType() {
        return type;
    }

    public void setType(StatisticType type) {
        this.type = type;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
