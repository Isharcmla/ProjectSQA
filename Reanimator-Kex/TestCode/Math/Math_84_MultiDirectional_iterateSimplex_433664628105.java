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

public class MultiDirectional_iterateSimplex_433664628105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126690;

    public MultiDirectional_iterateSimplex_433664628105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126690 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term125640 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 256);
        Object term126806 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term125643 = (double[]) newDoubleArray(48);
        Object term126922 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term125693 = (double[]) newDoubleArray(64);
        setIntField(term126690, term126690.getClass(), "iterations", 2147483646);
        setIntField(term126690, term126690.getClass(), "maxIterations", 2147483647);
        setField(term126806, term126806.getClass(), "point", term125643);
        setElement(term125640, 0, term126806);
        setField(term126922, term126922.getClass(), "point", term125693);
        setElement(term125640, 1, term126922);
        setField(term126690, term126690.getClass(), "simplex", term125640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term126690, args);
    }

};


