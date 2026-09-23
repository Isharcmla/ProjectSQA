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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;

public class PowellOptimizer_checkParameters_207089494039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37631;
     Object term37639;

    public PowellOptimizer_checkParameters_207089494039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37631 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        setField(term37631, term37631.getClass(), "lowerBound", null);
        term37639 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        setDoubleField(term37639, term37639.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term37639, term37639.getClass(), "absoluteThreshold", 0.0);
        setField(term37639, term37639.getClass(), "line", null);
        setField(term37639, term37639.getClass(), "function", null);
        setField(term37639, term37639.getClass(), "goal", null);
        setField(term37639, term37639.getClass(), "start", null);
        setField(term37639, term37639.getClass(), "lowerBound", null);
        setField(term37639, term37639.getClass(), "upperBound", null);
        setField(term37639, term37639.getClass(), "evaluations", null);
        setField(term37639, term37639.getClass(), "iterations", null);
        setField(term37639, term37639.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkParameters", argTypes, term37631, args);
        assertTrue(recursiveEquals(term37631, term37639));
    }

};


