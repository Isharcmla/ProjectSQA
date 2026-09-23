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

public class Attribute_equals_10770040131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165928;
     Object term166001;
     Object term166018;
     Object term166021;

    public Attribute_equals_10770040131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165928 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term165928, term165928.getClass(), "key", "int");
        term166001 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term166018 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term166018, term166018.getClass(), "key", "int");
        setField(term166018, term166018.getClass(), "val", null);
        setField(term166018, term166018.getClass(), "parent", null);
        term166021 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term166021, term166021.getClass(), "key", null);
        setField(term166021, term166021.getClass(), "val", null);
        setField(term166021, term166021.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term166001;
        Object retValue = callMethod(klass, "equals", argTypes, term165928, args);
        assertTrue(recursiveEquals(term165928, term166018));
        assertTrue(recursiveEquals(term166001, term166021));
        assertTrue(recursiveEquals(retValue, false));
    }

};


