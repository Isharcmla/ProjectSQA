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

public class MultiDirectional_iterateSimplex_433664628113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133971;

    public MultiDirectional_iterateSimplex_433664628113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133971 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term132204 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 4);
        Object term134087 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term132207 = (double[]) newDoubleArray(79);
        Object term134203 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term132288 = (double[]) newDoubleArray(256);
        setIntField(term133971, term133971.getClass(), "iterations", 2147483646);
        setIntField(term133971, term133971.getClass(), "maxIterations", 2147483647);
        setField(term134087, term134087.getClass(), "point", term132207);
        setElement(term132204, 0, term134087);
        setField(term134203, term134203.getClass(), "point", term132288);
        setElement(term132204, 1, term134203);
        setField(term133971, term133971.getClass(), "simplex", term132204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term133971, args);
    }

};


