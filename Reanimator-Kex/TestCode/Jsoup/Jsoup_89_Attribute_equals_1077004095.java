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

public class Attribute_equals_1077004095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149300;
     Object term149373;
     Object term149469;
     Object term149472;

    public Attribute_equals_1077004095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149300 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149300, term149300.getClass(), "key", null);
        setField(term149300, term149300.getClass(), "val", "org.jsoup.nodes.BooleanAttribute");
        term149373 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149373, term149373.getClass(), "key", null);
        term149469 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149469, term149469.getClass(), "key", null);
        setField(term149469, term149469.getClass(), "val", "org.jsoup.nodes.BooleanAttribute");
        setField(term149469, term149469.getClass(), "parent", null);
        term149472 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149472, term149472.getClass(), "key", null);
        setField(term149472, term149472.getClass(), "val", null);
        setField(term149472, term149472.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term149373;
        Object retValue = callMethod(klass, "equals", argTypes, term149300, args);
        assertTrue(recursiveEquals(term149300, term149469));
        assertTrue(recursiveEquals(term149373, term149472));
        assertTrue(recursiveEquals(retValue, false));
    }

};


