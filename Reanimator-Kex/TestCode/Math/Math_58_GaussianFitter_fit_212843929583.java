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
import static org.apache.commons.math.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GaussianFitter_fit_212843929583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40936;

    public GaussianFitter_fit_212843929583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term40988 = new ArrayList();
        term40936 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term41176 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term41364 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        setField(term40936, term40936.getClass(), "observations", term40988);
        setIntField(term41176, term41176.getClass(), "maxEvaluations", 0);
        setIntField(term41176, term41176.getClass(), "starts", 128);
        setField(term41176, term41176.getClass(), "optima", null);
        setIntField(term41176, term41176.getClass(), "totalEvaluations", 0);
        setIntField(term41364, term41364.getClass(), "maxEvaluations", 0);
        setIntField(term41364, term41364.getClass(), "starts", 128);
        setField(term41364, term41364.getClass(), "optima", null);
        setIntField(term41364, term41364.getClass(), "totalEvaluations", 0);
        setField(term41364, term41364.getClass(), "optimizer", term41364);
        setField(term41176, term41176.getClass(), "optimizer", term41364);
        setField(term40936, term40936.getClass(), "optimizer", term41176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fit", argTypes, term40936, args);
    }

};


