package HW07;

public class Logger {
// константи для використання кольору в виводі повідомлень
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public enum Level {
        INFO, DEBUG, WARN, ERROR
    }

    private Level level;

    public Logger(Level level) {
        this.level = level;
    }

    public void log(Level logLevel, String message) {
        if (logLevel.ordinal() >= this.level.ordinal()) {
            System.out.println("[" + logLevel.toString() + "] " + message);
        }
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void warn(String message) {
        log(Level.WARN, message);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }
}

