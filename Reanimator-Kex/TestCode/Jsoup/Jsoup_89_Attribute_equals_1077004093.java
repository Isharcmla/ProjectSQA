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

public class Attribute_equals_1077004093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148922;
     Object term148957;
     Object term149040;
     Object term149041;

    public Attribute_equals_1077004093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148922 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term148922, term148922.getClass(), "key", null);
        setField(term148922, term148922.getClass(), "val", null);
        term148957 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term148957, term148957.getClass(), "key", null);
        setField(term148957, term148957.getClass(), "val", "java.lang.Object");
        term149040 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149040, term149040.getClass(), "key", null);
        setField(term149040, term149040.getClass(), "val", null);
        setField(term149040, term149040.getClass(), "parent", null);
        term149041 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term149041, term149041.getClass(), "key", null);
        setField(term149041, term149041.getClass(), "val", "java.lang.Object");
        setField(term149041, term149041.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term148957;
        Object retValue = callMethod(klass, "equals", argTypes, term148922, args);
        assertTrue(recursiveEquals(term148922, term149040));
        assertTrue(recursiveEquals(term148957, term149041));
        assertTrue(recursiveEquals(retValue, false));
    }

};


