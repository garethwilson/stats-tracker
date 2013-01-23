package gazbox.tracker.stats.controller;

import gazbox.tracker.stats.model.Fixture;
import gazbox.tracker.stats.model.Opposition;
import gazbox.tracker.stats.model.Player;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by: gareth
 * Date: 9/01/13
 * Time: 5:32 PM
 */
@ApplicationScoped
public class DataFactory {

    @Inject
    private EntityManager em;

    @Named
    @Produces
    @RequestScoped
    public List<Player> getPlayers() {

        List<Player> players = em.createQuery(
                "select p from Player p").getResultList();

        System.out.println("Loaded players: " + players);

        return players;
    }

    @Named
    @Produces
    @RequestScoped
    public List<Fixture> getFixtures() {

        List<Fixture> fixtures = em.createQuery(
                "select f from Fixture f").getResultList();

        System.out.println("Loaded fixtures: " + fixtures);

        return fixtures;
    }

    @Named
    @Produces
    @RequestScoped
    public List<Opposition> getOppositions() {

        List<Opposition> oppositions = em.createQuery(
                "select o from Opposition o").getResultList();

        System.out.println("Loaded oppositions: " + oppositions);

        return oppositions;
    }
}
