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

public class Entities_escape_62812538015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public Entities_escape_62812538015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2670 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2669 = ((Class) term2670).getDeclaredField((String) "html");
        ((Field) term2669).setAccessible(true);
        Object enum3 = ((Field) term2669).get((Object) null);
        term79 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term79, term79.getClass(), "escapeMode", null);
        setField(term79, term79.getClass(), "charset", null);
        setField(term79, term79.getClass(), "charsetEncoder", null);
        setBooleanField(term79, term79.getClass(), "prettyPrint", false);
        setBooleanField(term79, term79.getClass(), "outline", false);
        setIntField(term79, term79.getClass(), "indentAmount", 568599855);
        setField(term79, term79.getClass(), "syntax", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Entities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = term79;
        try {
            callMethod(klass, "escape", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


