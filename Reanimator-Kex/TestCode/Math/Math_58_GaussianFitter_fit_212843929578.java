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

public class GaussianFitter_fit_212843929578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37491;

    public GaussianFitter_fit_212843929578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37543 = new ArrayList();
        term37491 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term37731 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term37285 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term37919 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term37291 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term38087 = newInstance(Class.forName("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        setField(term37491, term37491.getClass(), "observations", term37543);
        setIntField(term37731, term37731.getClass(), "maxEvaluations", 0);
        setIntField(term37731, term37731.getClass(), "starts", 2);
        setField(term37731, term37731.getClass(), "optima", term37285);
        setIntField(term37731, term37731.getClass(), "totalEvaluations", 0);
        setIntField(term37919, term37919.getClass(), "maxEvaluations", 0);
        setIntField(term37919, term37919.getClass(), "starts", 1);
        setField(term37919, term37919.getClass(), "optima", term37291);
        setIntField(term37919, term37919.getClass(), "totalEvaluations", 0);
        setField(term37919, term37919.getClass(), "optimizer", term38087);
        setField(term37731, term37731.getClass(), "optimizer", term37919);
        setField(term37491, term37491.getClass(), "optimizer", term37731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term37491, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


