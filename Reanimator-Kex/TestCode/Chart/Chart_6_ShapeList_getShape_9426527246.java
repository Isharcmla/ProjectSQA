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

public class ShapeList_getShape_9426527246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12199;
     Object term12286;

    public ShapeList_getShape_9426527246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12199 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        term12286 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term12286, term12286.getClass(), "objects", null);
        setIntField(term12286, term12286.getClass(), "size", 0);
        setIntField(term12286, term12286.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        Object retValue = callMethod(klass, "getShape", argTypes, term12199, args);
        assertTrue(recursiveEquals(term12199, term12286));
        assertTrue(recursiveEquals(retValue, null));
    }

};


