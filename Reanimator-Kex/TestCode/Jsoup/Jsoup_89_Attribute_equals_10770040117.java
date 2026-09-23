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

public class Attribute_equals_10770040117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155727;
     Object term155800;
     Object term155828;
     Object term155831;

    public Attribute_equals_10770040117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155727 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155727, term155727.getClass(), "key", "int");
        term155800 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term155828 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155828, term155828.getClass(), "key", "int");
        setField(term155828, term155828.getClass(), "val", null);
        setField(term155828, term155828.getClass(), "parent", null);
        term155831 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155831, term155831.getClass(), "key", null);
        setField(term155831, term155831.getClass(), "val", null);
        setField(term155831, term155831.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155800;
        Object retValue = callMethod(klass, "equals", argTypes, term155727, args);
        assertTrue(recursiveEquals(term155727, term155828));
        assertTrue(recursiveEquals(term155800, term155831));
        assertTrue(recursiveEquals(retValue, false));
    }

};


