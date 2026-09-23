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
import java.lang.Double;
import java.lang.Float;

public class ShapeUtilities_rotateShape_156998490331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;
     Object term336;
     Object term338;

    public ShapeUtilities_rotateShape_156998490331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334 = new Double(0.28570734989730284);
        term336 = new Float(0.13238746F);
        term338 = new Float(0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Shape");
        argTypes[1] = double.class;
        argTypes[2] = float.class;
        argTypes[3] = float.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term334;
        args[2] = term336;
        args[3] = term338;
        Object retValue = callMethod(klass, "rotateShape", argTypes, null, args);
        assertTrue(recursiveEquals(term334, 0.28570734989730284));
        assertTrue(recursiveEquals(term336, 0.13238746F));
        assertTrue(recursiveEquals(term338, 0.2707036F));
        assertTrue(recursiveEquals(retValue, null));
    }

};


