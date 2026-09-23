package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_doOptimize_158447067147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45821;

    public GaussNewtonOptimizer_doOptimize_158447067147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45821 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term45925 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        double[] term45581 = (double[]) newDoubleArray(8);
        Object term46029 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        Object term46139 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term45615 = (int[]) newIntArray(0);
        setField(term45821, term45821.getClass(), "lowerBound", null);
        setField(term45821, term45821.getClass(), "upperBound", null);
        setField(term45821, term45821.getClass(), "checker", term45925);
        setField(term45821, term45821.getClass(), "target", term45581);
        setIntField(term46029, term46029.getClass(), "rows", 0);
        setIntField(term46029, term46029.getClass(), "columns", 0);
        setField(term46139, term46139.getClass(), "keys", term45615);
        setField(term46029, term46029.getClass(), "entries", term46139);
        setField(term45821, term45821.getClass(), "weightMatrix", term46029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term45821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


