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

public class Attribute_equals_1077004071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143138;
     Object term143166;
     Object term143177;
     Object term143178;

    public Attribute_equals_1077004071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143138 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term143166 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term143177 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term143177, term143177.getClass(), "key", null);
        setField(term143177, term143177.getClass(), "val", null);
        setField(term143177, term143177.getClass(), "parent", null);
        term143178 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term143178, term143178.getClass(), "key", null);
        setField(term143178, term143178.getClass(), "val", null);
        setField(term143178, term143178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term143166;
        Object retValue = callMethod(klass, "equals", argTypes, term143138, args);
        assertTrue(recursiveEquals(term143138, term143177));
        assertTrue(recursiveEquals(term143166, term143178));
        assertTrue(recursiveEquals(retValue, true));
    }

};


