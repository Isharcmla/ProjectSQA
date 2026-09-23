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

public class ShapeList_getShape_9426527247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12280;
     Object term12294;

    public ShapeList_getShape_9426527247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12280 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term12203 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term12280, term12280.getClass(), "size", 1);
        setField(term12280, term12280.getClass(), "objects", term12203);
        term12294 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term12295 = (Object[]) newArray("java.lang.Object", 489);
        setField(term12294, term12294.getClass(), "objects", term12295);
        setIntField(term12294, term12294.getClass(), "size", 1);
        setIntField(term12294, term12294.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getShape", argTypes, term12280, args);
        assertTrue(recursiveEquals(term12280, term12294));
        assertTrue(recursiveEquals(retValue, null));
    }

};


