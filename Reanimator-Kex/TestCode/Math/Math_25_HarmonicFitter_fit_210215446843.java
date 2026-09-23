package org.apache.commons.math3.optimization.fitting;

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
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_210215446843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40214;

    public HarmonicFitter_fit_210215446843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40406 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term40406, term40406.getClass(), "y", 0.0);
        setDoubleField(term40406, term40406.getClass(), "weight", 0.0);
        ArrayList term40266 = new ArrayList();
        ((ArrayList) term40266).add(term40406);
        term40214 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        Object term40590 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        Object term40774 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        Object term40906 = newInstance(Class.forName("org.apache.commons.math3.random.UnitSphereRandomVectorGenerator"));
        setField(term40214, term40214.getClass(), "observations", term40266);
        setIntField(term40590, term40590.getClass(), "maxEvaluations", 0);
        setIntField(term40590, term40590.getClass(), "starts", 256);
        setField(term40590, term40590.getClass(), "optima", null);
        setIntField(term40590, term40590.getClass(), "totalEvaluations", 0);
        setIntField(term40774, term40774.getClass(), "maxEvaluations", 0);
        setIntField(term40774, term40774.getClass(), "starts", 0);
        setField(term40774, term40774.getClass(), "optima", null);
        setIntField(term40774, term40774.getClass(), "totalEvaluations", 0);
        setField(term40590, term40590.getClass(), "optimizer", term40774);
        setField(term40590, term40590.getClass(), "generator", term40906);
        setField(term40214, term40214.getClass(), "optimizer", term40590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term40214, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


