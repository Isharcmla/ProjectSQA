package org.apache.commons.math3.optimization.fitting;

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
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_210215446841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32118;

    public HarmonicFitter_fit_210215446841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32310 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term32310, term32310.getClass(), "y", 0.0);
        setDoubleField(term32310, term32310.getClass(), "weight", 0.0);
        ArrayList term32170 = new ArrayList();
        ((ArrayList) term32170).add(term32310);
        term32118 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        Object term32494 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        Object term32678 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        setField(term32118, term32118.getClass(), "observations", term32170);
        setIntField(term32494, term32494.getClass(), "maxEvaluations", 0);
        setIntField(term32494, term32494.getClass(), "starts", 32);
        setField(term32494, term32494.getClass(), "optima", null);
        setIntField(term32494, term32494.getClass(), "totalEvaluations", 0);
        setField(term32494, term32494.getClass(), "optimizer", term32678);
        setField(term32118, term32118.getClass(), "optimizer", term32494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term32118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


