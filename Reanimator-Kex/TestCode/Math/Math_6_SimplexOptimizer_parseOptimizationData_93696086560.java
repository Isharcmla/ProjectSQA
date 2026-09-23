package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexOptimizer_parseOptimizationData_93696086560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29093;
     Object term28889;

    public SimplexOptimizer_parseOptimizationData_93696086560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29093 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term28889 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term29185 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        Object term29313 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        setElement(term28889, 0, term29185);
        setElement(term28889, 1, term29313);
        setElement(term28889, 2, term29313);
        setElement(term28889, 3, term29313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term28889;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term29093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


