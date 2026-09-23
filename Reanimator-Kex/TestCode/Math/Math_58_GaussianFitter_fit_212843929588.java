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

public class GaussianFitter_fit_212843929588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44904;

    public GaussianFitter_fit_212843929588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44956 = new ArrayList();
        term44904 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term45144 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term44473 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term45332 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term45520 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term45708 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term45896 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term46084 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term46272 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term46460 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term46648 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term46836 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term47024 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term47212 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term47400 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term47588 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term47776 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term44544 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term47912 = newInstance(Class.forName("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        setField(term44904, term44904.getClass(), "observations", term44956);
        setIntField(term45144, term45144.getClass(), "maxEvaluations", 0);
        setIntField(term45144, term45144.getClass(), "starts", 256);
        setField(term45144, term45144.getClass(), "optima", term44473);
        setIntField(term45144, term45144.getClass(), "totalEvaluations", 0);
        setIntField(term45332, term45332.getClass(), "maxEvaluations", 0);
        setIntField(term45332, term45332.getClass(), "starts", 1);
        setField(term45332, term45332.getClass(), "optima", null);
        setIntField(term45332, term45332.getClass(), "totalEvaluations", 0);
        setIntField(term45520, term45520.getClass(), "maxEvaluations", 0);
        setIntField(term45520, term45520.getClass(), "starts", 8);
        setField(term45520, term45520.getClass(), "optima", null);
        setIntField(term45520, term45520.getClass(), "totalEvaluations", 0);
        setIntField(term45708, term45708.getClass(), "maxEvaluations", 0);
        setIntField(term45708, term45708.getClass(), "starts", 16);
        setField(term45708, term45708.getClass(), "optima", null);
        setIntField(term45708, term45708.getClass(), "totalEvaluations", 0);
        setIntField(term45896, term45896.getClass(), "maxEvaluations", 0);
        setIntField(term45896, term45896.getClass(), "starts", 512);
        setField(term45896, term45896.getClass(), "optima", null);
        setIntField(term45896, term45896.getClass(), "totalEvaluations", 0);
        setIntField(term46084, term46084.getClass(), "maxEvaluations", 0);
        setIntField(term46084, term46084.getClass(), "starts", 512);
        setField(term46084, term46084.getClass(), "optima", null);
        setIntField(term46084, term46084.getClass(), "totalEvaluations", 0);
        setIntField(term46272, term46272.getClass(), "maxEvaluations", 0);
        setIntField(term46272, term46272.getClass(), "starts", 10);
        setField(term46272, term46272.getClass(), "optima", null);
        setIntField(term46272, term46272.getClass(), "totalEvaluations", 0);
        setIntField(term46460, term46460.getClass(), "maxEvaluations", 0);
        setIntField(term46460, term46460.getClass(), "starts", 64);
        setField(term46460, term46460.getClass(), "optima", null);
        setIntField(term46460, term46460.getClass(), "totalEvaluations", 0);
        setIntField(term46648, term46648.getClass(), "maxEvaluations", 0);
        setIntField(term46648, term46648.getClass(), "starts", 1);
        setField(term46648, term46648.getClass(), "optima", null);
        setIntField(term46648, term46648.getClass(), "totalEvaluations", 0);
        setIntField(term46836, term46836.getClass(), "maxEvaluations", 0);
        setIntField(term46836, term46836.getClass(), "starts", 16);
        setField(term46836, term46836.getClass(), "optima", null);
        setIntField(term46836, term46836.getClass(), "totalEvaluations", 0);
        setIntField(term47024, term47024.getClass(), "maxEvaluations", 0);
        setIntField(term47024, term47024.getClass(), "starts", 4);
        setField(term47024, term47024.getClass(), "optima", null);
        setIntField(term47024, term47024.getClass(), "totalEvaluations", 0);
        setIntField(term47212, term47212.getClass(), "maxEvaluations", 0);
        setIntField(term47212, term47212.getClass(), "starts", 10);
        setField(term47212, term47212.getClass(), "optima", null);
        setIntField(term47212, term47212.getClass(), "totalEvaluations", 0);
        setIntField(term47400, term47400.getClass(), "maxEvaluations", 0);
        setIntField(term47400, term47400.getClass(), "starts", 1);
        setField(term47400, term47400.getClass(), "optima", null);
        setIntField(term47400, term47400.getClass(), "totalEvaluations", 0);
        setIntField(term47588, term47588.getClass(), "maxEvaluations", 0);
        setIntField(term47588, term47588.getClass(), "starts", 490);
        setField(term47588, term47588.getClass(), "optima", null);
        setIntField(term47588, term47588.getClass(), "totalEvaluations", 0);
        setIntField(term47776, term47776.getClass(), "maxEvaluations", 0);
        setIntField(term47776, term47776.getClass(), "starts", 1);
        setField(term47776, term47776.getClass(), "optima", term44544);
        setIntField(term47776, term47776.getClass(), "totalEvaluations", 0);
        setField(term47776, term47776.getClass(), "optimizer", term47912);
        setField(term47588, term47588.getClass(), "optimizer", term47776);
        setField(term47400, term47400.getClass(), "optimizer", term47588);
        setField(term47212, term47212.getClass(), "optimizer", term47400);
        setField(term47024, term47024.getClass(), "optimizer", term47212);
        setField(term46836, term46836.getClass(), "optimizer", term47024);
        setField(term46648, term46648.getClass(), "optimizer", term46836);
        setField(term46460, term46460.getClass(), "optimizer", term46648);
        setField(term46272, term46272.getClass(), "optimizer", term46460);
        setField(term46084, term46084.getClass(), "optimizer", term46272);
        setField(term45896, term45896.getClass(), "optimizer", term46084);
        setField(term45708, term45708.getClass(), "optimizer", term45896);
        setField(term45520, term45520.getClass(), "optimizer", term45708);
        setField(term45332, term45332.getClass(), "optimizer", term45520);
        setField(term45144, term45144.getClass(), "optimizer", term45332);
        setField(term44904, term44904.getClass(), "optimizer", term45144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term44904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


