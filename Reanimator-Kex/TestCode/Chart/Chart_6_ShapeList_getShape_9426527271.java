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

public class ShapeList_getShape_9426527271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14345;
     Object term24344;

    public ShapeList_getShape_9426527271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14345 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term14264 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term14345, term14345.getClass(), "size", 1);
        setField(term14345, term14345.getClass(), "objects", term14264);
        term24344 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term24345 = (Object[]) newArray("java.lang.Object", 489);
        setField(term24344, term24344.getClass(), "objects", term24345);
        setIntField(term24344, term24344.getClass(), "size", 1);
        setIntField(term24344, term24344.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getShape", argTypes, term14345, args);
        assertTrue(recursiveEquals(term14345, term24344));
        assertTrue(recursiveEquals(retValue, null));
    }

};


