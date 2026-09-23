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

public class ShapeList_equals_29239913012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term21;
     Object term5000;
     Object term5002;

    public ShapeList_equals_29239913012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term18 = (Object[]) newArray("java.lang.Object", 8);
        setField(term17, term17.getClass(), "objects", term18);
        setIntField(term17, term17.getClass(), "size", -616727354);
        setIntField(term17, term17.getClass(), "increment", 8);
        term21 = newInstance(Class.forName("java.lang.Object"));
        term5000 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term5001 = (Object[]) newArray("java.lang.Object", 8);
        setField(term5000, term5000.getClass(), "objects", term5001);
        setIntField(term5000, term5000.getClass(), "size", -616727354);
        setIntField(term5000, term5000.getClass(), "increment", 8);
        term5002 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21;
        Object retValue = callMethod(klass, "equals", argTypes, term17, args);
        assertTrue(recursiveEquals(term17, term5000));
        assertTrue(recursiveEquals(term21, term5002));
        assertTrue(recursiveEquals(retValue, false));
    }

};


