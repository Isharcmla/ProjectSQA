package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Float;
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1888713483260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term992;
     Object term1002;
     Object term1004;
     Object term13793;

    public ArrayUtils_lastIndexOf_1888713483260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term992 = (float[]) newFloatArray(9);
        setFloatElement(term992, 0, 0.89057696F);
        setFloatElement(term992, 1, 0.7332741F);
        setFloatElement(term992, 2, 0.15826964F);
        setFloatElement(term992, 3, 0.45691717F);
        setFloatElement(term992, 4, 0.17877543F);
        setFloatElement(term992, 5, 0.8598297F);
        setFloatElement(term992, 6, 0.96323884F);
        setFloatElement(term992, 7, 0.43692183F);
        setFloatElement(term992, 8, 0.80973893F);
        term1002 = new Float(0.7633268F);
        term1004 = new Integer(972867650);
        term13793 = (float[]) newFloatArray(9);
        setFloatElement(term13793, 0, 0.89057696F);
        setFloatElement(term13793, 1, 0.7332741F);
        setFloatElement(term13793, 2, 0.15826964F);
        setFloatElement(term13793, 3, 0.45691717F);
        setFloatElement(term13793, 4, 0.17877543F);
        setFloatElement(term13793, 5, 0.8598297F);
        setFloatElement(term13793, 6, 0.96323884F);
        setFloatElement(term13793, 7, 0.43692183F);
        setFloatElement(term13793, 8, 0.80973893F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = float.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term992;
        args[1] = term1002;
        args[2] = term1004;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term992, term13793));
        assertTrue(recursiveEquals(term1002, 0.7633268F));
        assertTrue(recursiveEquals(term1004, 972867650));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


