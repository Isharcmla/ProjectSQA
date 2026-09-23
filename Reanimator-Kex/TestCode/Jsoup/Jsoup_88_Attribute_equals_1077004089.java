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

public class Attribute_equals_1077004089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149711;
     Object term149739;
     Object term149750;
     Object term149751;

    public Attribute_equals_1077004089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149711 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term149739 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term149750 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term149750, term149750.getClass(), "key", null);
        setField(term149750, term149750.getClass(), "val", null);
        setField(term149750, term149750.getClass(), "parent", null);
        term149751 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term149751, term149751.getClass(), "key", null);
        setField(term149751, term149751.getClass(), "val", null);
        setField(term149751, term149751.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term149739;
        Object retValue = callMethod(klass, "equals", argTypes, term149711, args);
        assertTrue(recursiveEquals(term149711, term149750));
        assertTrue(recursiveEquals(term149739, term149751));
        assertTrue(recursiveEquals(retValue, true));
    }

};


