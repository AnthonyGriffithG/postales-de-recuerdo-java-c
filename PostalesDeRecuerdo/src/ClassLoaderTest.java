

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ashraf
 * 
 */
public class ClassLoaderTest extends ClassLoader {

    public void invokeClassMethod(String classBinName, String path) {

        try {

            // Create a new JavaClassLoader 
            ClassLoader classLoader = this.getClass().getClassLoader();

            // Load the target class using its binary name
            Class<?> loadedMyClass = classLoader.loadClass(classBinName);

            System.out.println("Loaded class name: " + loadedMyClass.getName());

            // Create a new instance from the loaded class
            Constructor<?> constructor = loadedMyClass.getConstructor();
            Plugin plugin = (Plugin) constructor.newInstance();
            plugin.loadFile(path);

        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
        }

    }
}
