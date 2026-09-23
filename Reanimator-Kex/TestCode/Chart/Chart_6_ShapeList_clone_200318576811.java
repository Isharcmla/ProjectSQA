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

public class ShapeList_clone_200318576811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term4990;
     Object term4986;

    public ShapeList_clone_200318576811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term14 = (Object[]) newArray("java.lang.Object", 8);
        setField(term13, term13.getClass(), "objects", term14);
        setIntField(term13, term13.getClass(), "size", -1922583790);
        setIntField(term13, term13.getClass(), "increment", 8);
        term4990 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term4991 = (Object[]) newArray("java.lang.Object", 8);
        setField(term4990, term4990.getClass(), "objects", term4991);
        setIntField(term4990, term4990.getClass(), "size", -1922583790);
        setIntField(term4990, term4990.getClass(), "increment", 8);
        term4986 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term4987 = (Object[]) newArray("java.lang.Object", 8);
        setField(term4986, term4986.getClass(), "objects", term4987);
        setIntField(term4986, term4986.getClass(), "size", -1922583790);
        setIntField(term4986, term4986.getClass(), "increment", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term13, args);
        assertTrue(recursiveEquals(term13, term4990));
        assertTrue(recursiveEquals(retValue, term4986));
    }

};


