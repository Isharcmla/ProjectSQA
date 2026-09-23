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

public class Attribute_equals_1077004098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150950;
     Object term150985;
     Object term151377;
     Object term151378;

    public Attribute_equals_1077004098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150950 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term150950, term150950.getClass(), "key", null);
        setField(term150950, term150950.getClass(), "val", null);
        term150985 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term150985, term150985.getClass(), "key", null);
        setField(term150985, term150985.getClass(), "val", "java.lang.Object");
        term151377 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151377, term151377.getClass(), "key", null);
        setField(term151377, term151377.getClass(), "val", null);
        setField(term151377, term151377.getClass(), "parent", null);
        term151378 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151378, term151378.getClass(), "key", null);
        setField(term151378, term151378.getClass(), "val", "java.lang.Object");
        setField(term151378, term151378.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term150985;
        Object retValue = callMethod(klass, "equals", argTypes, term150950, args);
        assertTrue(recursiveEquals(term150950, term151377));
        assertTrue(recursiveEquals(term150985, term151378));
        assertTrue(recursiveEquals(retValue, false));
    }

};


