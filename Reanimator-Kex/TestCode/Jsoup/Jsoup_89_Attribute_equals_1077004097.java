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

public class Attribute_equals_1077004097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149800;
     Object term149873;
     Object term149914;
     Object term149917;

    public Attribute_equals_1077004097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149800 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149800, term149800.getClass(), "key", "java.lang.Class");
        term149873 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term149914 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149914, term149914.getClass(), "key", "java.lang.Class");
        setField(term149914, term149914.getClass(), "val", null);
        setField(term149914, term149914.getClass(), "parent", null);
        term149917 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149917, term149917.getClass(), "key", null);
        setField(term149917, term149917.getClass(), "val", null);
        setField(term149917, term149917.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term149873;
        Object retValue = callMethod(klass, "equals", argTypes, term149800, args);
        assertTrue(recursiveEquals(term149800, term149914));
        assertTrue(recursiveEquals(term149873, term149917));
        assertTrue(recursiveEquals(retValue, false));
    }

};


