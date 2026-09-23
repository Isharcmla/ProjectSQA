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

public class MultiDirectional_iterateSimplex_433664628162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199015;

    public MultiDirectional_iterateSimplex_433664628162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199015 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term197170 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term199131 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term197173 = (double[]) newDoubleArray(91);
        Object term199247 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term197266 = (double[]) newDoubleArray(128);
        setIntField(term199015, term199015.getClass(), "iterations", 2147483646);
        setIntField(term199015, term199015.getClass(), "maxIterations", 2147483647);
        setField(term199131, term199131.getClass(), "point", term197173);
        setElement(term197170, 0, term199131);
        setField(term199247, term199247.getClass(), "point", term197266);
        setElement(term197170, 1, term199247);
        setElement(term197170, 2, term199131);
        setElement(term197170, 3, term199131);
        setElement(term197170, 4, term199131);
        setElement(term197170, 5, term199131);
        setElement(term197170, 6, term199131);
        setElement(term197170, 7, term199131);
        setField(term199015, term199015.getClass(), "simplex", term197170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term199015, args);
    }

};


