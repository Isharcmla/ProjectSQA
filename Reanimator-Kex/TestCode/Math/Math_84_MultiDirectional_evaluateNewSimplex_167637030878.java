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

public class MultiDirectional_evaluateNewSimplex_167637030878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84752;
     Object term84516;

    public MultiDirectional_evaluateNewSimplex_167637030878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84752 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        setField(term84752, term84752.getClass(), "simplex", null);
        term84516 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term84868 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term84520 = (double[]) newDoubleArray(4);
        Object term84984 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(term84868, term84868.getClass(), "point", term84520);
        setElement(term84516, 0, term84868);
        setField(term84984, term84984.getClass(), "point", term84520);
        setElement(term84516, 1, term84984);
        setElement(term84516, 2, term84868);
        setElement(term84516, 3, term84868);
        setElement(term84516, 4, term84868);
        setElement(term84516, 5, term84868);
        setElement(term84516, 6, term84868);
        setElement(term84516, 7, term84868);
        setElement(term84516, 8, term84868);
        setElement(term84516, 9, term84868);
        setElement(term84516, 10, term84868);
        setElement(term84516, 11, term84868);
        setElement(term84516, 12, term84868);
        setElement(term84516, 13, term84868);
        setElement(term84516, 14, term84868);
        setElement(term84516, 15, term84868);
        setElement(term84516, 17, term84868);
        setElement(term84516, 18, term84868);
        setElement(term84516, 19, term84868);
        setElement(term84516, 20, term84868);
        setElement(term84516, 21, term84868);
        setElement(term84516, 22, term84868);
        setElement(term84516, 23, term84868);
        setElement(term84516, 24, term84868);
        setElement(term84516, 25, term84868);
        setElement(term84516, 26, term84868);
        setElement(term84516, 27, term84868);
        setElement(term84516, 28, term84868);
        setElement(term84516, 29, term84868);
        setElement(term84516, 30, term84868);
        setElement(term84516, 31, term84868);
        setElement(term84516, 32, term84868);
        setElement(term84516, 33, term84868);
        setElement(term84516, 34, term84868);
        setElement(term84516, 35, term84868);
        setElement(term84516, 36, term84868);
        setElement(term84516, 37, term84868);
        setElement(term84516, 38, term84868);
        setElement(term84516, 39, term84868);
        setElement(term84516, 40, term84868);
        setElement(term84516, 41, term84868);
        setElement(term84516, 42, term84868);
        setElement(term84516, 43, term84868);
        setElement(term84516, 44, term84868);
        setElement(term84516, 45, term84868);
        setElement(term84516, 46, term84868);
        setElement(term84516, 47, term84868);
        setElement(term84516, 48, term84868);
        setElement(term84516, 49, term84868);
        setElement(term84516, 50, term84868);
        setElement(term84516, 51, term84868);
        setElement(term84516, 52, term84868);
        setElement(term84516, 53, term84868);
        setElement(term84516, 54, term84868);
        setElement(term84516, 55, term84868);
        setElement(term84516, 56, term84868);
        setElement(term84516, 57, term84868);
        setElement(term84516, 58, term84868);
        setElement(term84516, 59, term84868);
        setElement(term84516, 60, term84868);
        setElement(term84516, 61, term84868);
        setElement(term84516, 62, term84868);
        setElement(term84516, 63, term84868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term84516;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term84752, args);
    }

};


