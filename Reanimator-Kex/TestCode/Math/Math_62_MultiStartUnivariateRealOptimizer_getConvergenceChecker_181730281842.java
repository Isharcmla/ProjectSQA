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

public class MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7841;
     Object term10015;

    public MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7841 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term7987 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term7841, term7841.getClass(), "optimizer", term7987);
        term10015 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term10016 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term10016, term10016.getClass(), "bracket", null);
        setField(term10016, term10016.getClass(), "this$0", null);
        setDoubleField(term10016, term10016.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term10016, term10016.getClass(), "absoluteThreshold", 0.0);
        setField(term10016, term10016.getClass(), "checker", null);
        setField(term10016, term10016.getClass(), "evaluations", null);
        setField(term10016, term10016.getClass(), "goal", null);
        setDoubleField(term10016, term10016.getClass(), "searchMin", 0.0);
        setDoubleField(term10016, term10016.getClass(), "searchMax", 0.0);
        setDoubleField(term10016, term10016.getClass(), "searchStart", 0.0);
        setField(term10016, term10016.getClass(), "function", null);
        setField(term10015, term10015.getClass(), "optimizer", term10016);
        setIntField(term10015, term10015.getClass(), "maxEvaluations", 0);
        setIntField(term10015, term10015.getClass(), "totalEvaluations", 0);
        setIntField(term10015, term10015.getClass(), "starts", 0);
        setField(term10015, term10015.getClass(), "generator", null);
        setField(term10015, term10015.getClass(), "optima", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConvergenceChecker", argTypes, term7841, args);
        assertTrue(recursiveEquals(term7841, term10015));
        assertTrue(recursiveEquals(retValue, null));
    }

};


