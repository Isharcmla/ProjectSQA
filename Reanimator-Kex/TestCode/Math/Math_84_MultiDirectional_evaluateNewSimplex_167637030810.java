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

public class MultiDirectional_evaluateNewSimplex_167637030810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2894;
     Object term2623;

    public MultiDirectional_evaluateNewSimplex_167637030810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2894 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term2635 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 0);
        setField(term2894, term2894.getClass(), "simplex", term2635);
        term2623 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term3010 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term2627 = (double[]) newDoubleArray(6);
        Object term3126 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(term3010, term3010.getClass(), "point", term2627);
        setElement(term2623, 0, term3010);
        setField(term3126, term3126.getClass(), "point", term2627);
        setElement(term2623, 1, term3126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term2623;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term2894, args);
    }

};


