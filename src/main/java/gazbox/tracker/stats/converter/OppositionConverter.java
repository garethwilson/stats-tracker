package gazbox.tracker.stats.converter;

import gazbox.tracker.stats.model.Opposition;
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
public class OppositionConverter implements Converter {

    @Inject
    private EntityManagerDAO dao;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return dao.find(Opposition.class, Long.valueOf(s));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o instanceof Opposition) {
            return String.valueOf(((Opposition) o).getId());
        }

        return null;
    }
}
