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

public class Attribute_shouldCollapseAttribute_77820687853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136171;
     Object term136331;
     Object term137001;
     Object term137006;

    public Attribute_shouldCollapseAttribute_77820687853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136171 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term136171, term136171.getClass(), "key", "xml");
        setField(term136171, term136171.getClass(), "val", "                                         ");
        Class<? extends Object> term137014 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term137013 = ((Class) term137014).getDeclaredField((String) "xml");
        ((Field) term137013).setAccessible(true);
        Object enum31 = ((Field) term137013).get((Object) null);
        term136331 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term136331, term136331.getClass(), "syntax", enum31);
        term137001 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term137001, term137001.getClass(), "key", "xml");
        setField(term137001, term137001.getClass(), "val", "                                         ");
        setField(term137001, term137001.getClass(), "parent", null);
        Class<? extends Object> term137304 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term137303 = ((Class) term137304).getDeclaredField((String) "html");
        ((Field) term137303).setAccessible(true);
        Object enum32 = ((Field) term137303).get((Object) null);
        term137006 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term137006, term137006.getClass(), "escapeMode", null);
        setField(term137006, term137006.getClass(), "charset", null);
        setField(term137006, term137006.getClass(), "encoderThreadLocal", null);
        setField(term137006, term137006.getClass(), "coreCharset", null);
        setBooleanField(term137006, term137006.getClass(), "prettyPrint", false);
        setBooleanField(term137006, term137006.getClass(), "outline", false);
        setIntField(term137006, term137006.getClass(), "indentAmount", 0);
        setField(term137006, term137006.getClass(), "syntax", enum32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term136331;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term136171, args);
        assertTrue(recursiveEquals(term136171, term137001));
        assertTrue(recursiveEquals(term136331, term137006));
    }

};


