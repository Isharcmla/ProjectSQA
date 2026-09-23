package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56100;
     Object term55842;

    public NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56100 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        term55842 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term56192 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        Object term56356 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setElement(term55842, 0, term56192);
        setElement(term55842, 1, term56356);
        setElement(term55842, 2, term56356);
        setElement(term55842, 3, term56356);
        setElement(term55842, 4, term56356);
        setElement(term55842, 5, term56356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term55842;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term56100, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


