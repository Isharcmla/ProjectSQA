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
import java.lang.Double;

public class MathArrays_scale_214426638842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term2411;
     Object term2398;

    public MathArrays_scale_214426638842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term3 = (double[]) newDoubleArray(5);
        setDoubleElement(term3, 0, 0.3455959125047594);
        setDoubleElement(term3, 1, 0.5523635872663106);
        setDoubleElement(term3, 2, 0.544608645520025);
        setDoubleElement(term3, 3, 0.28570734989730284);
        setDoubleElement(term3, 4, 0.40176586625454525);
        term2411 = (double[]) newDoubleArray(5);
        setDoubleElement(term2411, 0, 0.3455959125047594);
        setDoubleElement(term2411, 1, 0.5523635872663106);
        setDoubleElement(term2411, 2, 0.544608645520025);
        setDoubleElement(term2411, 3, 0.28570734989730284);
        setDoubleElement(term2411, 4, 0.40176586625454525);
        term2398 = (double[]) newDoubleArray(5);
        setDoubleElement(term2398, 0, 0.04575256618746816);
        setDoubleElement(term2398, 1, 0.07312601414405093);
        setDoubleElement(term2398, 2, 0.07209935707812858);
        setDoubleElement(term2398, 3, 0.03782407130247078);
        setDoubleElement(term2398, 4, 0.05318876387874933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        Object retValue = callMethod(klass, "scale", argTypes, null, args);
        assertTrue(recursiveEquals(term1, 0.13238746331190498));
        assertTrue(recursiveEquals(term3, term2411));
        assertTrue(recursiveEquals(retValue, term2398));
    }

};


