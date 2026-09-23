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
import java.lang.Object;
import java.util.LinkedHashMap;

public class FormElement_equals_817636276121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52825;
     Object term52973;
     Object term53071;
     Object term53074;

    public FormElement_equals_817636276121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term52943 = new LinkedHashMap();
        term52825 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52883 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term52825, term52825.getClass(), "childNodes", null);
        setField(term52883, term52883.getClass(), "attributes", term52943);
        setField(term52825, term52825.getClass(), "attributes", term52883);
        term52973 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term53031 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term52973, term52973.getClass(), "childNodes", null);
        setField(term53031, term53031.getClass(), "attributes", null);
        setField(term52973, term52973.getClass(), "attributes", term53031);
        LinkedHashMap term53073 = new LinkedHashMap();
        term53071 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term53072 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term53071, term53071.getClass(), "elements", null);
        setField(term53071, term53071.getClass(), "tag", null);
        setField(term53071, term53071.getClass(), "parentNode", null);
        setField(term53071, term53071.getClass(), "childNodes", null);
        setField(term53072, term53072.getClass(), "attributes", term53073);
        setField(term53071, term53071.getClass(), "attributes", term53072);
        setField(term53071, term53071.getClass(), "baseUri", null);
        setIntField(term53071, term53071.getClass(), "siblingIndex", 0);
        term53074 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term53075 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term53074, term53074.getClass(), "elements", null);
        setField(term53074, term53074.getClass(), "tag", null);
        setField(term53074, term53074.getClass(), "parentNode", null);
        setField(term53074, term53074.getClass(), "childNodes", null);
        setField(term53075, term53075.getClass(), "attributes", null);
        setField(term53074, term53074.getClass(), "attributes", term53075);
        setField(term53074, term53074.getClass(), "baseUri", null);
        setIntField(term53074, term53074.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52973;
        callMethod(klass, "equals", argTypes, term52825, args);
        assertTrue(recursiveEquals(term52825, term53071));
        assertTrue(recursiveEquals(term52973, term53074));
    }

};


