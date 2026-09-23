package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NoClassDefFoundError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class Entities_escape_196567158716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term397;
     Object term409;
     Object term411;
     Object term413;

    public Entities_escape_196567158716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term366 = (byte[]) newByteArray(16);
        setField(term365, term365.getClass(), "value", term366);
        setByteField(term365, term365.getClass(), "coder", (byte) 47);
        setIntField(term365, term365.getClass(), "count", 1162663216);
        Class<? extends Object> term3244 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term3243 = ((Class) term3244).getDeclaredField((String) "html");
        ((Field) term3243).setAccessible(true);
        Object enum4 = ((Field) term3243).get((Object) null);
        term397 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term397, term397.getClass(), "escapeMode", null);
        setField(term397, term397.getClass(), "charset", null);
        setField(term397, term397.getClass(), "charsetEncoder", null);
        setBooleanField(term397, term397.getClass(), "prettyPrint", false);
        setBooleanField(term397, term397.getClass(), "outline", false);
        setIntField(term397, term397.getClass(), "indentAmount", 1484323161);
        setField(term397, term397.getClass(), "syntax", enum4);
        term409 = new Boolean(true);
        term411 = new Boolean(true);
        term413 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Entities");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term365;
        args[1] = "jJCZpVmanW";
        args[2] = term397;
        args[3] = term409;
        args[4] = term411;
        args[5] = term413;
        try {
            callMethod(klass, "escape", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


