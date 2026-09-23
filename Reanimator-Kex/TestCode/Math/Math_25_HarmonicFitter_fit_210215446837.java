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

public class HarmonicFitter_fit_210215446837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29218;

    public HarmonicFitter_fit_210215446837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29410 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term29410, term29410.getClass(), "y", 0.0);
        setDoubleField(term29410, term29410.getClass(), "weight", 0.0);
        ArrayList term29270 = new ArrayList();
        ((ArrayList) term29270).add(term29410);
        term29218 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        Object term29594 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        Object term29778 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        setField(term29218, term29218.getClass(), "observations", term29270);
        setIntField(term29594, term29594.getClass(), "maxEvaluations", 0);
        setIntField(term29594, term29594.getClass(), "starts", 2);
        setField(term29594, term29594.getClass(), "optima", null);
        setIntField(term29594, term29594.getClass(), "totalEvaluations", 0);
        setField(term29594, term29594.getClass(), "optimizer", term29778);
        setField(term29218, term29218.getClass(), "optimizer", term29594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term29218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


