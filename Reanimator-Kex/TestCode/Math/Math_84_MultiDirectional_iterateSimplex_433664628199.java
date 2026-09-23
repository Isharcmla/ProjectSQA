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

public class MultiDirectional_iterateSimplex_433664628199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249162;

    public MultiDirectional_iterateSimplex_433664628199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249162 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term248166 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 32);
        Object term249278 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term248169 = (double[]) newDoubleArray(45);
        Object term249394 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term248216 = (double[]) newDoubleArray(64);
        setIntField(term249162, term249162.getClass(), "iterations", 2147483646);
        setIntField(term249162, term249162.getClass(), "maxIterations", 2147483647);
        setField(term249278, term249278.getClass(), "point", term248169);
        setElement(term248166, 0, term249278);
        setField(term249394, term249394.getClass(), "point", term248216);
        setElement(term248166, 1, term249394);
        setField(term249162, term249162.getClass(), "simplex", term248166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term249162, args);
    }

};


