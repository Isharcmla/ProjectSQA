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

public class Attribute_equals_10770040129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165903;
     Object term165938;
     Object term165949;
     Object term165950;

    public Attribute_equals_10770040129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165903 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term165938 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term165949 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term165949, term165949.getClass(), "key", null);
        setField(term165949, term165949.getClass(), "val", null);
        setField(term165949, term165949.getClass(), "parent", null);
        term165950 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term165950, term165950.getClass(), "key", null);
        setField(term165950, term165950.getClass(), "val", null);
        setField(term165950, term165950.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term165938;
        Object retValue = callMethod(klass, "equals", argTypes, term165903, args);
        assertTrue(recursiveEquals(term165903, term165949));
        assertTrue(recursiveEquals(term165938, term165950));
        assertTrue(recursiveEquals(retValue, true));
    }

};


