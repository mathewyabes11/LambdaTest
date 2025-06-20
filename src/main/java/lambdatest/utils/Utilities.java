package lambdatest.utils;

import java.util.Date;

public class Utilities {
    public static final int IMPLICIT_WAIT_TIME = 10;
    public static final int WEB_DRIVER_WAIT_TIME = 10;

    public static String generateTimeStamp() {
        Date date = new Date();
        String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
        String email = "mathew" + timeStamp + "@gmail.com";
        return email;
    }
}
