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

public class MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_361912849184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43749;
     Object term49891;

    public MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_361912849184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43749 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term43895 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term44041 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term44171 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term44041, term44041.getClass(), "optimizer", term44171);
        setField(term43895, term43895.getClass(), "optimizer", term44041);
        setField(term43749, term43749.getClass(), "optimizer", term43895);
        term49891 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49892 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49893 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49894 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term49894, term49894.getClass(), "resultComputed", false);
        setDoubleField(term49894, term49894.getClass(), "result", 0.0);
        setDoubleField(term49894, term49894.getClass(), "functionValue", 0.0);
        setIntField(term49894, term49894.getClass(), "maxEvaluations", 0);
        setIntField(term49894, term49894.getClass(), "evaluations", 0);
        setDoubleField(term49894, term49894.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term49894, term49894.getClass(), "relativeAccuracy", 0.0);
        setIntField(term49894, term49894.getClass(), "maximalIterationCount", 0);
        setDoubleField(term49894, term49894.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term49894, term49894.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term49894, term49894.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term49894, term49894.getClass(), "iterationCount", 0);
        setField(term49893, term49893.getClass(), "optimizer", term49894);
        setIntField(term49893, term49893.getClass(), "maxIterations", 0);
        setIntField(term49893, term49893.getClass(), "maxEvaluations", 0);
        setIntField(term49893, term49893.getClass(), "totalIterations", 0);
        setIntField(term49893, term49893.getClass(), "totalEvaluations", 0);
        setIntField(term49893, term49893.getClass(), "starts", 0);
        setField(term49893, term49893.getClass(), "generator", null);
        setField(term49893, term49893.getClass(), "optima", null);
        setField(term49893, term49893.getClass(), "optimaValues", null);
        setField(term49892, term49892.getClass(), "optimizer", term49893);
        setIntField(term49892, term49892.getClass(), "maxIterations", 0);
        setIntField(term49892, term49892.getClass(), "maxEvaluations", 0);
        setIntField(term49892, term49892.getClass(), "totalIterations", 0);
        setIntField(term49892, term49892.getClass(), "totalEvaluations", 0);
        setIntField(term49892, term49892.getClass(), "starts", 0);
        setField(term49892, term49892.getClass(), "generator", null);
        setField(term49892, term49892.getClass(), "optima", null);
        setField(term49892, term49892.getClass(), "optimaValues", null);
        setField(term49891, term49891.getClass(), "optimizer", term49892);
        setIntField(term49891, term49891.getClass(), "maxIterations", 0);
        setIntField(term49891, term49891.getClass(), "maxEvaluations", 0);
        setIntField(term49891, term49891.getClass(), "totalIterations", 0);
        setIntField(term49891, term49891.getClass(), "totalEvaluations", 0);
        setIntField(term49891, term49891.getClass(), "starts", 0);
        setField(term49891, term49891.getClass(), "generator", null);
        setField(term49891, term49891.getClass(), "optima", null);
        setField(term49891, term49891.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetRelativeAccuracy", argTypes, term43749, args);
        assertTrue(recursiveEquals(term43749, term49891));
    }

};


