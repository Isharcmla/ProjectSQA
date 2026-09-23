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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Attribute_shouldCollapseAttribute_1489449534137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191218;
     Object term191621;

    public Attribute_shouldCollapseAttribute_1489449534137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191627 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term191626 = ((Class) term191627).getDeclaredField((String) "xml");
        ((Field) term191626).setAccessible(true);
        Object enum52 = ((Field) term191626).get((Object) null);
        term191218 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term191218, term191218.getClass(), "syntax", enum52);
        Class<? extends Object> term191873 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term191872 = ((Class) term191873).getDeclaredField((String) "xml");
        ((Field) term191872).setAccessible(true);
        Object enum53 = ((Field) term191872).get((Object) null);
        term191621 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term191621, term191621.getClass(), "escapeMode", null);
        setField(term191621, term191621.getClass(), "charset", null);
        setField(term191621, term191621.getClass(), "encoderThreadLocal", null);
        setField(term191621, term191621.getClass(), "coreCharset", null);
        setBooleanField(term191621, term191621.getClass(), "prettyPrint", false);
        setBooleanField(term191621, term191621.getClass(), "outline", false);
        setIntField(term191621, term191621.getClass(), "indentAmount", 0);
        setField(term191621, term191621.getClass(), "syntax", enum53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term191218;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term191218, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


