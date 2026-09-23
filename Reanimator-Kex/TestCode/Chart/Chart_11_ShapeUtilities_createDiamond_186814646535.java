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

public class ShapeUtilities_createDiamond_186814646535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;
     Object term1858;

    public ShapeUtilities_createDiamond_186814646535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354 = new Float(0.2857073F);
        term1858 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term1859 = (float[]) newFloatArray(40);
        byte[] term1900 = (byte[]) newByteArray(20);
        setFloatElement(term1859, 1, -0.2857073F);
        setFloatElement(term1859, 2, 0.2857073F);
        setFloatElement(term1859, 5, 0.2857073F);
        setFloatElement(term1859, 6, -0.2857073F);
        setField(term1858, term1858.getClass(), "floatCoords", term1859);
        setByteElement(term1900, 1, (byte) 1);
        setByteElement(term1900, 2, (byte) 1);
        setByteElement(term1900, 3, (byte) 1);
        setByteElement(term1900, 4, (byte) 4);
        setField(term1858, term1858.getClass(), "pointTypes", term1900);
        setIntField(term1858, term1858.getClass(), "numTypes", 5);
        setIntField(term1858, term1858.getClass(), "numCoords", 8);
        setIntField(term1858, term1858.getClass(), "windingRule", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term354;
        Object retValue = callMethod(klass, "createDiamond", argTypes, null, args);
        assertTrue(recursiveEquals(term354, 0.2857073F));
        assertTrue(recursiveEquals(retValue, term1858));
    }

};


