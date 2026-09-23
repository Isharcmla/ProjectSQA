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

public class ShapeList_getShape_9426527221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9767;
     Object term9774;

    public ShapeList_getShape_9426527221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9767 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setIntField(term9767, term9767.getClass(), "size", 0);
        term9774 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        setField(term9774, term9774.getClass(), "objects", null);
        setIntField(term9774, term9774.getClass(), "size", 0);
        setIntField(term9774, term9774.getClass(), "increment", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getShape", argTypes, term9767, args);
        assertTrue(recursiveEquals(term9767, term9774));
        assertTrue(recursiveEquals(retValue, null));
    }

};


