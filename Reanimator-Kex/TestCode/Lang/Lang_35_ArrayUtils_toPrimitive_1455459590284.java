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
import java.lang.Object;
import java.lang.Double;

public class ArrayUtils_toPrimitive_1455459590284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247;
     Object term14531;
     Object term14523;

    public ArrayUtils_toPrimitive_1455459590284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1248 = new Double(0.13238746331190498);
        Double term1250 = new Double(0.3455959125047594);
        term1247 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term1247, 0, term1248);
        setElement(term1247, 1, term1250);
        Double term14532 = new Double(0.13238746331190498);
        Double term14533 = new Double(0.3455959125047594);
        term14531 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term14531, 0, term14532);
        setElement(term14531, 1, term14533);
        term14523 = (double[]) newDoubleArray(2);
        setDoubleElement(term14523, 0, 0.13238746331190498);
        setDoubleElement(term14523, 1, 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1247;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1247, term14531));
        assertTrue(recursiveEquals(retValue, term14523));
    }

};


