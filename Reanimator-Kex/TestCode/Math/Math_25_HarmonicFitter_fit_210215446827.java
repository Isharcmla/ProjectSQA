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

public class HarmonicFitter_fit_210215446827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23867;

    public HarmonicFitter_fit_210215446827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24059 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term24059, term24059.getClass(), "y", 0.0);
        setDoubleField(term24059, term24059.getClass(), "weight", 0.0);
        ArrayList term23919 = new ArrayList();
        ((ArrayList) term23919).add(term24059);
        term23867 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        Object term24243 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        Object[] term23668 = (Object[]) newArray("org.apache.commons.math3.optimization.PointVectorValuePair", 0);
        setField(term23867, term23867.getClass(), "observations", term23919);
        setIntField(term24243, term24243.getClass(), "maxEvaluations", 0);
        setIntField(term24243, term24243.getClass(), "starts", 9);
        setField(term24243, term24243.getClass(), "optima", term23668);
        setIntField(term24243, term24243.getClass(), "totalEvaluations", 0);
        setField(term23867, term23867.getClass(), "optimizer", term24243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term23867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


