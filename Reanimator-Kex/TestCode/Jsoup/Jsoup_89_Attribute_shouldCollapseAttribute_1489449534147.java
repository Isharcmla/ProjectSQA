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

public class Attribute_shouldCollapseAttribute_1489449534147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224505;
     Object term224908;

    public Attribute_shouldCollapseAttribute_1489449534147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term224914 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term224913 = ((Class) term224914).getDeclaredField((String) "xml");
        ((Field) term224913).setAccessible(true);
        Object enum61 = ((Field) term224913).get((Object) null);
        term224505 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term224505, term224505.getClass(), "syntax", enum61);
        Class<? extends Object> term225160 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term225159 = ((Class) term225160).getDeclaredField((String) "xml");
        ((Field) term225159).setAccessible(true);
        Object enum62 = ((Field) term225159).get((Object) null);
        term224908 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term224908, term224908.getClass(), "escapeMode", null);
        setField(term224908, term224908.getClass(), "charset", null);
        setField(term224908, term224908.getClass(), "encoderThreadLocal", null);
        setField(term224908, term224908.getClass(), "coreCharset", null);
        setBooleanField(term224908, term224908.getClass(), "prettyPrint", false);
        setBooleanField(term224908, term224908.getClass(), "outline", false);
        setIntField(term224908, term224908.getClass(), "indentAmount", 0);
        setField(term224908, term224908.getClass(), "syntax", enum62);
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
        args[2] = term224505;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term224505, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


