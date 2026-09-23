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

public class GaussianFitter_fit_212843929576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36545;

    public GaussianFitter_fit_212843929576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36597 = new ArrayList();
        term36545 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term36785 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term36973 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term36349 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        setField(term36545, term36545.getClass(), "observations", term36597);
        setIntField(term36785, term36785.getClass(), "maxEvaluations", 0);
        setIntField(term36785, term36785.getClass(), "starts", 16);
        setField(term36785, term36785.getClass(), "optima", null);
        setIntField(term36785, term36785.getClass(), "totalEvaluations", 0);
        setIntField(term36973, term36973.getClass(), "maxEvaluations", 0);
        setIntField(term36973, term36973.getClass(), "starts", 2);
        setField(term36973, term36973.getClass(), "optima", term36349);
        setIntField(term36973, term36973.getClass(), "totalEvaluations", 0);
        setField(term36785, term36785.getClass(), "optimizer", term36973);
        setField(term36545, term36545.getClass(), "optimizer", term36785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term36545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


