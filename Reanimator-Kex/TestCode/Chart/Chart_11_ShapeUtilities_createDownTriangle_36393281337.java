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

public class ShapeUtilities_createDownTriangle_36393281337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;
     Object term2172;

    public ShapeUtilities_createDownTriangle_36393281337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358 = new Float(0.40176582F);
        term2172 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term2173 = (float[]) newFloatArray(40);
        byte[] term2214 = (byte[]) newByteArray(20);
        setFloatElement(term2173, 1, 0.40176582F);
        setFloatElement(term2173, 2, 0.40176582F);
        setFloatElement(term2173, 3, -0.40176582F);
        setFloatElement(term2173, 4, -0.40176582F);
        setFloatElement(term2173, 5, -0.40176582F);
        setField(term2172, term2172.getClass(), "floatCoords", term2173);
        setByteElement(term2214, 1, (byte) 1);
        setByteElement(term2214, 2, (byte) 1);
        setByteElement(term2214, 3, (byte) 4);
        setField(term2172, term2172.getClass(), "pointTypes", term2214);
        setIntField(term2172, term2172.getClass(), "numTypes", 4);
        setIntField(term2172, term2172.getClass(), "numCoords", 6);
        setIntField(term2172, term2172.getClass(), "windingRule", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term358;
        Object retValue = callMethod(klass, "createDownTriangle", argTypes, null, args);
        assertTrue(recursiveEquals(term358, 0.40176582F));
        assertTrue(recursiveEquals(retValue, term2172));
    }

};


