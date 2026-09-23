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

public class ShapeUtilities_createRegularCross_29742163334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350;
     Object term352;
     Object term1790;

    public ShapeUtilities_createRegularCross_29742163334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350 = new Float(0.5446086F);
        term352 = new Float(0.5254275F);
        term1790 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term1791 = (float[]) newFloatArray(40);
        byte[] term1832 = (byte[]) newByteArray(20);
        setFloatElement(term1791, 0, -0.5446086F);
        setFloatElement(term1791, 1, 0.5254275F);
        setFloatElement(term1791, 2, -0.5254275F);
        setFloatElement(term1791, 3, 0.5254275F);
        setFloatElement(term1791, 4, -0.5254275F);
        setFloatElement(term1791, 5, 0.5446086F);
        setFloatElement(term1791, 6, 0.5254275F);
        setFloatElement(term1791, 7, 0.5446086F);
        setFloatElement(term1791, 8, 0.5254275F);
        setFloatElement(term1791, 9, 0.5254275F);
        setFloatElement(term1791, 10, 0.5446086F);
        setFloatElement(term1791, 11, 0.5254275F);
        setFloatElement(term1791, 12, 0.5446086F);
        setFloatElement(term1791, 13, -0.5254275F);
        setFloatElement(term1791, 14, 0.5254275F);
        setFloatElement(term1791, 15, -0.5254275F);
        setFloatElement(term1791, 16, 0.5254275F);
        setFloatElement(term1791, 17, -0.5446086F);
        setFloatElement(term1791, 18, -0.5254275F);
        setFloatElement(term1791, 19, -0.5446086F);
        setFloatElement(term1791, 20, -0.5254275F);
        setFloatElement(term1791, 21, -0.5254275F);
        setFloatElement(term1791, 22, -0.5446086F);
        setFloatElement(term1791, 23, -0.5254275F);
        setField(term1790, term1790.getClass(), "floatCoords", term1791);
        setByteElement(term1832, 1, (byte) 1);
        setByteElement(term1832, 2, (byte) 1);
        setByteElement(term1832, 3, (byte) 1);
        setByteElement(term1832, 4, (byte) 1);
        setByteElement(term1832, 5, (byte) 1);
        setByteElement(term1832, 6, (byte) 1);
        setByteElement(term1832, 7, (byte) 1);
        setByteElement(term1832, 8, (byte) 1);
        setByteElement(term1832, 9, (byte) 1);
        setByteElement(term1832, 10, (byte) 1);
        setByteElement(term1832, 11, (byte) 1);
        setByteElement(term1832, 12, (byte) 4);
        setField(term1790, term1790.getClass(), "pointTypes", term1832);
        setIntField(term1790, term1790.getClass(), "numTypes", 13);
        setIntField(term1790, term1790.getClass(), "numCoords", 24);
        setIntField(term1790, term1790.getClass(), "windingRule", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term350;
        args[1] = term352;
        Object retValue = callMethod(klass, "createRegularCross", argTypes, null, args);
        assertTrue(recursiveEquals(term350, 0.5446086F));
        assertTrue(recursiveEquals(term352, 0.5254275F));
        assertTrue(recursiveEquals(retValue, term1790));
    }

};


