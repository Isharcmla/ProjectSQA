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

public class ShapeList_setShape_97788479210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term11;
     Object term4975;

    public ShapeList_setShape_97788479210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term8 = (Object[]) newArray("java.lang.Object", 8);
        setField(term7, term7.getClass(), "objects", term8);
        setIntField(term7, term7.getClass(), "size", 1484323161);
        setIntField(term7, term7.getClass(), "increment", 8);
        term11 = new Integer(391863371);
        term4975 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term4976 = (Object[]) newArray("java.lang.Object", 391863379);
        setField(term4975, term4975.getClass(), "objects", term4976);
        setIntField(term4975, term4975.getClass(), "size", 1484323161);
        setIntField(term4975, term4975.getClass(), "increment", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.Shape");
        Object[] args = new Object[2];
        args[0] = term11;
        args[1] = null;
        callMethod(klass, "setShape", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term4975));
        assertTrue(recursiveEquals(term11, 391863371));
    }

};


