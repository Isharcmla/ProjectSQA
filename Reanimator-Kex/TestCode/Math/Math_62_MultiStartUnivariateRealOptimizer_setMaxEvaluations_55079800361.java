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

public class MultiStartUnivariateRealOptimizer_setMaxEvaluations_55079800361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14213;
     Object term15631;

    public MultiStartUnivariateRealOptimizer_setMaxEvaluations_55079800361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14213 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term14359 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        Object term14445 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setIntField(term14213, term14213.getClass(), "maxEvaluations", 0);
        setField(term14359, term14359.getClass(), "evaluations", term14445);
        setField(term14213, term14213.getClass(), "optimizer", term14359);
        term15631 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term15632 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        Object term15633 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term15632, term15632.getClass(), "bracket", null);
        setField(term15632, term15632.getClass(), "this$0", null);
        setDoubleField(term15632, term15632.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term15632, term15632.getClass(), "absoluteThreshold", 0.0);
        setField(term15632, term15632.getClass(), "checker", null);
        setIntField(term15633, term15633.getClass(), "maximalCount", 0);
        setIntField(term15633, term15633.getClass(), "count", 0);
        setField(term15632, term15632.getClass(), "evaluations", term15633);
        setField(term15632, term15632.getClass(), "goal", null);
        setDoubleField(term15632, term15632.getClass(), "searchMin", 0.0);
        setDoubleField(term15632, term15632.getClass(), "searchMax", 0.0);
        setDoubleField(term15632, term15632.getClass(), "searchStart", 0.0);
        setField(term15632, term15632.getClass(), "function", null);
        setField(term15631, term15631.getClass(), "optimizer", term15632);
        setIntField(term15631, term15631.getClass(), "maxEvaluations", 0);
        setIntField(term15631, term15631.getClass(), "totalEvaluations", 0);
        setIntField(term15631, term15631.getClass(), "starts", 0);
        setField(term15631, term15631.getClass(), "generator", null);
        setField(term15631, term15631.getClass(), "optima", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setMaxEvaluations", argTypes, term14213, args);
        assertTrue(recursiveEquals(term14213, term15631));
    }

};


