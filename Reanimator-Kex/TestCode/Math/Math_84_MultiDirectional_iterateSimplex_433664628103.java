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

public class MultiDirectional_iterateSimplex_433664628103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122812;

    public MultiDirectional_iterateSimplex_433664628103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122812 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term121639 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term122928 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term121642 = (double[]) newDoubleArray(29);
        Object term123044 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term121673 = (double[]) newDoubleArray(512);
        setIntField(term122812, term122812.getClass(), "iterations", 2147483646);
        setIntField(term122812, term122812.getClass(), "maxIterations", 2147483647);
        setField(term122928, term122928.getClass(), "point", term121642);
        setElement(term121639, 0, term122928);
        setField(term123044, term123044.getClass(), "point", term121673);
        setElement(term121639, 1, term123044);
        setElement(term121639, 2, term122928);
        setElement(term121639, 3, term122928);
        setElement(term121639, 4, term122928);
        setElement(term121639, 5, term122928);
        setElement(term121639, 6, term122928);
        setElement(term121639, 7, term122928);
        setField(term122812, term122812.getClass(), "simplex", term121639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term122812, args);
    }

};


