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

public class MultiDirectional_iterateSimplex_43366462817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6353;

    public MultiDirectional_iterateSimplex_43366462817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6353 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term5822 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 41);
        Object term6469 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term5825 = (double[]) newDoubleArray(100);
        Object term6585 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term5927 = (double[]) newDoubleArray(108);
        setIntField(term6353, term6353.getClass(), "iterations", 2147483646);
        setIntField(term6353, term6353.getClass(), "maxIterations", 2147483647);
        setField(term6469, term6469.getClass(), "point", term5825);
        setElement(term5822, 0, term6469);
        setField(term6585, term6585.getClass(), "point", term5927);
        setElement(term5822, 1, term6585);
        setElement(term5822, 2, term6469);
        setElement(term5822, 3, term6469);
        setElement(term5822, 4, term6469);
        setElement(term5822, 5, term6469);
        setElement(term5822, 6, term6469);
        setElement(term5822, 7, term6469);
        setElement(term5822, 8, term6469);
        setElement(term5822, 9, term6469);
        setElement(term5822, 10, term6469);
        setElement(term5822, 11, term6469);
        setElement(term5822, 12, term6469);
        setElement(term5822, 13, term6469);
        setElement(term5822, 14, term6469);
        setElement(term5822, 15, term6469);
        setElement(term5822, 16, term6469);
        setElement(term5822, 17, term6469);
        setElement(term5822, 18, term6469);
        setElement(term5822, 19, term6469);
        setElement(term5822, 20, term6469);
        setElement(term5822, 21, term6469);
        setElement(term5822, 22, term6469);
        setElement(term5822, 23, term6469);
        setElement(term5822, 24, term6469);
        setElement(term5822, 25, term6469);
        setElement(term5822, 26, term6469);
        setElement(term5822, 27, term6469);
        setElement(term5822, 28, term6469);
        setElement(term5822, 29, term6469);
        setElement(term5822, 30, term6469);
        setElement(term5822, 31, term6469);
        setElement(term5822, 32, term6469);
        setElement(term5822, 33, term6469);
        setElement(term5822, 34, term6469);
        setElement(term5822, 35, term6469);
        setElement(term5822, 36, term6469);
        setElement(term5822, 37, term6469);
        setElement(term5822, 38, term6469);
        setElement(term5822, 39, term6469);
        setElement(term5822, 40, term6469);
        setField(term6353, term6353.getClass(), "simplex", term5822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term6353, args);
    }

};


