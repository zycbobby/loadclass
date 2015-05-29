import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by zuo on 15-5-29.
 */
public class Module2Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Class aClass = Class.forName("org.apache.commons.io.FileUtils");
        Field one_eb = aClass.getField("ONE_EB");
        System.out.println(one_eb.getLong(null));
        System.out.println(new Module1Main().getFileEb());
    }
}
