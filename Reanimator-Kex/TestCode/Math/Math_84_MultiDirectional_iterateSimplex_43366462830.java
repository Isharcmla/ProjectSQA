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

public class MultiDirectional_iterateSimplex_43366462830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20250;

    public MultiDirectional_iterateSimplex_43366462830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20250 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term18816 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term20366 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term18819 = (double[]) newDoubleArray(67);
        Object term20482 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term18888 = (double[]) newDoubleArray(128);
        setIntField(term20250, term20250.getClass(), "iterations", 2147483646);
        setIntField(term20250, term20250.getClass(), "maxIterations", 2147483647);
        setField(term20366, term20366.getClass(), "point", term18819);
        setElement(term18816, 0, term20366);
        setField(term20482, term20482.getClass(), "point", term18888);
        setElement(term18816, 1, term20482);
        setField(term20250, term20250.getClass(), "simplex", term18816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term20250, args);
    }

};


