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

public class SimplexOptimizer_optimize_80623246879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40439;
     Object term40235;

    public SimplexOptimizer_optimize_80623246879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40439 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term40235 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term40531 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        Object term40675 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction"));
        setElement(term40235, 0, term40531);
        setElement(term40235, 1, term40675);
        setElement(term40235, 2, term40675);
        setElement(term40235, 3, term40675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term40235;
        try {
            callMethod(klass, "optimize", argTypes, term40439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


