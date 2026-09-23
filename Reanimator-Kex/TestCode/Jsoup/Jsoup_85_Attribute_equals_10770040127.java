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

public class Attribute_equals_10770040127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185691;
     Object term185764;
     Object term185829;
     Object term185832;

    public Attribute_equals_10770040127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185691 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term185691, term185691.getClass(), "key", "int");
        term185764 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term185764, term185764.getClass(), "key", "int");
        term185829 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term185829, term185829.getClass(), "key", "int");
        setField(term185829, term185829.getClass(), "val", null);
        setField(term185829, term185829.getClass(), "parent", null);
        term185832 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term185832, term185832.getClass(), "key", "int");
        setField(term185832, term185832.getClass(), "val", null);
        setField(term185832, term185832.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term185764;
        Object retValue = callMethod(klass, "equals", argTypes, term185691, args);
        assertTrue(recursiveEquals(term185691, term185829));
        assertTrue(recursiveEquals(term185764, term185832));
        assertTrue(recursiveEquals(retValue, true));
    }

};


