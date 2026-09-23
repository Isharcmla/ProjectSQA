package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;
import java.lang.Object;

public class CMAESOptimizer_sumRows_1487067760156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82417;
     Object term82441;
     Object term82428;

    public CMAESOptimizer_sumRows_1487067760156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82417 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term82417, term82417.getClass(), "columns", 1);
        term82441 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term82441, term82441.getClass(), "rows", 0);
        setIntField(term82441, term82441.getClass(), "columns", 1);
        setField(term82441, term82441.getClass(), "entries", null);
        term82428 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term82429 = (Object[]) newArray("[D", 1);
        double[] term82430 = (double[]) newDoubleArray(1);
        setElement(term82429, 0, term82430);
        setField(term82428, term82428.getClass(), "data", term82429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term82417;
        Object retValue = callMethod(klass, "sumRows", argTypes, null, args);
        assertTrue(recursiveEquals(term82417, term82441));
        assertTrue(recursiveEquals(retValue, term82428));
    }

};


