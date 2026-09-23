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

public class GaussianFitter_fit_212843929526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10168;

    public GaussianFitter_fit_212843929526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10220 = new ArrayList();
        term10168 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term10408 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        Object[] term9985 = (Object[]) newArray("org.apache.commons.math.optimization.VectorialPointValuePair", 0);
        setField(term10168, term10168.getClass(), "observations", term10220);
        setIntField(term10408, term10408.getClass(), "maxEvaluations", 0);
        setIntField(term10408, term10408.getClass(), "starts", 4);
        setField(term10408, term10408.getClass(), "optima", term9985);
        setIntField(term10408, term10408.getClass(), "totalEvaluations", 0);
        setField(term10168, term10168.getClass(), "optimizer", term10408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term10168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


