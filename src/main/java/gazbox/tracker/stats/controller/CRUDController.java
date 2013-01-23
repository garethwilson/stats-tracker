package gazbox.tracker.stats.controller;

import gazbox.tracker.stats.model.BaseEntity;
import gazbox.tracker.stats.service.EntityManagerDAO;

import javax.enterprise.context.Conversation;
import javax.inject.Inject;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by: gareth
 * Date: 9/01/13
 * Time: 5:06 PM
 */
@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
public abstract class CRUDController<T extends BaseEntity> implements Serializable {

    private Long id;

    private T instance;

    @Inject
    private EntityManagerDAO dao;

    @Inject
    private Conversation conversation;

    public void initConversation() {
        if (conversation.isTransient()) {
            conversation.begin();
        }
    }

    public T getInstance() {
        if (instance == null) {
            if (id != null) {
                instance = loadInstance();
            } else {
                instance = createInstance();
            }
        }
        return instance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private T loadInstance() {
        return dao.find(getClassType(), getId());
    }

    private T createInstance() {
        try {
            return getClassType().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Class<T> getClassType() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass()
                .getGenericSuperclass();
        return (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }

    public boolean isManaged() {
        return getInstance().getId() != null;
    }

    public String save() {
        if (isManaged()) {
            dao.updateObject(getInstance());
        } else {
            dao.createObject(getInstance());
        }
        conversation.end();
        return "saved";
    }

    public String cancel() {
        conversation.end();
        return "cancelled";
    }

    public String delete() {
        System.out.println("Delete called for ID " + id);
        dao.deleteObject(getInstance());
        conversation.end();
        return "deleted";
    }


}
