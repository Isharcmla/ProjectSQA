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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term27 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 4);
        Object term28 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term31 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term34 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term37 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term23, term23.getClass(), "optimizer", null);
        setIntField(term23, term23.getClass(), "maxEvaluations", -1922583790);
        setIntField(term23, term23.getClass(), "totalEvaluations", -616727354);
        setIntField(term23, term23.getClass(), "starts", -1955890973);
        setField(term23, term23.getClass(), "generator", null);
        setDoubleField(term28, term28.getClass(), "point", 0.8474802076607362);
        setDoubleField(term28, term28.getClass(), "value", 0.5183269973490326);
        setElement(term27, 0, term28);
        setDoubleField(term31, term31.getClass(), "point", 0.7655020693602768);
        setDoubleField(term31, term31.getClass(), "value", 0.1374549299694151);
        setElement(term27, 1, term31);
        setDoubleField(term34, term34.getClass(), "point", 0.7031006357544823);
        setDoubleField(term34, term34.getClass(), "value", 0.9527281779865117);
        setElement(term27, 2, term34);
        setDoubleField(term37, term37.getClass(), "point", 0.9828442029246764);
        setDoubleField(term37, term37.getClass(), "value", 0.2779719046761513);
        setElement(term27, 3, term37);
        setField(term23, term23.getClass(), "optima", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getConvergenceChecker", argTypes, term23, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


