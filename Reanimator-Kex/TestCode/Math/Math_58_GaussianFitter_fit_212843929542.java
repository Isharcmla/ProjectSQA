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

public class GaussianFitter_fit_212843929542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17687;

    public GaussianFitter_fit_212843929542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17877 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term17877, term17877.getClass(), "y", 0.0);
        setDoubleField(term17877, term17877.getClass(), "weight", 0.0);
        ArrayList term17739 = new ArrayList();
        ((ArrayList) term17739).add(term17877);
        ((ArrayList) term17739).add(term17877);
        term17687 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term18065 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term17476 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        setField(term17687, term17687.getClass(), "observations", term17739);
        setIntField(term18065, term18065.getClass(), "maxEvaluations", 0);
        setIntField(term18065, term18065.getClass(), "starts", 2);
        setField(term18065, term18065.getClass(), "optima", term17476);
        setIntField(term18065, term18065.getClass(), "totalEvaluations", 0);
        setField(term17687, term17687.getClass(), "optimizer", term18065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term17687, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


