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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Attribute_html_82120855528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45366;
     Object term45395;

    public Attribute_html_82120855528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45366 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term45391 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term45393 = (Object[]) newArray("java.lang.String", 0);
        Object[] term45394 = (Object[]) newArray("java.lang.String", 0);
        setField(term45366, term45366.getClass(), "key", "HyxfbSQYBe");
        setField(term45366, term45366.getClass(), "val", "pCTimMblYc");
        setIntField(term45391, term45391.getClass(), "size", -1955890973);
        setField(term45391, term45391.getClass(), "keys", term45393);
        setField(term45391, term45391.getClass(), "vals", term45394);
        setField(term45366, term45366.getClass(), "parent", term45391);
        Class<? extends Object> term79139 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term79138 = ((Class) term79139).getDeclaredField((String) "base");
        ((Field) term79138).setAccessible(true);
        Object enum15 = ((Field) term79138).get((Object) null);
        Class<? extends Object> term79359 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term79358 = ((Class) term79359).getDeclaredField((String) "fallback");
        ((Field) term79358).setAccessible(true);
        Object enum16 = ((Field) term79358).get((Object) null);
        Class<? extends Object> term79570 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term79569 = ((Class) term79570).getDeclaredField((String) "html");
        ((Field) term79569).setAccessible(true);
        Object enum17 = ((Field) term79569).get((Object) null);
        term45395 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term47068 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term47076 = (Object[]) newArray("java.lang.String", 2);
        Object term47102 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term45395, term45395.getClass(), "escapeMode", enum15);
        setField(term47068, term47068.getClass(), "name", "UTF-8");
        setElement(term47076, 0, "UTF8");
        setElement(term47076, 1, "unicode-1-1-utf-8");
        setField(term47068, term47068.getClass(), "aliases", term47076);
        setField(term47068, term47068.getClass(), "aliasSet", null);
        setField(term45395, term45395.getClass(), "charset", term47068);
        setIntField(term47102, term47102.getClass(), "threadLocalHashCode", 1027242850);
        setField(term45395, term45395.getClass(), "encoderThreadLocal", term47102);
        setField(term45395, term45395.getClass(), "coreCharset", enum16);
        setBooleanField(term45395, term45395.getClass(), "prettyPrint", true);
        setBooleanField(term45395, term45395.getClass(), "outline", false);
        setIntField(term45395, term45395.getClass(), "indentAmount", 1);
        setField(term45395, term45395.getClass(), "syntax", enum17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term45395;
        try {
            callMethod(klass, "html", argTypes, term45366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


