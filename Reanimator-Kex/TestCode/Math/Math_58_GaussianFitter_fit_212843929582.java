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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GaussianFitter_fit_212843929582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39746;

    public GaussianFitter_fit_212843929582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39798 = new ArrayList();
        term39746 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term39986 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term40174 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object term40362 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        setField(term39746, term39746.getClass(), "observations", term39798);
        setIntField(term39986, term39986.getClass(), "maxEvaluations", 0);
        setIntField(term39986, term39986.getClass(), "starts", 233);
        setField(term39986, term39986.getClass(), "optima", null);
        setIntField(term39986, term39986.getClass(), "totalEvaluations", 0);
        setIntField(term40174, term40174.getClass(), "maxEvaluations", 0);
        setIntField(term40174, term40174.getClass(), "starts", 2);
        setField(term40174, term40174.getClass(), "optima", null);
        setIntField(term40174, term40174.getClass(), "totalEvaluations", 0);
        setField(term40174, term40174.getClass(), "optimizer", term40362);
        setField(term39986, term39986.getClass(), "optimizer", term40174);
        setField(term39746, term39746.getClass(), "optimizer", term39986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term39746, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


