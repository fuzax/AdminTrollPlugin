import java.util.logging.Logger;

public class ActionLogger {
    private static final Logger logger = Logger.getLogger(ActionLogger.class.getName());

    public static void logAction(String action) {
        logger.info("Action Logged: " + action);
    }
}