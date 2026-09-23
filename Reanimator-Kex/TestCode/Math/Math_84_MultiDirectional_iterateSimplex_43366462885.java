package org.apache.commons.math.optimization.direct;

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
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiDirectional_iterateSimplex_43366462885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94368;

    public MultiDirectional_iterateSimplex_43366462885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94368 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term92670 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 41);
        Object term94484 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term92673 = (double[]) newDoubleArray(85);
        Object term94600 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setIntField(term94368, term94368.getClass(), "iterations", 2147483646);
        setIntField(term94368, term94368.getClass(), "maxIterations", 2147483647);
        setField(term94484, term94484.getClass(), "point", term92673);
        setElement(term92670, 0, term94484);
        setField(term94600, term94600.getClass(), "point", term92673);
        setElement(term92670, 1, term94600);
        setElement(term92670, 2, term94484);
        setElement(term92670, 3, term94484);
        setElement(term92670, 4, term94484);
        setElement(term92670, 5, term94484);
        setElement(term92670, 6, term94484);
        setElement(term92670, 7, term94484);
        setElement(term92670, 8, term94484);
        setElement(term92670, 9, term94484);
        setElement(term92670, 10, term94484);
        setElement(term92670, 11, term94484);
        setElement(term92670, 12, term94484);
        setElement(term92670, 13, term94484);
        setElement(term92670, 14, term94484);
        setElement(term92670, 15, term94484);
        setElement(term92670, 16, term94484);
        setElement(term92670, 17, term94484);
        setElement(term92670, 18, term94484);
        setElement(term92670, 19, term94484);
        setElement(term92670, 20, term94484);
        setElement(term92670, 21, term94484);
        setElement(term92670, 22, term94484);
        setElement(term92670, 23, term94484);
        setElement(term92670, 24, term94484);
        setElement(term92670, 25, term94484);
        setElement(term92670, 26, term94484);
        setElement(term92670, 27, term94484);
        setElement(term92670, 28, term94484);
        setElement(term92670, 29, term94484);
        setElement(term92670, 30, term94484);
        setElement(term92670, 31, term94484);
        setElement(term92670, 32, term94484);
        setElement(term92670, 33, term94484);
        setElement(term92670, 34, term94484);
        setElement(term92670, 35, term94484);
        setElement(term92670, 36, term94484);
        setElement(term92670, 37, term94484);
        setElement(term92670, 38, term94484);
        setElement(term92670, 39, term94484);
        setElement(term92670, 40, term94484);
        setField(term94368, term94368.getClass(), "simplex", term92670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term94368, args);
    }

};


