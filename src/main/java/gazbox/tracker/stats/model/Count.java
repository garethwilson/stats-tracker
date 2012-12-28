package gazbox.tracker.stats.model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by: gareth
 * Date: 26/12/12
 * Time: 11:02 AM
 */
public class Count {

    @Id
    private long id;

    @ManyToOne
    private StatisticType type;

    @ManyToOne
    private Fixture fixture;

    @ManyToOne
    private Person person;

    private int value;

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
