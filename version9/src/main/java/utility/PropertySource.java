package utility;

/**
 * Created by Julia on 18.04.2017.
 */
public enum PropertySource {

    ENVIRONMENT("properties/environment.properties"),
    CRED("properties/cred.properties"),
    URL("properties/url.properties"),
    VALUES("properties/values.properties"),
    CSS("properties/css.properties");

    public String sourceFile;

    PropertySource(String sourceFile) {
        this.sourceFile = sourceFile;
    }
}
