package org.apache.commons.math.optimization.fitting;

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
import static org.apache.commons.math.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GaussianFitter_fit_212843929534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14293;

    public GaussianFitter_fit_212843929534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14345 = new ArrayList();
        term14293 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term14533 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term14104 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term14683 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(term14293, term14293.getClass(), "observations", term14345);
        setIntField(term14533, term14533.getClass(), "maxEvaluations", 0);
        setIntField(term14533, term14533.getClass(), "starts", 1);
        setField(term14533, term14533.getClass(), "optima", term14104);
        setIntField(term14533, term14533.getClass(), "totalEvaluations", 0);
        setField(term14533, term14533.getClass(), "optimizer", term14683);
        setField(term14293, term14293.getClass(), "optimizer", term14533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term14293, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


