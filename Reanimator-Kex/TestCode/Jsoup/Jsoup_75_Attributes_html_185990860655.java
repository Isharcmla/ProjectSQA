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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Attributes_html_185990860655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609;
     Object term613;

    public Attributes_html_185990860655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term611 = (Object[]) newArray("java.lang.String", 0);
        Object[] term612 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term609, term609.getClass(), "size", 590364439);
        setField(term609, term609.getClass(), "keys", term611);
        setField(term609, term609.getClass(), "vals", term612);
        Class<? extends Object> term54216 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term54215 = ((Class) term54216).getDeclaredField((String) "base");
        ((Field) term54215).setAccessible(true);
        Object enum3 = ((Field) term54215).get((Object) null);
        Class<? extends Object> term54436 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term54435 = ((Class) term54436).getDeclaredField((String) "utf");
        ((Field) term54435).setAccessible(true);
        Object enum4 = ((Field) term54435).get((Object) null);
        Class<? extends Object> term54632 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term54631 = ((Class) term54632).getDeclaredField((String) "html");
        ((Field) term54631).setAccessible(true);
        Object enum5 = ((Field) term54631).get((Object) null);
        term613 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term2286 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term2294 = (Object[]) newArray("java.lang.String", 2);
        Object term2320 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term613, term613.getClass(), "escapeMode", enum3);
        setField(term2286, term2286.getClass(), "name", "UTF-8");
        setElement(term2294, 0, "UTF8");
        setElement(term2294, 1, "unicode-1-1-utf-8");
        setField(term2286, term2286.getClass(), "aliases", term2294);
        setField(term2286, term2286.getClass(), "aliasSet", null);
        setField(term613, term613.getClass(), "charset", term2286);
        setIntField(term2320, term2320.getClass(), "threadLocalHashCode", 153021684);
        setField(term613, term613.getClass(), "encoderThreadLocal", term2320);
        setField(term613, term613.getClass(), "coreCharset", enum4);
        setBooleanField(term613, term613.getClass(), "prettyPrint", true);
        setBooleanField(term613, term613.getClass(), "outline", false);
        setIntField(term613, term613.getClass(), "indentAmount", 1);
        setField(term613, term613.getClass(), "syntax", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term613;
        try {
            callMethod(klass, "html", argTypes, term609, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


