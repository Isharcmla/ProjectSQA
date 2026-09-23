package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;

public class MathArrays_normalizeArray_596043538189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58855;
     Object term586788;
     Object term586775;

    public MathArrays_normalizeArray_596043538189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58855 = (double[]) newDoubleArray(5);
        setDoubleElement(term58855, 0, -9.2166166374137201E18);
        setDoubleElement(term58855, 1, -9.2188684372274053E18);
        setDoubleElement(term58855, 2, -9.2166166374137201E18);
        setDoubleElement(term58855, 3, -9.2188684200475361E18);
        setDoubleElement(term58855, 4, -9.2166166374137201E18);
        term586788 = (double[]) newDoubleArray(5);
        setDoubleElement(term586788, 0, -9.2166166374137201E18);
        setDoubleElement(term586788, 1, -9.2188684372274053E18);
        setDoubleElement(term586788, 2, -9.2166166374137201E18);
        setDoubleElement(term586788, 3, -9.2188684200475361E18);
        setDoubleElement(term586788, 4, -9.2166166374137201E18);
        term586775 = (double[]) newDoubleArray(5);
        setDoubleElement(term586775, 0, -4.449712857902466E-309);
        setDoubleElement(term586775, 1, -4.45080000983452E-309);
        setDoubleElement(term586775, 2, -4.449712857902466E-309);
        setDoubleElement(term586775, 3, -4.45080000154021E-309);
        setDoubleElement(term586775, 4, -4.449712857902466E-309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term58855;
        args[1] = -2.225073858508213E-308;
        Object retValue = callMethod(klass, "normalizeArray", argTypes, null, args);
        assertTrue(recursiveEquals(term58855, term586788));
        assertTrue(recursiveEquals(retValue, term586775));
    }

};


