package org.apache.commons.math3.optimization.univariate;

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
import static org.apache.commons.math3.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.univariate.EqualityUtils.*;

public class BrentOptimizer_best_31927674228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14130;
     Object term14282;
     Object term14434;
     Object term14919;
     Object term14920;
     Object term14921;
     Object term14907;

    public BrentOptimizer_best_31927674228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14130 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term14282 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term14282, term14282.getClass(), "value", -1.6316679188829368E16);
        term14434 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term14434, term14434.getClass(), "value", 9.2084560752071526E18);
        term14919 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term14919, term14919.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term14919, term14919.getClass(), "absoluteThreshold", 0.0);
        setField(term14919, term14919.getClass(), "checker", null);
        setField(term14919, term14919.getClass(), "evaluations", null);
        setField(term14919, term14919.getClass(), "goal", null);
        setDoubleField(term14919, term14919.getClass(), "searchMin", 0.0);
        setDoubleField(term14919, term14919.getClass(), "searchMax", 0.0);
        setDoubleField(term14919, term14919.getClass(), "searchStart", 0.0);
        setField(term14919, term14919.getClass(), "function", null);
        term14920 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term14920, term14920.getClass(), "point", 0.0);
        setDoubleField(term14920, term14920.getClass(), "value", -1.6316679188829368E16);
        term14921 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term14921, term14921.getClass(), "point", 0.0);
        setDoubleField(term14921, term14921.getClass(), "value", 9.2084560752071526E18);
        term14907 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term14907, term14907.getClass(), "point", 0.0);
        setDoubleField(term14907, term14907.getClass(), "value", 9.2084560752071526E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term14282;
        args[1] = term14434;
        args[2] = false;
        Object retValue = callMethod(klass, "best", argTypes, term14130, args);
        assertTrue(recursiveEquals(term14130, term14919));
        assertTrue(recursiveEquals(term14282, term14920));
        assertTrue(recursiveEquals(term14434, term14921));
        assertTrue(recursiveEquals(retValue, term14907));
    }

};


