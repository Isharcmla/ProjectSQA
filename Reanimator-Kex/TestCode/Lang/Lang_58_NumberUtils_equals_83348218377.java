package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class NumberUtils_equals_83348218377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;
     Object term502;
     Object term5751;
     Object term5752;

    public NumberUtils_equals_83348218377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = (double[]) newDoubleArray(6);
        setDoubleElement(term495, 0, 0.3455959125047594);
        setDoubleElement(term495, 1, 0.5523635872663106);
        setDoubleElement(term495, 2, 0.544608645520025);
        setDoubleElement(term495, 3, 0.28570734989730284);
        setDoubleElement(term495, 4, 0.40176586625454525);
        setDoubleElement(term495, 5, 0.2641345529914265);
        term502 = (double[]) newDoubleArray(5);
        setDoubleElement(term502, 0, 0.36923381893433327);
        setDoubleElement(term502, 1, 0.6076495596892013);
        setDoubleElement(term502, 2, 0.37773193782763337);
        setDoubleElement(term502, 3, 0.8474802076607362);
        setDoubleElement(term502, 4, 0.5183269973490326);
        term5751 = (double[]) newDoubleArray(6);
        setDoubleElement(term5751, 0, 0.3455959125047594);
        setDoubleElement(term5751, 1, 0.5523635872663106);
        setDoubleElement(term5751, 2, 0.544608645520025);
        setDoubleElement(term5751, 3, 0.28570734989730284);
        setDoubleElement(term5751, 4, 0.40176586625454525);
        setDoubleElement(term5751, 5, 0.2641345529914265);
        term5752 = (double[]) newDoubleArray(5);
        setDoubleElement(term5752, 0, 0.36923381893433327);
        setDoubleElement(term5752, 1, 0.6076495596892013);
        setDoubleElement(term5752, 2, 0.37773193782763337);
        setDoubleElement(term5752, 3, 0.8474802076607362);
        setDoubleElement(term5752, 4, 0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term495;
        args[1] = term502;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term495, term5751));
        assertTrue(recursiveEquals(term502, term5752));
        assertTrue(recursiveEquals(retValue, false));
    }

};


