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

public class ShapeUtilities_equal_165200299028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term117;
     Object term607;
     Object term610;

    public ShapeUtilities_equal_165200299028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term52 = (float[]) newFloatArray(40);
        byte[] term93 = (byte[]) newByteArray(20);
        setField(term51, term51.getClass(), "floatCoords", term52);
        setField(term51, term51.getClass(), "pointTypes", term93);
        setIntField(term51, term51.getClass(), "numTypes", -522618178);
        setIntField(term51, term51.getClass(), "numCoords", 1134449235);
        setIntField(term51, term51.getClass(), "windingRule", 1);
        term117 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term118 = (float[]) newFloatArray(40);
        byte[] term159 = (byte[]) newByteArray(20);
        setField(term117, term117.getClass(), "floatCoords", term118);
        setField(term117, term117.getClass(), "pointTypes", term159);
        setIntField(term117, term117.getClass(), "numTypes", 1585847225);
        setIntField(term117, term117.getClass(), "numCoords", 597278769);
        setIntField(term117, term117.getClass(), "windingRule", 1);
        term607 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term608 = (float[]) newFloatArray(40);
        byte[] term609 = (byte[]) newByteArray(20);
        setField(term607, term607.getClass(), "floatCoords", term608);
        setField(term607, term607.getClass(), "pointTypes", term609);
        setIntField(term607, term607.getClass(), "numTypes", -522618178);
        setIntField(term607, term607.getClass(), "numCoords", 1134449235);
        setIntField(term607, term607.getClass(), "windingRule", 1);
        term610 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term611 = (float[]) newFloatArray(40);
        byte[] term612 = (byte[]) newByteArray(20);
        setField(term610, term610.getClass(), "floatCoords", term611);
        setField(term610, term610.getClass(), "pointTypes", term612);
        setIntField(term610, term610.getClass(), "numTypes", 1585847225);
        setIntField(term610, term610.getClass(), "numCoords", 597278769);
        setIntField(term610, term610.getClass(), "windingRule", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.geom.GeneralPath");
        argTypes[1] = Class.forName("java.awt.geom.GeneralPath");
        Object[] args = new Object[2];
        args[0] = term51;
        args[1] = term117;
        Object retValue = callMethod(klass, "equal", argTypes, null, args);
        assertTrue(recursiveEquals(term51, term607));
        assertTrue(recursiveEquals(term117, term610));
        assertTrue(recursiveEquals(retValue, true));
    }

};


