package org.apache.commons.math3.optim.nonlinear.vector;

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
import static org.apache.commons.math3.optim.nonlinear.vector.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.vector.EqualityUtils.*;
import java.lang.Object;

public class Weight_init_11168833843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term341;
     Object term349;

    public Weight_init_11168833843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (double[]) newDoubleArray(5);
        setDoubleElement(term1, 0, 0.13238746331190498);
        setDoubleElement(term1, 1, 0.3455959125047594);
        setDoubleElement(term1, 2, 0.5523635872663106);
        setDoubleElement(term1, 3, 0.544608645520025);
        setDoubleElement(term1, 4, 0.28570734989730284);
        term341 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Object term342 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term343 = (Object[]) newArray("[D", 5);
        double[] term344 = (double[]) newDoubleArray(5);
        double[] term345 = (double[]) newDoubleArray(5);
        double[] term346 = (double[]) newDoubleArray(5);
        double[] term347 = (double[]) newDoubleArray(5);
        double[] term348 = (double[]) newDoubleArray(5);
        setDoubleElement(term344, 0, 0.13238746331190498);
        setElement(term343, 0, term344);
        setDoubleElement(term345, 1, 0.3455959125047594);
        setElement(term343, 1, term345);
        setDoubleElement(term346, 2, 0.5523635872663106);
        setElement(term343, 2, term346);
        setDoubleElement(term347, 3, 0.544608645520025);
        setElement(term343, 3, term347);
        setDoubleElement(term348, 4, 0.28570734989730284);
        setElement(term343, 4, term348);
        setField(term342, term342.getClass(), "data", term343);
        setField(term341, term341.getClass(), "weightMatrix", term342);
        term349 = (double[]) newDoubleArray(5);
        setDoubleElement(term349, 0, 0.13238746331190498);
        setDoubleElement(term349, 1, 0.3455959125047594);
        setDoubleElement(term349, 2, 0.5523635872663106);
        setDoubleElement(term349, 3, 0.544608645520025);
        setDoubleElement(term349, 4, 0.28570734989730284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term341));
        assertTrue(recursiveEquals(term1, term349));
    }

};


