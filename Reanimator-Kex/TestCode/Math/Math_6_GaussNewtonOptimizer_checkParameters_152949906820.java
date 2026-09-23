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
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.EqualityUtils.*;

public class GaussNewtonOptimizer_checkParameters_152949906820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10160;
     Object term10343;

    public GaussNewtonOptimizer_checkParameters_152949906820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10160 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        setField(term10160, term10160.getClass(), "lowerBound", null);
        term10343 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        setBooleanField(term10343, term10343.getClass(), "useLU", false);
        setField(term10343, term10343.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term10343, term10343.getClass(), "cost", 0.0);
        setField(term10343, term10343.getClass(), "jacobian", null);
        setField(term10343, term10343.getClass(), "target", null);
        setField(term10343, term10343.getClass(), "weightMatrix", null);
        setField(term10343, term10343.getClass(), "model", null);
        setField(term10343, term10343.getClass(), "start", null);
        setField(term10343, term10343.getClass(), "lowerBound", null);
        setField(term10343, term10343.getClass(), "upperBound", null);
        setField(term10343, term10343.getClass(), "evaluations", null);
        setField(term10343, term10343.getClass(), "iterations", null);
        setField(term10343, term10343.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkParameters", argTypes, term10160, args);
        assertTrue(recursiveEquals(term10160, term10343));
    }

};


