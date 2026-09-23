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

public class Attribute_equals_1077004099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151260;
     Object term151333;
     Object term151459;
     Object term151462;

    public Attribute_equals_1077004099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151260 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151260, term151260.getClass(), "key", "java.lang.Class");
        term151333 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term151459 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151459, term151459.getClass(), "key", "java.lang.Class");
        setField(term151459, term151459.getClass(), "val", null);
        setField(term151459, term151459.getClass(), "parent", null);
        term151462 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151462, term151462.getClass(), "key", null);
        setField(term151462, term151462.getClass(), "val", null);
        setField(term151462, term151462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151333;
        Object retValue = callMethod(klass, "equals", argTypes, term151260, args);
        assertTrue(recursiveEquals(term151260, term151459));
        assertTrue(recursiveEquals(term151333, term151462));
        assertTrue(recursiveEquals(retValue, false));
    }

};


