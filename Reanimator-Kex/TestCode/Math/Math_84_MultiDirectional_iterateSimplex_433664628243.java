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

public class MultiDirectional_iterateSimplex_433664628243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315082;

    public MultiDirectional_iterateSimplex_433664628243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315082 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term312882 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term315198 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term312885 = (double[]) newDoubleArray(112);
        Object term315314 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term312999 = (double[]) newDoubleArray(128);
        setIntField(term315082, term315082.getClass(), "iterations", 2147483646);
        setIntField(term315082, term315082.getClass(), "maxIterations", 2147483647);
        setField(term315198, term315198.getClass(), "point", term312885);
        setElement(term312882, 0, term315198);
        setField(term315314, term315314.getClass(), "point", term312999);
        setElement(term312882, 1, term315314);
        setElement(term312882, 2, term315198);
        setElement(term312882, 3, term315198);
        setElement(term312882, 4, term315198);
        setElement(term312882, 5, term315198);
        setElement(term312882, 6, term315198);
        setElement(term312882, 7, term315198);
        setElement(term312882, 8, term315198);
        setElement(term312882, 9, term315198);
        setElement(term312882, 10, term315198);
        setElement(term312882, 11, term315198);
        setElement(term312882, 12, term315198);
        setElement(term312882, 13, term315198);
        setElement(term312882, 14, term315198);
        setElement(term312882, 15, term315198);
        setElement(term312882, 16, term315198);
        setElement(term312882, 17, term315198);
        setElement(term312882, 18, term315198);
        setElement(term312882, 19, term315198);
        setElement(term312882, 20, term315198);
        setElement(term312882, 21, term315198);
        setElement(term312882, 22, term315198);
        setElement(term312882, 23, term315198);
        setElement(term312882, 24, term315198);
        setElement(term312882, 25, term315198);
        setElement(term312882, 26, term315198);
        setElement(term312882, 27, term315198);
        setElement(term312882, 28, term315198);
        setElement(term312882, 29, term315198);
        setElement(term312882, 30, term315198);
        setElement(term312882, 31, term315198);
        setElement(term312882, 32, term315198);
        setElement(term312882, 33, term315198);
        setElement(term312882, 34, term315198);
        setElement(term312882, 35, term315198);
        setElement(term312882, 36, term315198);
        setElement(term312882, 37, term315198);
        setElement(term312882, 38, term315198);
        setElement(term312882, 39, term315198);
        setElement(term312882, 40, term315198);
        setElement(term312882, 41, term315198);
        setElement(term312882, 42, term315198);
        setElement(term312882, 43, term315198);
        setElement(term312882, 44, term315198);
        setElement(term312882, 45, term315198);
        setElement(term312882, 46, term315198);
        setElement(term312882, 47, term315198);
        setElement(term312882, 48, term315198);
        setElement(term312882, 49, term315198);
        setElement(term312882, 50, term315198);
        setElement(term312882, 51, term315198);
        setElement(term312882, 52, term315198);
        setElement(term312882, 53, term315198);
        setElement(term312882, 54, term315198);
        setElement(term312882, 55, term315198);
        setElement(term312882, 56, term315198);
        setElement(term312882, 57, term315198);
        setElement(term312882, 58, term315198);
        setElement(term312882, 59, term315198);
        setElement(term312882, 60, term315198);
        setElement(term312882, 61, term315198);
        setElement(term312882, 62, term315198);
        setElement(term312882, 63, term315198);
        setField(term315082, term315082.getClass(), "simplex", term312882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term315082, args);
    }

};


