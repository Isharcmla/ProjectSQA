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

public class Attribute_shouldCollapseAttribute_148944953491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147638;
     Object term148179;

    public Attribute_shouldCollapseAttribute_148944953491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148187 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term148186 = ((Class) term148187).getDeclaredField((String) "xml");
        ((Field) term148186).setAccessible(true);
        Object enum46 = ((Field) term148186).get((Object) null);
        term147638 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term147638, term147638.getClass(), "syntax", enum46);
        Class<? extends Object> term148433 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term148432 = ((Class) term148433).getDeclaredField((String) "xml");
        ((Field) term148432).setAccessible(true);
        Object enum47 = ((Field) term148432).get((Object) null);
        term148179 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term148179, term148179.getClass(), "escapeMode", null);
        setField(term148179, term148179.getClass(), "charset", null);
        setField(term148179, term148179.getClass(), "encoderThreadLocal", null);
        setField(term148179, term148179.getClass(), "coreCharset", null);
        setBooleanField(term148179, term148179.getClass(), "prettyPrint", false);
        setBooleanField(term148179, term148179.getClass(), "outline", false);
        setIntField(term148179, term148179.getClass(), "indentAmount", 0);
        setField(term148179, term148179.getClass(), "syntax", enum47);
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
        args[1] = "";
        args[2] = term147638;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term147638, ""));
        assertTrue(recursiveEquals(retValue, false));
    }

};


