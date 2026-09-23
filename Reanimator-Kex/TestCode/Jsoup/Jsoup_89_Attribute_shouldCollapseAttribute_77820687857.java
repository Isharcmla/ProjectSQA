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

public class Attribute_shouldCollapseAttribute_77820687857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136493;
     Object term136653;
     Object term137323;
     Object term137328;

    public Attribute_shouldCollapseAttribute_77820687857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136493 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term136493, term136493.getClass(), "key", "xml");
        setField(term136493, term136493.getClass(), "val", "                                         ");
        Class<? extends Object> term137336 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term137335 = ((Class) term137336).getDeclaredField((String) "html");
        ((Field) term137335).setAccessible(true);
        Object enum31 = ((Field) term137335).get((Object) null);
        term136653 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term136653, term136653.getClass(), "syntax", enum31);
        term137323 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term137323, term137323.getClass(), "key", "xml");
        setField(term137323, term137323.getClass(), "val", "                                         ");
        setField(term137323, term137323.getClass(), "parent", null);
        Class<? extends Object> term137629 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term137628 = ((Class) term137629).getDeclaredField((String) "html");
        ((Field) term137628).setAccessible(true);
        Object enum32 = ((Field) term137628).get((Object) null);
        term137328 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term137328, term137328.getClass(), "escapeMode", null);
        setField(term137328, term137328.getClass(), "charset", null);
        setField(term137328, term137328.getClass(), "encoderThreadLocal", null);
        setField(term137328, term137328.getClass(), "coreCharset", null);
        setBooleanField(term137328, term137328.getClass(), "prettyPrint", false);
        setBooleanField(term137328, term137328.getClass(), "outline", false);
        setIntField(term137328, term137328.getClass(), "indentAmount", 0);
        setField(term137328, term137328.getClass(), "syntax", enum32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term136653;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term136493, args);
        assertTrue(recursiveEquals(term136493, term137323));
        assertTrue(recursiveEquals(term136653, term137328));
    }

};


