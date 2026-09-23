package org.apache.commons.math.optimization.univariate;

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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.univariate.EqualityUtils.*;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10978;
     Object term12532;

    public MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10978 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term11146 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term11292 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term11146, term11146.getClass(), "optimizer", term11292);
        setField(term10978, term10978.getClass(), "optimizer", term11146);
        term12532 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term12533 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term12534 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term12534, term12534.getClass(), "bracket", null);
        setField(term12534, term12534.getClass(), "this$0", null);
        setDoubleField(term12534, term12534.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term12534, term12534.getClass(), "absoluteThreshold", 0.0);
        setField(term12534, term12534.getClass(), "checker", null);
        setField(term12534, term12534.getClass(), "evaluations", null);
        setField(term12534, term12534.getClass(), "goal", null);
        setDoubleField(term12534, term12534.getClass(), "searchMin", 0.0);
        setDoubleField(term12534, term12534.getClass(), "searchMax", 0.0);
        setDoubleField(term12534, term12534.getClass(), "searchStart", 0.0);
        setField(term12534, term12534.getClass(), "function", null);
        setField(term12533, term12533.getClass(), "optimizer", term12534);
        setIntField(term12533, term12533.getClass(), "maxEvaluations", 0);
        setIntField(term12533, term12533.getClass(), "totalEvaluations", 0);
        setIntField(term12533, term12533.getClass(), "starts", 0);
        setField(term12533, term12533.getClass(), "generator", null);
        setField(term12533, term12533.getClass(), "optima", null);
        setField(term12532, term12532.getClass(), "optimizer", term12533);
        setIntField(term12532, term12532.getClass(), "maxEvaluations", 0);
        setIntField(term12532, term12532.getClass(), "totalEvaluations", 0);
        setIntField(term12532, term12532.getClass(), "starts", 0);
        setField(term12532, term12532.getClass(), "generator", null);
        setField(term12532, term12532.getClass(), "optima", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConvergenceChecker", argTypes, term10978, args);
        assertTrue(recursiveEquals(term10978, term12532));
        assertTrue(recursiveEquals(retValue, null));
    }

};


