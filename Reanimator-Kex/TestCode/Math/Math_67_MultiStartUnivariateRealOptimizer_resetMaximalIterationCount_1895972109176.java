package org.apache.commons.math.optimization;

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
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.EqualityUtils.*;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_1895972109176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39470;
     Object term47867;

    public MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_1895972109176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39470 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term39616 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term39762 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term39892 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term39762, term39762.getClass(), "optimizer", term39892);
        setField(term39616, term39616.getClass(), "optimizer", term39762);
        setField(term39470, term39470.getClass(), "optimizer", term39616);
        term47867 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term47868 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term47869 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term47870 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term47870, term47870.getClass(), "resultComputed", false);
        setDoubleField(term47870, term47870.getClass(), "result", 0.0);
        setDoubleField(term47870, term47870.getClass(), "functionValue", 0.0);
        setIntField(term47870, term47870.getClass(), "maxEvaluations", 0);
        setIntField(term47870, term47870.getClass(), "evaluations", 0);
        setDoubleField(term47870, term47870.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term47870, term47870.getClass(), "relativeAccuracy", 0.0);
        setIntField(term47870, term47870.getClass(), "maximalIterationCount", 0);
        setDoubleField(term47870, term47870.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term47870, term47870.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term47870, term47870.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term47870, term47870.getClass(), "iterationCount", 0);
        setField(term47869, term47869.getClass(), "optimizer", term47870);
        setIntField(term47869, term47869.getClass(), "maxIterations", 0);
        setIntField(term47869, term47869.getClass(), "maxEvaluations", 0);
        setIntField(term47869, term47869.getClass(), "totalIterations", 0);
        setIntField(term47869, term47869.getClass(), "totalEvaluations", 0);
        setIntField(term47869, term47869.getClass(), "starts", 0);
        setField(term47869, term47869.getClass(), "generator", null);
        setField(term47869, term47869.getClass(), "optima", null);
        setField(term47869, term47869.getClass(), "optimaValues", null);
        setField(term47868, term47868.getClass(), "optimizer", term47869);
        setIntField(term47868, term47868.getClass(), "maxIterations", 0);
        setIntField(term47868, term47868.getClass(), "maxEvaluations", 0);
        setIntField(term47868, term47868.getClass(), "totalIterations", 0);
        setIntField(term47868, term47868.getClass(), "totalEvaluations", 0);
        setIntField(term47868, term47868.getClass(), "starts", 0);
        setField(term47868, term47868.getClass(), "generator", null);
        setField(term47868, term47868.getClass(), "optima", null);
        setField(term47868, term47868.getClass(), "optimaValues", null);
        setField(term47867, term47867.getClass(), "optimizer", term47868);
        setIntField(term47867, term47867.getClass(), "maxIterations", 0);
        setIntField(term47867, term47867.getClass(), "maxEvaluations", 0);
        setIntField(term47867, term47867.getClass(), "totalIterations", 0);
        setIntField(term47867, term47867.getClass(), "totalEvaluations", 0);
        setIntField(term47867, term47867.getClass(), "starts", 0);
        setField(term47867, term47867.getClass(), "generator", null);
        setField(term47867, term47867.getClass(), "optima", null);
        setField(term47867, term47867.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetMaximalIterationCount", argTypes, term39470, args);
        assertTrue(recursiveEquals(term39470, term47867));
    }

};


