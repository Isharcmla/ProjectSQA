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

public class MultiDirectional_iterateSimplex_433664628225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290580;

    public MultiDirectional_iterateSimplex_433664628225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290580 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term289118 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term290696 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term289121 = (double[]) newDoubleArray(46);
        Object term290812 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term289169 = (double[]) newDoubleArray(512);
        setIntField(term290580, term290580.getClass(), "iterations", 2147483646);
        setIntField(term290580, term290580.getClass(), "maxIterations", 2147483647);
        setField(term290696, term290696.getClass(), "point", term289121);
        setElement(term289118, 0, term290696);
        setField(term290812, term290812.getClass(), "point", term289169);
        setElement(term289118, 1, term290812);
        setElement(term289118, 2, term290696);
        setElement(term289118, 3, term290696);
        setElement(term289118, 4, term290696);
        setElement(term289118, 5, term290696);
        setElement(term289118, 6, term290696);
        setElement(term289118, 7, term290696);
        setElement(term289118, 8, term290696);
        setElement(term289118, 9, term290696);
        setElement(term289118, 10, term290696);
        setElement(term289118, 11, term290696);
        setElement(term289118, 12, term290696);
        setElement(term289118, 13, term290696);
        setElement(term289118, 14, term290696);
        setElement(term289118, 15, term290696);
        setElement(term289118, 16, term290696);
        setElement(term289118, 17, term290696);
        setElement(term289118, 18, term290696);
        setElement(term289118, 19, term290696);
        setElement(term289118, 20, term290696);
        setElement(term289118, 21, term290696);
        setElement(term289118, 22, term290696);
        setElement(term289118, 23, term290696);
        setElement(term289118, 24, term290696);
        setElement(term289118, 25, term290696);
        setElement(term289118, 26, term290696);
        setElement(term289118, 27, term290696);
        setElement(term289118, 28, term290696);
        setElement(term289118, 29, term290696);
        setElement(term289118, 30, term290696);
        setElement(term289118, 31, term290696);
        setField(term290580, term290580.getClass(), "simplex", term289118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term290580, args);
    }

};


