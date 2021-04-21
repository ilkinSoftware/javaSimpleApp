package util;

import java.io.*;

public class FileUtility {

    public static Object readFileDeserialize(String name) {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }

    }

    public static boolean writeObjectToFile(Object object, String name) throws RuntimeException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(object);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
}
