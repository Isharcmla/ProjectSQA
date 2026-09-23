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

public class GaussianFitter_fit_212843929580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38656;

    public GaussianFitter_fit_212843929580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38708 = new ArrayList();
        term38656 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term38896 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term38446 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term39084 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term38452 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term39220 = newInstance(Class.forName("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        setField(term38656, term38656.getClass(), "observations", term38708);
        setIntField(term38896, term38896.getClass(), "maxEvaluations", 0);
        setIntField(term38896, term38896.getClass(), "starts", 233);
        setField(term38896, term38896.getClass(), "optima", term38446);
        setIntField(term38896, term38896.getClass(), "totalEvaluations", 0);
        setIntField(term39084, term39084.getClass(), "maxEvaluations", 0);
        setIntField(term39084, term39084.getClass(), "starts", 1);
        setField(term39084, term39084.getClass(), "optima", term38452);
        setIntField(term39084, term39084.getClass(), "totalEvaluations", 0);
        setField(term39084, term39084.getClass(), "optimizer", term39220);
        setField(term38896, term38896.getClass(), "optimizer", term39084);
        setField(term38656, term38656.getClass(), "optimizer", term38896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term38656, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


