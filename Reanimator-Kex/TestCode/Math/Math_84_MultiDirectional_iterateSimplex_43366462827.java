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

public class MultiDirectional_iterateSimplex_43366462827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16398;

    public MultiDirectional_iterateSimplex_43366462827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16398 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term15132 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term16514 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term15135 = (double[]) newDoubleArray(57);
        Object term16630 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term15194 = (double[]) newDoubleArray(128);
        setIntField(term16398, term16398.getClass(), "iterations", 2147483646);
        setIntField(term16398, term16398.getClass(), "maxIterations", 2147483647);
        setField(term16514, term16514.getClass(), "point", term15135);
        setElement(term15132, 0, term16514);
        setField(term16630, term16630.getClass(), "point", term15194);
        setElement(term15132, 1, term16630);
        setField(term16398, term16398.getClass(), "simplex", term15132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term16398, args);
    }

};


