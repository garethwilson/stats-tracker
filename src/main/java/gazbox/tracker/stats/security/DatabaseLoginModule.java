package gazbox.tracker.stats.security;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import java.util.Map;

/**
 * Created by: gareth
 * Date: 21/01/13
 * Time: 6:35 PM
 */
public class DatabaseLoginModule implements LoginModule {

    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
        System.out.println("initialize called with Subject:" + subject + ", CallbackHandler: " + callbackHandler + ", sharedState: " + sharedState + ", options: " + options);
    }

    @Override
    public boolean login() throws LoginException {

        System.out.println("login called");

        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean commit() throws LoginException {

        System.out.println("commit called");

        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean abort() throws LoginException {

        System.out.println("abort called");

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean logout() throws LoginException {

        System.out.println("logout called");

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
