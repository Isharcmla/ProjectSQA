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
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Object;

public class Attributes_html_185990860638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;
     Object term671;
     Object term2283;
     Object term2286;

    public Attributes_html_185990860638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term647 = new LinkedHashMap();
        term646 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term646, term646.getClass(), "attributes", term647);
        Class<? extends Object> term2291 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2290 = ((Class) term2291).getDeclaredField((String) "html");
        ((Field) term2290).setAccessible(true);
        Object enum1 = ((Field) term2290).get((Object) null);
        term671 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term671, term671.getClass(), "escapeMode", null);
        setField(term671, term671.getClass(), "charset", null);
        setBooleanField(term671, term671.getClass(), "prettyPrint", false);
        setBooleanField(term671, term671.getClass(), "outline", false);
        setIntField(term671, term671.getClass(), "indentAmount", 568599855);
        setField(term671, term671.getClass(), "syntax", enum1);
        LinkedHashMap term2284 = new LinkedHashMap();
        term2283 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2283, term2283.getClass(), "attributes", term2284);
        Class<? extends Object> term2540 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2539 = ((Class) term2540).getDeclaredField((String) "html");
        ((Field) term2539).setAccessible(true);
        Object enum2 = ((Field) term2539).get((Object) null);
        term2286 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term2286, term2286.getClass(), "escapeMode", null);
        setField(term2286, term2286.getClass(), "charset", null);
        setBooleanField(term2286, term2286.getClass(), "prettyPrint", false);
        setBooleanField(term2286, term2286.getClass(), "outline", false);
        setIntField(term2286, term2286.getClass(), "indentAmount", 568599855);
        setField(term2286, term2286.getClass(), "syntax", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term671;
        callMethod(klass, "html", argTypes, term646, args);
        assertTrue(recursiveEquals(term646, term2283));
        assertTrue(recursiveEquals(term671, term2286));
    }

};


