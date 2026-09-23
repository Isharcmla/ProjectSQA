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

public class Attribute_equals_10770040112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156310;
     Object term156383;
     Object term156807;
     Object term156810;

    public Attribute_equals_10770040112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156310 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156310, term156310.getClass(), "key", null);
        setField(term156310, term156310.getClass(), "val", "org.jsoup.nodes.BooleanAttribute");
        term156383 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156383, term156383.getClass(), "key", null);
        term156807 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156807, term156807.getClass(), "key", null);
        setField(term156807, term156807.getClass(), "val", "org.jsoup.nodes.BooleanAttribute");
        setField(term156807, term156807.getClass(), "parent", null);
        term156810 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156810, term156810.getClass(), "key", null);
        setField(term156810, term156810.getClass(), "val", null);
        setField(term156810, term156810.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156383;
        Object retValue = callMethod(klass, "equals", argTypes, term156310, args);
        assertTrue(recursiveEquals(term156310, term156807));
        assertTrue(recursiveEquals(term156383, term156810));
        assertTrue(recursiveEquals(retValue, false));
    }

};


