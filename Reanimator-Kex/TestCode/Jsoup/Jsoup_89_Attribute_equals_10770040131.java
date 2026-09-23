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
     Object term167173;
     Object term167208;
     Object term167215;
     Object term167216;

    public Attribute_equals_10770040131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167173 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term167208 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term167215 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term167215, term167215.getClass(), "key", null);
        setField(term167215, term167215.getClass(), "val", null);
        setField(term167215, term167215.getClass(), "parent", null);
        term167216 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term167216, term167216.getClass(), "key", null);
        setField(term167216, term167216.getClass(), "val", null);
        setField(term167216, term167216.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term167208;
        Object retValue = callMethod(klass, "equals", argTypes, term167173, args);
        assertTrue(recursiveEquals(term167173, term167215));
        assertTrue(recursiveEquals(term167208, term167216));
        assertTrue(recursiveEquals(retValue, false));
    }

};


