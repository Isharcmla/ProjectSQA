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
import java.lang.Double;

public class MultiDirectional_evaluateNewSimplex_16763703088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;
     Object term1723;

    public MultiDirectional_evaluateNewSimplex_16763703088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1946 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        setField(term1946, term1946.getClass(), "simplex", null);
        term1723 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term2062 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term1727 = (double[]) newDoubleArray(2);
        Object term2178 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term1731 = (double[]) newDoubleArray(20);
        setField(term2062, term2062.getClass(), "point", term1727);
        setElement(term1723, 0, term2062);
        setField(term2178, term2178.getClass(), "point", term1731);
        setElement(term1723, 1, term2178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term1723;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term1946, args);
    }

};


