package gazbox.tracker.stats.controller;

import gazbox.tracker.stats.model.Fixture;
import gazbox.tracker.stats.model.Player;
import org.primefaces.model.DualListModel;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: gareth
 * Date: 9/01/13
 * Time: 4:32 PM
 */
@Named
@ConversationScoped
public class FixtureController extends CRUDController<Fixture> {

    @Inject
    private List<Player> allPlayers;
    private DualListModel<Player> players;

    @PostConstruct
    public void loadPlayers() {

        List<Player> source = new ArrayList<>();
        List<Player> target = new ArrayList<>();

        source.addAll(allPlayers);

        if (isManaged()) {
            source.removeAll(getInstance().getPlayers());
            target.addAll(getInstance().getPlayers());
        }

        players = new DualListModel<>(source, target);
    }

    @Override
    public String save() {

        getInstance().setPlayers(players.getTarget());

        System.out.println("Saving fixture " + getInstance() + " with players " + getInstance().getPlayers());

        return super.save();
    }

    public DualListModel<Player> getPlayers() {
        return players;
    }

    public void setPlayers(DualListModel<Player> players) {
        this.players = players;
    }
}
