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

public class MultiStartUnivariateRealOptimizer_getOptima_142902031229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5454;
     Object term5710;
     Object term5704;

    public MultiStartUnivariateRealOptimizer_getOptima_142902031229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5454 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term5272 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 41);
        setField(term5454, term5454.getClass(), "optima", term5272);
        term5710 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term5711 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 41);
        setField(term5710, term5710.getClass(), "optimizer", null);
        setIntField(term5710, term5710.getClass(), "maxEvaluations", 0);
        setIntField(term5710, term5710.getClass(), "totalEvaluations", 0);
        setIntField(term5710, term5710.getClass(), "starts", 0);
        setField(term5710, term5710.getClass(), "generator", null);
        setField(term5710, term5710.getClass(), "optima", term5711);
        term5704 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptima", argTypes, term5454, args);
        assertTrue(recursiveEquals(term5454, term5710));
        assertTrue(recursiveEquals(retValue, term5704));
    }

};


