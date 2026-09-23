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

public class SimplexOptimizer_parseOptimizationData_93696086551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23731;
     Object term23492;

    public SimplexOptimizer_parseOptimizationData_93696086551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23731 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term23492 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term23813 = newInstance(Class.forName("org.apache.commons.math3.optim.MaxEval"));
        Object term23905 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        setElement(term23492, 0, term23813);
        setElement(term23492, 1, term23813);
        setElement(term23492, 2, term23813);
        setElement(term23492, 3, term23905);
        setElement(term23492, 4, term23813);
        setElement(term23492, 5, term23813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23492;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term23731, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


