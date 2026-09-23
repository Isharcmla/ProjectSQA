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
import java.lang.Float;

public class ShapeUtilities_createDiagonalCross_114047492833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;
     Object term348;
     Object term1662;

    public ShapeUtilities_createDiagonalCross_114047492833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346 = new Float(0.5523636F);
        term348 = new Float(0.8564069F);
        term1662 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term1663 = (float[]) newFloatArray(40);
        byte[] term1704 = (byte[]) newByteArray(20);
        setFloatElement(term1663, 0, -1.4087706F);
        setFloatElement(term1663, 1, 0.30404335F);
        setFloatElement(term1663, 2, 0.30404335F);
        setFloatElement(term1663, 3, -1.4087706F);
        setFloatElement(term1663, 5, -1.2111423F);
        setFloatElement(term1663, 6, -0.30404335F);
        setFloatElement(term1663, 7, -1.4087706F);
        setFloatElement(term1663, 8, 1.4087706F);
        setFloatElement(term1663, 9, 0.30404335F);
        setFloatElement(term1663, 10, 1.2111423F);
        setFloatElement(term1663, 12, 1.4087706F);
        setFloatElement(term1663, 13, -0.30404335F);
        setFloatElement(term1663, 14, -0.30404335F);
        setFloatElement(term1663, 15, 1.4087706F);
        setFloatElement(term1663, 17, 1.2111423F);
        setFloatElement(term1663, 18, 0.30404335F);
        setFloatElement(term1663, 19, 1.4087706F);
        setFloatElement(term1663, 20, -1.4087706F);
        setFloatElement(term1663, 21, -0.30404335F);
        setFloatElement(term1663, 22, -1.2111423F);
        setField(term1662, term1662.getClass(), "floatCoords", term1663);
        setByteElement(term1704, 1, (byte) 1);
        setByteElement(term1704, 2, (byte) 1);
        setByteElement(term1704, 3, (byte) 1);
        setByteElement(term1704, 4, (byte) 1);
        setByteElement(term1704, 5, (byte) 1);
        setByteElement(term1704, 6, (byte) 1);
        setByteElement(term1704, 7, (byte) 1);
        setByteElement(term1704, 8, (byte) 1);
        setByteElement(term1704, 9, (byte) 1);
        setByteElement(term1704, 10, (byte) 1);
        setByteElement(term1704, 11, (byte) 1);
        setByteElement(term1704, 12, (byte) 4);
        setField(term1662, term1662.getClass(), "pointTypes", term1704);
        setIntField(term1662, term1662.getClass(), "numTypes", 13);
        setIntField(term1662, term1662.getClass(), "numCoords", 24);
        setIntField(term1662, term1662.getClass(), "windingRule", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term346;
        args[1] = term348;
        Object retValue = callMethod(klass, "createDiagonalCross", argTypes, null, args);
        assertTrue(recursiveEquals(term346, 0.5523636F));
        assertTrue(recursiveEquals(term348, 0.8564069F));
        assertTrue(recursiveEquals(retValue, term1662));
    }

};


