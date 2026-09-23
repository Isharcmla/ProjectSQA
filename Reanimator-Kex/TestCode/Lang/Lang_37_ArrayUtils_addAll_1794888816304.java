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

public class ArrayUtils_addAll_1794888816304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1464;
     Object term1468;
     Object term15073;
     Object term15074;
     Object term15062;

    public ArrayUtils_addAll_1794888816304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1464 = (short[]) newShortArray(3);
        setShortElement(term1464, 0, (short) -4506);
        setShortElement(term1464, 1, (short) 3466);
        setShortElement(term1464, 2, (short) 11906);
        term1468 = (short[]) newShortArray(1);
        setShortElement(term1468, 0, (short) 16549);
        term15073 = (short[]) newShortArray(3);
        setShortElement(term15073, 0, (short) -4506);
        setShortElement(term15073, 1, (short) 3466);
        setShortElement(term15073, 2, (short) 11906);
        term15074 = (short[]) newShortArray(1);
        setShortElement(term15074, 0, (short) 16549);
        term15062 = (short[]) newShortArray(4);
        setShortElement(term15062, 0, (short) -4506);
        setShortElement(term15062, 1, (short) 3466);
        setShortElement(term15062, 2, (short) 11906);
        setShortElement(term15062, 3, (short) 16549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1464;
        args[1] = term1468;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1464, term15073));
        assertTrue(recursiveEquals(term1468, term15074));
        assertTrue(recursiveEquals(retValue, term15062));
    }

};


