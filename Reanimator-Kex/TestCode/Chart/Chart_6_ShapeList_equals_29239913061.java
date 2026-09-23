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
import java.lang.Object;

public class ShapeList_equals_29239913061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13405;
     Object term13471;
     Object term13760;
     Object term13762;

    public ShapeList_equals_29239913061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13405 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term13311 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term13405, term13405.getClass(), "size", 1);
        setField(term13405, term13405.getClass(), "objects", term13311);
        term13471 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        term13760 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term13761 = (Object[]) newArray("java.lang.Object", 489);
        setField(term13760, term13760.getClass(), "objects", term13761);
        setIntField(term13760, term13760.getClass(), "size", 1);
        setIntField(term13760, term13760.getClass(), "increment", 0);
        term13762 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term13762, term13762.getClass(), "objects", null);
        setIntField(term13762, term13762.getClass(), "size", 0);
        setIntField(term13762, term13762.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13471;
        Object retValue = callMethod(klass, "equals", argTypes, term13405, args);
        assertTrue(recursiveEquals(term13405, term13760));
        assertTrue(recursiveEquals(term13471, term13762));
        assertTrue(recursiveEquals(retValue, true));
    }

};


