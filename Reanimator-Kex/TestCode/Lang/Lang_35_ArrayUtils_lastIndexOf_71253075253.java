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

public class ArrayUtils_lastIndexOf_71253075253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888;
     Object term896;
     Object term13490;

    public ArrayUtils_lastIndexOf_71253075253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term888 = (double[]) newDoubleArray(7);
        setDoubleElement(term888, 0, 0.3202192021706908);
        setDoubleElement(term888, 1, 0.22651340641904605);
        setDoubleElement(term888, 2, 0.8878841294187743);
        setDoubleElement(term888, 3, 0.6588948704887806);
        setDoubleElement(term888, 4, 0.6397214730945112);
        setDoubleElement(term888, 5, 0.25937345430928016);
        setDoubleElement(term888, 6, 0.5873228247510078);
        term896 = new Double(0.8823181080774973);
        term13490 = (double[]) newDoubleArray(7);
        setDoubleElement(term13490, 0, 0.3202192021706908);
        setDoubleElement(term13490, 1, 0.22651340641904605);
        setDoubleElement(term13490, 2, 0.8878841294187743);
        setDoubleElement(term13490, 3, 0.6588948704887806);
        setDoubleElement(term13490, 4, 0.6397214730945112);
        setDoubleElement(term13490, 5, 0.25937345430928016);
        setDoubleElement(term13490, 6, 0.5873228247510078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term888;
        args[1] = term896;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term888, term13490));
        assertTrue(recursiveEquals(term896, 0.8823181080774973));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


