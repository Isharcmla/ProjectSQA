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

public class ShapeUtilities_equal_57649429027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term18;
     Object term427;
     Object term431;

    public ShapeUtilities_equal_57649429027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.awt.Polygon"));
        int[] term3 = (int[]) newIntArray(4);
        int[] term8 = (int[]) newIntArray(4);
        Object term13 = newInstance(Class.forName("java.awt.Rectangle"));
        setIntField(term1, term1.getClass(), "npoints", 568599855);
        setField(term1, term1.getClass(), "xpoints", term3);
        setField(term1, term1.getClass(), "ypoints", term8);
        setIntField(term13, term13.getClass(), "x", 1162663216);
        setIntField(term13, term13.getClass(), "y", 1484323161);
        setIntField(term13, term13.getClass(), "width", 391863371);
        setIntField(term13, term13.getClass(), "height", -1922583790);
        setField(term1, term1.getClass(), "bounds", term13);
        term18 = newInstance(Class.forName("java.awt.Polygon"));
        int[] term20 = (int[]) newIntArray(4);
        int[] term25 = (int[]) newIntArray(4);
        Object term30 = newInstance(Class.forName("java.awt.Rectangle"));
        setIntField(term18, term18.getClass(), "npoints", -616727354);
        setField(term18, term18.getClass(), "xpoints", term20);
        setField(term18, term18.getClass(), "ypoints", term25);
        setIntField(term30, term30.getClass(), "x", -1955890973);
        setIntField(term30, term30.getClass(), "y", -2038273078);
        setIntField(term30, term30.getClass(), "width", 1227103734);
        setIntField(term30, term30.getClass(), "height", -1339778481);
        setField(term18, term18.getClass(), "bounds", term30);
        term427 = newInstance(Class.forName("java.awt.Polygon"));
        int[] term428 = (int[]) newIntArray(4);
        int[] term429 = (int[]) newIntArray(4);
        Object term430 = newInstance(Class.forName("java.awt.Rectangle"));
        setIntField(term427, term427.getClass(), "npoints", 568599855);
        setField(term427, term427.getClass(), "xpoints", term428);
        setField(term427, term427.getClass(), "ypoints", term429);
        setIntField(term430, term430.getClass(), "x", 1162663216);
        setIntField(term430, term430.getClass(), "y", 1484323161);
        setIntField(term430, term430.getClass(), "width", 391863371);
        setIntField(term430, term430.getClass(), "height", -1922583790);
        setField(term427, term427.getClass(), "bounds", term430);
        term431 = newInstance(Class.forName("java.awt.Polygon"));
        int[] term432 = (int[]) newIntArray(4);
        int[] term433 = (int[]) newIntArray(4);
        Object term434 = newInstance(Class.forName("java.awt.Rectangle"));
        setIntField(term431, term431.getClass(), "npoints", -616727354);
        setField(term431, term431.getClass(), "xpoints", term432);
        setField(term431, term431.getClass(), "ypoints", term433);
        setIntField(term434, term434.getClass(), "x", -1955890973);
        setIntField(term434, term434.getClass(), "y", -2038273078);
        setIntField(term434, term434.getClass(), "width", 1227103734);
        setIntField(term434, term434.getClass(), "height", -1339778481);
        setField(term431, term431.getClass(), "bounds", term434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Polygon");
        argTypes[1] = Class.forName("java.awt.Polygon");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term18;
        Object retValue = callMethod(klass, "equal", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term427));
        assertTrue(recursiveEquals(term18, term431));
        assertTrue(recursiveEquals(retValue, false));
    }

};


