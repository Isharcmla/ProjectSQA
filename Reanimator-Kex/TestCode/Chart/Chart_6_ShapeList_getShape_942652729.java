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
import java.lang.Integer;

public class ShapeList_getShape_942652729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term5;
     Object term4966;

    public ShapeList_getShape_942652729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term2 = (Object[]) newArray("java.lang.Object", 8);
        setField(term1, term1.getClass(), "objects", term2);
        setIntField(term1, term1.getClass(), "size", 568599855);
        setIntField(term1, term1.getClass(), "increment", 8);
        term5 = new Integer(1162663216);
        term4966 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term4967 = (Object[]) newArray("java.lang.Object", 8);
        setField(term4966, term4966.getClass(), "objects", term4967);
        setIntField(term4966, term4966.getClass(), "size", 568599855);
        setIntField(term4966, term4966.getClass(), "increment", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5;
        Object retValue = callMethod(klass, "getShape", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term4966));
        assertTrue(recursiveEquals(term5, 1162663216));
        assertTrue(recursiveEquals(retValue, null));
    }

};


