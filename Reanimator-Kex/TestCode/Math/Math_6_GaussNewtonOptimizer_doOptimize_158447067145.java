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

public class GaussNewtonOptimizer_doOptimize_158447067145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37210;

    public GaussNewtonOptimizer_doOptimize_158447067145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37210 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term37326 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        double[] term35474 = (double[]) newDoubleArray(763);
        Object term37430 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        Object term37540 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(term37210, term37210.getClass(), "lowerBound", null);
        setField(term37210, term37210.getClass(), "upperBound", null);
        setField(term37210, term37210.getClass(), "checker", term37326);
        setField(term37210, term37210.getClass(), "target", term35474);
        setIntField(term37430, term37430.getClass(), "rows", 0);
        setIntField(term37430, term37430.getClass(), "columns", 0);
        setField(term37430, term37430.getClass(), "entries", term37540);
        setField(term37210, term37210.getClass(), "weightMatrix", term37430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term37210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


