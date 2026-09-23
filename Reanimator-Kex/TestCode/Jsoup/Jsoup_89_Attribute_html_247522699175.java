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
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public class Attribute_html_247522699175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304754;
     Object term304838;

    public Attribute_html_247522699175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304754 = new StringBuilder();
        Class<? extends Object> term355703 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term355702 = ((Class) term355703).getDeclaredField((String) "xml");
        ((Field) term355702).setAccessible(true);
        Object enum65 = ((Field) term355702).get((Object) null);
        Class<? extends Object> term355949 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term355948 = ((Class) term355949).getDeclaredField((String) "extended");
        ((Field) term355948).setAccessible(true);
        Object enum66 = ((Field) term355948).get((Object) null);
        term304838 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term305136 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term304838, term304838.getClass(), "syntax", enum65);
        setField(term304838, term304838.getClass(), "escapeMode", enum66);
        setField(term304838, term304838.getClass(), "encoderThreadLocal", term305136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Appendable");
        argTypes[3] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term304754;
        args[3] = term304838;
        try {
            callMethod(klass, "html", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


