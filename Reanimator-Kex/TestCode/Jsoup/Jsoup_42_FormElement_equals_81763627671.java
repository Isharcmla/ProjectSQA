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

public class FormElement_equals_81763627671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36091;
     Object term36179;
     Object term36203;
     Object term36205;

    public FormElement_equals_81763627671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36091 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term36149 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term36091, term36091.getClass(), "childNodes", null);
        setField(term36091, term36091.getClass(), "attributes", term36149);
        term36179 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term36179, term36179.getClass(), "childNodes", null);
        term36203 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term36204 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term36203, term36203.getClass(), "elements", null);
        setField(term36203, term36203.getClass(), "tag", null);
        setField(term36203, term36203.getClass(), "parentNode", null);
        setField(term36203, term36203.getClass(), "childNodes", null);
        setField(term36204, term36204.getClass(), "attributes", null);
        setField(term36203, term36203.getClass(), "attributes", term36204);
        setField(term36203, term36203.getClass(), "baseUri", null);
        setIntField(term36203, term36203.getClass(), "siblingIndex", 0);
        term36205 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term36205, term36205.getClass(), "elements", null);
        setField(term36205, term36205.getClass(), "tag", null);
        setField(term36205, term36205.getClass(), "parentNode", null);
        setField(term36205, term36205.getClass(), "childNodes", null);
        setField(term36205, term36205.getClass(), "attributes", null);
        setField(term36205, term36205.getClass(), "baseUri", null);
        setIntField(term36205, term36205.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36179;
        callMethod(klass, "equals", argTypes, term36091, args);
        assertTrue(recursiveEquals(term36091, term36203));
        assertTrue(recursiveEquals(term36179, term36205));
    }

};


