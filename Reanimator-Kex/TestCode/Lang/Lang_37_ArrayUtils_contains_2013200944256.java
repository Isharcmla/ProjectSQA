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

public class ArrayUtils_contains_2013200944256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942;
     Object term947;
     Object term949;
     Object term13625;

    public ArrayUtils_contains_2013200944256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942 = (double[]) newDoubleArray(4);
        setDoubleElement(term942, 0, 0.025133051616627267);
        setDoubleElement(term942, 1, 0.016575281023182953);
        setDoubleElement(term942, 2, 0.5308350402051779);
        setDoubleElement(term942, 3, 0.7154795600170818);
        term947 = new Double(0.6355029654528058);
        term949 = new Double(0.0022646783892913414);
        term13625 = (double[]) newDoubleArray(4);
        setDoubleElement(term13625, 0, 0.025133051616627267);
        setDoubleElement(term13625, 1, 0.016575281023182953);
        setDoubleElement(term13625, 2, 0.5308350402051779);
        setDoubleElement(term13625, 3, 0.7154795600170818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term942;
        args[1] = term947;
        args[2] = term949;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term942, term13625));
        assertTrue(recursiveEquals(term947, 0.6355029654528058));
        assertTrue(recursiveEquals(term949, 0.0022646783892913414));
        assertTrue(recursiveEquals(retValue, false));
    }

};


