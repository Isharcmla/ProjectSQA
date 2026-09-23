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

public class MultiDirectional_iterateSimplex_433664628247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322720;

    public MultiDirectional_iterateSimplex_433664628247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322720 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term320699 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term322836 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term320702 = (double[]) newDoubleArray(103);
        Object term322952 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term320807 = (double[]) newDoubleArray(103);
        setIntField(term322720, term322720.getClass(), "iterations", 2147483646);
        setIntField(term322720, term322720.getClass(), "maxIterations", 2147483647);
        setField(term322836, term322836.getClass(), "point", term320702);
        setElement(term320699, 0, term322836);
        setField(term322952, term322952.getClass(), "point", term320807);
        setElement(term320699, 1, term322952);
        setField(term322720, term322720.getClass(), "simplex", term320699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term322720, args);
    }

};


