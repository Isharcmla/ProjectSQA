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

public class MultiStartUnivariateRealOptimizer_setConvergenceChecker_153520994447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9852;
     Object term10797;

    public MultiStartUnivariateRealOptimizer_setConvergenceChecker_153520994447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9852 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term9998 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term9852, term9852.getClass(), "optimizer", term9998);
        term10797 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term10798 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term10798, term10798.getClass(), "bracket", null);
        setField(term10798, term10798.getClass(), "this$0", null);
        setDoubleField(term10798, term10798.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term10798, term10798.getClass(), "absoluteThreshold", 0.0);
        setField(term10798, term10798.getClass(), "checker", null);
        setField(term10798, term10798.getClass(), "evaluations", null);
        setField(term10798, term10798.getClass(), "goal", null);
        setDoubleField(term10798, term10798.getClass(), "searchMin", 0.0);
        setDoubleField(term10798, term10798.getClass(), "searchMax", 0.0);
        setDoubleField(term10798, term10798.getClass(), "searchStart", 0.0);
        setField(term10798, term10798.getClass(), "function", null);
        setField(term10797, term10797.getClass(), "optimizer", term10798);
        setIntField(term10797, term10797.getClass(), "maxEvaluations", 0);
        setIntField(term10797, term10797.getClass(), "totalEvaluations", 0);
        setIntField(term10797, term10797.getClass(), "starts", 0);
        setField(term10797, term10797.getClass(), "generator", null);
        setField(term10797, term10797.getClass(), "optima", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.ConvergenceChecker");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setConvergenceChecker", argTypes, term9852, args);
        assertTrue(recursiveEquals(term9852, term10797));
    }

};


