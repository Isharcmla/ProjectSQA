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

public class GaussianFitter_fit_212843929544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19442;
     Object term19220;

    public GaussianFitter_fit_212843929544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19494 = new ArrayList();
        term19442 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term19682 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term19237 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term19832 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        Object term20006 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        setField(term19442, term19442.getClass(), "observations", term19494);
        setIntField(term19682, term19682.getClass(), "maxEvaluations", 0);
        setIntField(term19682, term19682.getClass(), "starts", 1);
        setField(term19682, term19682.getClass(), "optima", term19237);
        setIntField(term19682, term19682.getClass(), "totalEvaluations", 0);
        setIntField(term19832, term19832.getClass(), "jacobianEvaluations", 0);
        setField(term19832, term19832.getClass(), "jF", term20006);
        setField(term19832, term19832.getClass(), "residuals", null);
        setField(term19682, term19682.getClass(), "optimizer", term19832);
        setField(term19442, term19442.getClass(), "optimizer", term19682);
        term19220 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term19220;
        callMethod(klass, "fit", argTypes, term19442, args);
    }

};


