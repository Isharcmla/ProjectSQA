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

public class ShapeList_clone_200318576828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10432;
     Object term10518;
     Object term10515;

    public ShapeList_clone_200318576828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10432 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term10432, term10432.getClass(), "objects", null);
        term10518 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term10518, term10518.getClass(), "objects", null);
        setIntField(term10518, term10518.getClass(), "size", 0);
        setIntField(term10518, term10518.getClass(), "increment", 0);
        term10515 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term10515, term10515.getClass(), "objects", null);
        setIntField(term10515, term10515.getClass(), "size", 0);
        setIntField(term10515, term10515.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term10432, args);
        assertTrue(recursiveEquals(term10432, term10518));
        assertTrue(recursiveEquals(retValue, term10515));
    }

};


