package pl.coderslab;

import org.apache.log4j.Logger;
public class App {

    static Logger log = Logger.getLogger("pl.coderslab");

    public static void main(String[] args) {
        log.debug("Test debug");
        log.error("Some error");

    }
}
