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

public class ShapeList_setShape_97788479234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10691;
     Object term10792;

    public ShapeList_setShape_97788479234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10691 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term10612 = (Object[]) newArray("java.lang.Object", 489);
        setField(term10691, term10691.getClass(), "objects", term10612);
        term10792 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term10793 = (Object[]) newArray("java.lang.Object", 489);
        setField(term10792, term10792.getClass(), "objects", term10793);
        setIntField(term10792, term10792.getClass(), "size", 1);
        setIntField(term10792, term10792.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.Shape");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        callMethod(klass, "setShape", argTypes, term10691, args);
        assertTrue(recursiveEquals(term10691, term10792));
    }

};


