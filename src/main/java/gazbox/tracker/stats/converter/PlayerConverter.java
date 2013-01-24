package gazbox.tracker.stats.converter;

import gazbox.tracker.stats.model.Player;
import gazbox.tracker.stats.service.EntityManagerDAO;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by: gareth
 * Date: 21/01/13
 * Time: 3:07 PM
 */
@Named
public class PlayerConverter implements Converter {

    @Inject
    private EntityManagerDAO dao;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return dao.find(Player.class, Long.valueOf(s));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o instanceof Player) {
            return String.valueOf(((Player) o).getId());
        }

        return null;
    }
}
