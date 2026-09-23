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

public class MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13027;
     Object term15354;

    public MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13027 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term13195 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term13341 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term13195, term13195.getClass(), "optimizer", term13341);
        setField(term13027, term13027.getClass(), "optimizer", term13195);
        term15354 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term15355 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term15356 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term15356, term15356.getClass(), "bracket", null);
        setField(term15356, term15356.getClass(), "this$0", null);
        setDoubleField(term15356, term15356.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term15356, term15356.getClass(), "absoluteThreshold", 0.0);
        setField(term15356, term15356.getClass(), "checker", null);
        setField(term15356, term15356.getClass(), "evaluations", null);
        setField(term15356, term15356.getClass(), "goal", null);
        setDoubleField(term15356, term15356.getClass(), "searchMin", 0.0);
        setDoubleField(term15356, term15356.getClass(), "searchMax", 0.0);
        setDoubleField(term15356, term15356.getClass(), "searchStart", 0.0);
        setField(term15356, term15356.getClass(), "function", null);
        setField(term15355, term15355.getClass(), "optimizer", term15356);
        setIntField(term15355, term15355.getClass(), "maxEvaluations", 0);
        setIntField(term15355, term15355.getClass(), "totalEvaluations", 0);
        setIntField(term15355, term15355.getClass(), "starts", 0);
        setField(term15355, term15355.getClass(), "generator", null);
        setField(term15355, term15355.getClass(), "optima", null);
        setField(term15354, term15354.getClass(), "optimizer", term15355);
        setIntField(term15354, term15354.getClass(), "maxEvaluations", 0);
        setIntField(term15354, term15354.getClass(), "totalEvaluations", 0);
        setIntField(term15354, term15354.getClass(), "starts", 0);
        setField(term15354, term15354.getClass(), "generator", null);
        setField(term15354, term15354.getClass(), "optima", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConvergenceChecker", argTypes, term13027, args);
        assertTrue(recursiveEquals(term13027, term15354));
        assertTrue(recursiveEquals(retValue, null));
    }

};


