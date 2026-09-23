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

public class MultiDirectional_iterateSimplex_433664628176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214719;

    public MultiDirectional_iterateSimplex_433664628176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214719 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term212800 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term214835 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term212803 = (double[]) newDoubleArray(88);
        Object term214951 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term212893 = (double[]) newDoubleArray(256);
        setIntField(term214719, term214719.getClass(), "iterations", 2147483646);
        setIntField(term214719, term214719.getClass(), "maxIterations", 2147483647);
        setField(term214835, term214835.getClass(), "point", term212803);
        setElement(term212800, 0, term214835);
        setField(term214951, term214951.getClass(), "point", term212893);
        setElement(term212800, 1, term214951);
        setElement(term212800, 2, term214835);
        setElement(term212800, 3, term214835);
        setElement(term212800, 4, term214835);
        setElement(term212800, 5, term214835);
        setElement(term212800, 6, term214835);
        setElement(term212800, 7, term214835);
        setElement(term212800, 8, term214835);
        setElement(term212800, 9, term214835);
        setElement(term212800, 10, term214835);
        setElement(term212800, 11, term214835);
        setElement(term212800, 12, term214835);
        setElement(term212800, 13, term214835);
        setElement(term212800, 14, term214835);
        setElement(term212800, 15, term214835);
        setField(term214719, term214719.getClass(), "simplex", term212800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term214719, args);
    }

};


