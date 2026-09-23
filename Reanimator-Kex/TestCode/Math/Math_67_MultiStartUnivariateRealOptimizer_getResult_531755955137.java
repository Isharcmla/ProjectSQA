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

public class MultiStartUnivariateRealOptimizer_getResult_531755955137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30474;
     Object term31673;

    public MultiStartUnivariateRealOptimizer_getResult_531755955137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30474 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term30604 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term30604, term30604.getClass(), "resultComputed", true);
        setField(term30474, term30474.getClass(), "optimizer", term30604);
        term31673 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term31674 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term31674, term31674.getClass(), "resultComputed", true);
        setDoubleField(term31674, term31674.getClass(), "result", 0.0);
        setDoubleField(term31674, term31674.getClass(), "functionValue", 0.0);
        setIntField(term31674, term31674.getClass(), "maxEvaluations", 0);
        setIntField(term31674, term31674.getClass(), "evaluations", 0);
        setDoubleField(term31674, term31674.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term31674, term31674.getClass(), "relativeAccuracy", 0.0);
        setIntField(term31674, term31674.getClass(), "maximalIterationCount", 0);
        setDoubleField(term31674, term31674.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term31674, term31674.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term31674, term31674.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term31674, term31674.getClass(), "iterationCount", 0);
        setField(term31673, term31673.getClass(), "optimizer", term31674);
        setIntField(term31673, term31673.getClass(), "maxIterations", 0);
        setIntField(term31673, term31673.getClass(), "maxEvaluations", 0);
        setIntField(term31673, term31673.getClass(), "totalIterations", 0);
        setIntField(term31673, term31673.getClass(), "totalEvaluations", 0);
        setIntField(term31673, term31673.getClass(), "starts", 0);
        setField(term31673, term31673.getClass(), "generator", null);
        setField(term31673, term31673.getClass(), "optima", null);
        setField(term31673, term31673.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getResult", argTypes, term30474, args);
        assertTrue(recursiveEquals(term30474, term31673));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


