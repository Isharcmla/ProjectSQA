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
     Object term162491;
     Object term162526;
     Object term162537;
     Object term162538;

    public Attribute_equals_10770040127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162491 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term162526 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term162537 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term162537, term162537.getClass(), "key", null);
        setField(term162537, term162537.getClass(), "val", null);
        setField(term162537, term162537.getClass(), "parent", null);
        term162538 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term162538, term162538.getClass(), "key", null);
        setField(term162538, term162538.getClass(), "val", null);
        setField(term162538, term162538.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term162526;
        Object retValue = callMethod(klass, "equals", argTypes, term162491, args);
        assertTrue(recursiveEquals(term162491, term162537));
        assertTrue(recursiveEquals(term162526, term162538));
        assertTrue(recursiveEquals(retValue, true));
    }

};


