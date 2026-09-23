package org.jfree.chart.util;

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
import static org.jfree.chart.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.util.EqualityUtils.*;

public class ShapeList_equals_29239913018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5123;
     Object term7509;
     Object term7510;

    public ShapeList_equals_29239913018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5123 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        term7509 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term7509, term7509.getClass(), "objects", null);
        setIntField(term7509, term7509.getClass(), "size", 0);
        setIntField(term7509, term7509.getClass(), "increment", 0);
        term7510 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term7510, term7510.getClass(), "objects", null);
        setIntField(term7510, term7510.getClass(), "size", 0);
        setIntField(term7510, term7510.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5123;
        Object retValue = callMethod(klass, "equals", argTypes, term5123, args);
        assertTrue(recursiveEquals(term5123, term7509));
        assertTrue(recursiveEquals(term5123, term7510));
        assertTrue(recursiveEquals(retValue, true));
    }

};


