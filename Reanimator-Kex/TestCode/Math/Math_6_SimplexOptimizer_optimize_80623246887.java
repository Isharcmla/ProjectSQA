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

public class SimplexOptimizer_optimize_80623246887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46012;
     Object term45776;

    public SimplexOptimizer_optimize_80623246887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46012 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term46012, term46012.getClass(), "start", null);
        term45776 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term46140 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        Object term46292 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setElement(term45776, 0, term46140);
        setElement(term45776, 1, term46292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term45776;
        try {
            callMethod(klass, "optimize", argTypes, term46012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


