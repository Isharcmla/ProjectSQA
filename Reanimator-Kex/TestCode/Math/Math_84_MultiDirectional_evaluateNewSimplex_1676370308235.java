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

public class MultiDirectional_evaluateNewSimplex_1676370308235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301362;
     Object term300784;

    public MultiDirectional_evaluateNewSimplex_1676370308235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301362 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term300813 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 0);
        setField(term301362, term301362.getClass(), "simplex", term300813);
        term300784 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 4);
        Object term301478 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term300788 = (double[]) newDoubleArray(23);
        Object term301594 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(term301478, term301478.getClass(), "point", term300788);
        setElement(term300784, 0, term301478);
        setField(term301594, term301594.getClass(), "point", term300788);
        setElement(term300784, 1, term301594);
        setElement(term300784, 2, term301478);
        setElement(term300784, 3, term301478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term300784;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term301362, args);
    }

};


