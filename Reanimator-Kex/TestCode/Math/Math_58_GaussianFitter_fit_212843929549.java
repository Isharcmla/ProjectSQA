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

public class GaussianFitter_fit_212843929549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20956;

    public GaussianFitter_fit_212843929549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21008 = new ArrayList();
        term20956 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term21196 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term20765 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        Object term21332 = newInstance(Class.forName("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        setField(term20956, term20956.getClass(), "observations", term21008);
        setIntField(term21196, term21196.getClass(), "maxEvaluations", 0);
        setIntField(term21196, term21196.getClass(), "starts", 1);
        setField(term21196, term21196.getClass(), "optima", term20765);
        setIntField(term21196, term21196.getClass(), "totalEvaluations", 0);
        setField(term21196, term21196.getClass(), "optimizer", term21332);
        setField(term20956, term20956.getClass(), "optimizer", term21196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term20956, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


