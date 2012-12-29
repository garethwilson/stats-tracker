package gazbox.stats.tracker.service;

import gazbox.tracker.stats.service.AuthenticationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by: gareth
 * Date: 30/12/12
 * Time: 10:10 AM
 */
public class AuthenticationServiceTest {

    private AuthenticationService testee;

    @Before
    public void setup() {
           testee = new AuthenticationService();
    }

    @Test
    public void testAuthenticateUser() {
        Assert.assertNull("Not implemented so should be null", testee.authenticateUser("username", "password"));
    }
}
