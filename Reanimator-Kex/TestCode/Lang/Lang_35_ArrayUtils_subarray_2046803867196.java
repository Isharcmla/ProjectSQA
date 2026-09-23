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
import java.lang.Integer;

public class ArrayUtils_subarray_2046803867196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term199;
     Object term201;
     Object term11537;
     Object term11530;

    public ArrayUtils_subarray_2046803867196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = (double[]) newDoubleArray(3);
        setDoubleElement(term195, 0, 0.5523635872663106);
        setDoubleElement(term195, 1, 0.544608645520025);
        setDoubleElement(term195, 2, 0.28570734989730284);
        term199 = new Integer(-6029667);
        term201 = new Integer(-2068769794);
        term11537 = (double[]) newDoubleArray(3);
        setDoubleElement(term11537, 0, 0.5523635872663106);
        setDoubleElement(term11537, 1, 0.544608645520025);
        setDoubleElement(term11537, 2, 0.28570734989730284);
        term11530 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term195;
        args[1] = term199;
        args[2] = term201;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term195, term11537));
        assertTrue(recursiveEquals(term199, -6029667));
        assertTrue(recursiveEquals(term201, -2068769794));
        assertTrue(recursiveEquals(retValue, term11530));
    }

};


