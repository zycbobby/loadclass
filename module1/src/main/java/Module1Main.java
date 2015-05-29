import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by zuo on 15-5-29.
 */
public class Module1Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        System.out.println(new Module1Main().getFileEb());
    }

    public long getFileEb() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Class aClass = Class.forName("org.apache.commons.io.FileUtils");
        Field one_eb = aClass.getField("ONE_EB");
        return one_eb.getLong(null);
    }
}
