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
import java.lang.Double;
import java.lang.Integer;

public class ArrayUtils_indexOf_784697973251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;
     Object term864;
     Object term866;
     Object term13408;

    public ArrayUtils_indexOf_784697973251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term862 = (double[]) newDoubleArray(1);
        setDoubleElement(term862, 0, 0.11493000848982304);
        term864 = new Double(0.37161417339133307);
        term866 = new Integer(1551099402);
        term13408 = (double[]) newDoubleArray(1);
        setDoubleElement(term13408, 0, 0.11493000848982304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term862;
        args[1] = term864;
        args[2] = term866;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term862, term13408));
        assertTrue(recursiveEquals(term864, 0.37161417339133307));
        assertTrue(recursiveEquals(term866, 1551099402));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


