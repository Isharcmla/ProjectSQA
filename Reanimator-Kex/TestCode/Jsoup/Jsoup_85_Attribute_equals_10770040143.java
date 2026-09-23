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

public class Attribute_equals_10770040143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237116;
     Object term237151;
     Object term237212;
     Object term237213;

    public Attribute_equals_10770040143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237116 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term237116, term237116.getClass(), "key", null);
        term237151 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term237151, term237151.getClass(), "key", "byte[]");
        term237212 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term237212, term237212.getClass(), "key", null);
        setField(term237212, term237212.getClass(), "val", null);
        setField(term237212, term237212.getClass(), "parent", null);
        term237213 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term237213, term237213.getClass(), "key", "byte[]");
        setField(term237213, term237213.getClass(), "val", null);
        setField(term237213, term237213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term237151;
        Object retValue = callMethod(klass, "equals", argTypes, term237116, args);
        assertTrue(recursiveEquals(term237116, term237212));
        assertTrue(recursiveEquals(term237151, term237213));
        assertTrue(recursiveEquals(retValue, false));
    }

};


