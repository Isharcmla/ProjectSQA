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

public class ShapeList_hashCode_74108580513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term5016;

    public ShapeList_hashCode_74108580513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term23 = (Object[]) newArray("java.lang.Object", 8);
        setField(term22, term22.getClass(), "objects", term23);
        setIntField(term22, term22.getClass(), "size", -1955890973);
        setIntField(term22, term22.getClass(), "increment", 8);
        term5016 = newInstance(Class.forName("org.jfree.chart.util.ShapeList"));
        Object[] term5017 = (Object[]) newArray("java.lang.Object", 8);
        setField(term5016, term5016.getClass(), "objects", term5017);
        setIntField(term5016, term5016.getClass(), "size", -1955890973);
        setIntField(term5016, term5016.getClass(), "increment", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22, args);
        assertTrue(recursiveEquals(term22, term5016));
        assertTrue(recursiveEquals(retValue, -1955886274));
    }

};


