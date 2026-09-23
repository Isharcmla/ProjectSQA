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

public class GaussianFitter_fit_212843929573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35452;
     Object term35188;

    public GaussianFitter_fit_212843929573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35504 = new ArrayList();
        term35452 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term35692 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term35246 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term35842 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term35252 = (double[]) newDoubleArray(0);
        setField(term35452, term35452.getClass(), "observations", term35504);
        setIntField(term35692, term35692.getClass(), "maxEvaluations", 0);
        setIntField(term35692, term35692.getClass(), "starts", 1);
        setField(term35692, term35692.getClass(), "optima", term35246);
        setIntField(term35692, term35692.getClass(), "totalEvaluations", 0);
        setIntField(term35842, term35842.getClass(), "jacobianEvaluations", 0);
        setField(term35842, term35842.getClass(), "jF", null);
        setField(term35842, term35842.getClass(), "residuals", term35252);
        setField(term35692, term35692.getClass(), "optimizer", term35842);
        setField(term35452, term35452.getClass(), "optimizer", term35692);
        term35188 = (double[]) newDoubleArray(41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term35188;
        callMethod(klass, "fit", argTypes, term35452, args);
    }

};


