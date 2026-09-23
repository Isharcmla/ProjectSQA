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

public class Attribute_equals_10770040149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196351;
     Object term196386;
     Object term196469;
     Object term196470;

    public Attribute_equals_10770040149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196351 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term196351, term196351.getClass(), "key", null);
        setField(term196351, term196351.getClass(), "val", null);
        term196386 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term196386, term196386.getClass(), "key", null);
        setField(term196386, term196386.getClass(), "val", "java.lang.Object");
        term196469 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term196469, term196469.getClass(), "key", null);
        setField(term196469, term196469.getClass(), "val", null);
        setField(term196469, term196469.getClass(), "parent", null);
        term196470 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term196470, term196470.getClass(), "key", null);
        setField(term196470, term196470.getClass(), "val", "java.lang.Object");
        setField(term196470, term196470.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term196386;
        Object retValue = callMethod(klass, "equals", argTypes, term196351, args);
        assertTrue(recursiveEquals(term196351, term196469));
        assertTrue(recursiveEquals(term196386, term196470));
        assertTrue(recursiveEquals(retValue, false));
    }

};


