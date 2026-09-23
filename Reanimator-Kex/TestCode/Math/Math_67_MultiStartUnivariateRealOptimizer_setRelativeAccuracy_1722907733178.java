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

public class MultiStartUnivariateRealOptimizer_setRelativeAccuracy_1722907733178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40508;
     Object term48332;

    public MultiStartUnivariateRealOptimizer_setRelativeAccuracy_1722907733178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40508 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term40654 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term40800 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term40930 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term40800, term40800.getClass(), "optimizer", term40930);
        setField(term40654, term40654.getClass(), "optimizer", term40800);
        setField(term40508, term40508.getClass(), "optimizer", term40654);
        term48332 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term48333 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term48334 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term48335 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term48335, term48335.getClass(), "resultComputed", false);
        setDoubleField(term48335, term48335.getClass(), "result", 0.0);
        setDoubleField(term48335, term48335.getClass(), "functionValue", 0.0);
        setIntField(term48335, term48335.getClass(), "maxEvaluations", 0);
        setIntField(term48335, term48335.getClass(), "evaluations", 0);
        setDoubleField(term48335, term48335.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term48335, term48335.getClass(), "relativeAccuracy", 0.0);
        setIntField(term48335, term48335.getClass(), "maximalIterationCount", 0);
        setDoubleField(term48335, term48335.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term48335, term48335.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term48335, term48335.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term48335, term48335.getClass(), "iterationCount", 0);
        setField(term48334, term48334.getClass(), "optimizer", term48335);
        setIntField(term48334, term48334.getClass(), "maxIterations", 0);
        setIntField(term48334, term48334.getClass(), "maxEvaluations", 0);
        setIntField(term48334, term48334.getClass(), "totalIterations", 0);
        setIntField(term48334, term48334.getClass(), "totalEvaluations", 0);
        setIntField(term48334, term48334.getClass(), "starts", 0);
        setField(term48334, term48334.getClass(), "generator", null);
        setField(term48334, term48334.getClass(), "optima", null);
        setField(term48334, term48334.getClass(), "optimaValues", null);
        setField(term48333, term48333.getClass(), "optimizer", term48334);
        setIntField(term48333, term48333.getClass(), "maxIterations", 0);
        setIntField(term48333, term48333.getClass(), "maxEvaluations", 0);
        setIntField(term48333, term48333.getClass(), "totalIterations", 0);
        setIntField(term48333, term48333.getClass(), "totalEvaluations", 0);
        setIntField(term48333, term48333.getClass(), "starts", 0);
        setField(term48333, term48333.getClass(), "generator", null);
        setField(term48333, term48333.getClass(), "optima", null);
        setField(term48333, term48333.getClass(), "optimaValues", null);
        setField(term48332, term48332.getClass(), "optimizer", term48333);
        setIntField(term48332, term48332.getClass(), "maxIterations", 0);
        setIntField(term48332, term48332.getClass(), "maxEvaluations", 0);
        setIntField(term48332, term48332.getClass(), "totalIterations", 0);
        setIntField(term48332, term48332.getClass(), "totalEvaluations", 0);
        setIntField(term48332, term48332.getClass(), "starts", 0);
        setField(term48332, term48332.getClass(), "generator", null);
        setField(term48332, term48332.getClass(), "optima", null);
        setField(term48332, term48332.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "setRelativeAccuracy", argTypes, term40508, args);
        assertTrue(recursiveEquals(term40508, term48332));
    }

};


