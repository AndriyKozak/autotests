package utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Julia on 17.04.2017.
 */
public class PropertyLoader {

    private static Map<PropertySource, Properties> propsMap = new HashMap<>();

    public static String loadProperty(PropertySource source, String propertyName) {
        Properties properties = propsMap.get(source);
        if(properties == null)
            properties = preloadProperties(source);
        String property = properties.getProperty(propertyName);
        if (property == null) {
            return "No property file found";
        } else {
            return property;
        }
    }

    private static Properties preloadProperties(PropertySource source){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(source.sourceFile)) {
            Properties properties = new Properties();
            properties.load(resourceStream);
            propsMap.put(source, properties);
            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
