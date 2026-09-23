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

public class ArrayUtils_addAll_1794888816306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1472;
     Object term1476;
     Object term15112;
     Object term15113;
     Object term15101;

    public ArrayUtils_addAll_1794888816306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1472 = (short[]) newShortArray(3);
        setShortElement(term1472, 0, (short) -4506);
        setShortElement(term1472, 1, (short) 3466);
        setShortElement(term1472, 2, (short) 11906);
        term1476 = (short[]) newShortArray(1);
        setShortElement(term1476, 0, (short) 16549);
        term15112 = (short[]) newShortArray(3);
        setShortElement(term15112, 0, (short) -4506);
        setShortElement(term15112, 1, (short) 3466);
        setShortElement(term15112, 2, (short) 11906);
        term15113 = (short[]) newShortArray(1);
        setShortElement(term15113, 0, (short) 16549);
        term15101 = (short[]) newShortArray(4);
        setShortElement(term15101, 0, (short) -4506);
        setShortElement(term15101, 1, (short) 3466);
        setShortElement(term15101, 2, (short) 11906);
        setShortElement(term15101, 3, (short) 16549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1472;
        args[1] = term1476;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1472, term15112));
        assertTrue(recursiveEquals(term1476, term15113));
        assertTrue(recursiveEquals(retValue, term15101));
    }

};


