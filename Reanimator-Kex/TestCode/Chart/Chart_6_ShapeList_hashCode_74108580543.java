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

public class ShapeList_hashCode_74108580543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12099;
     Object term12120;

    public ShapeList_hashCode_74108580543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12099 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term12010 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term12099, term12099.getClass(), "size", 2);
        setField(term12099, term12099.getClass(), "objects", term12010);
        term12120 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term12121 = (Object[]) newArray("java.lang.Object", 489);
        setField(term12120, term12120.getClass(), "objects", term12121);
        setIntField(term12120, term12120.getClass(), "size", 2);
        setIntField(term12120, term12120.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12099, args);
        assertTrue(recursiveEquals(term12099, term12120));
        assertTrue(recursiveEquals(retValue, 6435669));
    }

};


