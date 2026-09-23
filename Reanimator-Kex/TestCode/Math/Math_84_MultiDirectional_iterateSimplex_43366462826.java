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

public class MultiDirectional_iterateSimplex_43366462826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14715;

    public MultiDirectional_iterateSimplex_43366462826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14715 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term13535 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 16);
        Object term14831 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term13538 = (double[]) newDoubleArray(52);
        Object term14947 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term13592 = (double[]) newDoubleArray(128);
        setIntField(term14715, term14715.getClass(), "iterations", 2147483646);
        setIntField(term14715, term14715.getClass(), "maxIterations", 2147483647);
        setField(term14831, term14831.getClass(), "point", term13538);
        setElement(term13535, 0, term14831);
        setField(term14947, term14947.getClass(), "point", term13592);
        setElement(term13535, 1, term14947);
        setElement(term13535, 2, term14831);
        setElement(term13535, 3, term14831);
        setElement(term13535, 4, term14831);
        setElement(term13535, 5, term14831);
        setElement(term13535, 6, term14831);
        setElement(term13535, 7, term14831);
        setElement(term13535, 8, term14831);
        setElement(term13535, 9, term14831);
        setElement(term13535, 10, term14831);
        setElement(term13535, 11, term14831);
        setElement(term13535, 12, term14831);
        setElement(term13535, 13, term14831);
        setElement(term13535, 14, term14831);
        setElement(term13535, 15, term14831);
        setField(term14715, term14715.getClass(), "simplex", term13535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term14715, args);
    }

};


