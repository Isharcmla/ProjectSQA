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

public class MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_984896252120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25042;
     Object term26035;

    public MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_984896252120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25042 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term25188 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term25318 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term25188, term25188.getClass(), "optimizer", term25318);
        setField(term25042, term25042.getClass(), "optimizer", term25188);
        term26035 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term26036 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term26037 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term26037, term26037.getClass(), "resultComputed", false);
        setDoubleField(term26037, term26037.getClass(), "result", 0.0);
        setDoubleField(term26037, term26037.getClass(), "functionValue", 0.0);
        setIntField(term26037, term26037.getClass(), "maxEvaluations", 0);
        setIntField(term26037, term26037.getClass(), "evaluations", 0);
        setDoubleField(term26037, term26037.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term26037, term26037.getClass(), "relativeAccuracy", 0.0);
        setIntField(term26037, term26037.getClass(), "maximalIterationCount", 0);
        setDoubleField(term26037, term26037.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term26037, term26037.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term26037, term26037.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term26037, term26037.getClass(), "iterationCount", 0);
        setField(term26036, term26036.getClass(), "optimizer", term26037);
        setIntField(term26036, term26036.getClass(), "maxIterations", 0);
        setIntField(term26036, term26036.getClass(), "maxEvaluations", 0);
        setIntField(term26036, term26036.getClass(), "totalIterations", 0);
        setIntField(term26036, term26036.getClass(), "totalEvaluations", 0);
        setIntField(term26036, term26036.getClass(), "starts", 0);
        setField(term26036, term26036.getClass(), "generator", null);
        setField(term26036, term26036.getClass(), "optima", null);
        setField(term26036, term26036.getClass(), "optimaValues", null);
        setField(term26035, term26035.getClass(), "optimizer", term26036);
        setIntField(term26035, term26035.getClass(), "maxIterations", 0);
        setIntField(term26035, term26035.getClass(), "maxEvaluations", 0);
        setIntField(term26035, term26035.getClass(), "totalIterations", 0);
        setIntField(term26035, term26035.getClass(), "totalEvaluations", 0);
        setIntField(term26035, term26035.getClass(), "starts", 0);
        setField(term26035, term26035.getClass(), "generator", null);
        setField(term26035, term26035.getClass(), "optima", null);
        setField(term26035, term26035.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetAbsoluteAccuracy", argTypes, term25042, args);
        assertTrue(recursiveEquals(term25042, term26035));
    }

};


