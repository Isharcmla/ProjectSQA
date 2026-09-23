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

public class ShapeUtilities_createUpTriangle_127605408636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356;
     Object term2029;

    public ShapeUtilities_createUpTriangle_127605408636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356 = new Float(0.6880585F);
        term2029 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term2030 = (float[]) newFloatArray(40);
        byte[] term2071 = (byte[]) newByteArray(20);
        setFloatElement(term2030, 1, -0.6880585F);
        setFloatElement(term2030, 2, 0.6880585F);
        setFloatElement(term2030, 3, 0.6880585F);
        setFloatElement(term2030, 4, -0.6880585F);
        setFloatElement(term2030, 5, 0.6880585F);
        setField(term2029, term2029.getClass(), "floatCoords", term2030);
        setByteElement(term2071, 1, (byte) 1);
        setByteElement(term2071, 2, (byte) 1);
        setByteElement(term2071, 3, (byte) 4);
        setField(term2029, term2029.getClass(), "pointTypes", term2071);
        setIntField(term2029, term2029.getClass(), "numTypes", 4);
        setIntField(term2029, term2029.getClass(), "numCoords", 6);
        setIntField(term2029, term2029.getClass(), "windingRule", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term356;
        Object retValue = callMethod(klass, "createUpTriangle", argTypes, null, args);
        assertTrue(recursiveEquals(term356, 0.6880585F));
        assertTrue(recursiveEquals(retValue, term2029));
    }

};


