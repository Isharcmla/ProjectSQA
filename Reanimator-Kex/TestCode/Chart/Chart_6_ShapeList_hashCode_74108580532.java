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

public class ShapeList_hashCode_74108580532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10609;
     Object term10708;

    public ShapeList_hashCode_74108580532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10609 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term10528 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term10609, term10609.getClass(), "size", 1);
        setField(term10609, term10609.getClass(), "objects", term10528);
        term10708 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term10709 = (Object[]) newArray("java.lang.Object", 489);
        setField(term10708, term10708.getClass(), "objects", term10709);
        setIntField(term10708, term10708.getClass(), "size", 1);
        setIntField(term10708, term10708.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10609, args);
        assertTrue(recursiveEquals(term10609, term10708));
        assertTrue(recursiveEquals(retValue, 173900));
    }

};


