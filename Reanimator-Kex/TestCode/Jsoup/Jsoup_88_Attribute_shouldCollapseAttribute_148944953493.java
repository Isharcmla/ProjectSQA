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

public class Attribute_shouldCollapseAttribute_148944953493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150298;
     Object term150839;

    public Attribute_shouldCollapseAttribute_148944953493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150847 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term150846 = ((Class) term150847).getDeclaredField((String) "xml");
        ((Field) term150846).setAccessible(true);
        Object enum46 = ((Field) term150846).get((Object) null);
        term150298 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term150298, term150298.getClass(), "syntax", enum46);
        Class<? extends Object> term151093 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term151092 = ((Class) term151093).getDeclaredField((String) "xml");
        ((Field) term151092).setAccessible(true);
        Object enum47 = ((Field) term151092).get((Object) null);
        term150839 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term150839, term150839.getClass(), "escapeMode", null);
        setField(term150839, term150839.getClass(), "charset", null);
        setField(term150839, term150839.getClass(), "encoderThreadLocal", null);
        setField(term150839, term150839.getClass(), "coreCharset", null);
        setBooleanField(term150839, term150839.getClass(), "prettyPrint", false);
        setBooleanField(term150839, term150839.getClass(), "outline", false);
        setIntField(term150839, term150839.getClass(), "indentAmount", 0);
        setField(term150839, term150839.getClass(), "syntax", enum47);
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
        args[2] = term150298;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term150298, ""));
        assertTrue(recursiveEquals(retValue, false));
    }

};


