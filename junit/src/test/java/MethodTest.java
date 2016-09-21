import sun.applet.Main;

import static org.junit.Assert.*;

/**
 * Created by Eugen on 9/18/2016.
 */
public class MethodTest extends Main {
    @org.junit.Test
    public void match() throws Exception {
        new Method().match(a, 5);
    }

}
