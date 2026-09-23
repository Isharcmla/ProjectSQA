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

public class BrentOptimizer_best_31927674221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11213;
     Object term11365;
     Object term11398;
     Object term11399;
     Object term11388;

    public BrentOptimizer_best_31927674221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11213 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term11365 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        term11398 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term11398, term11398.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term11398, term11398.getClass(), "absoluteThreshold", 0.0);
        setField(term11398, term11398.getClass(), "checker", null);
        setField(term11398, term11398.getClass(), "evaluations", null);
        setField(term11398, term11398.getClass(), "goal", null);
        setDoubleField(term11398, term11398.getClass(), "searchMin", 0.0);
        setDoubleField(term11398, term11398.getClass(), "searchMax", 0.0);
        setDoubleField(term11398, term11398.getClass(), "searchStart", 0.0);
        setField(term11398, term11398.getClass(), "function", null);
        term11399 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term11399, term11399.getClass(), "point", 0.0);
        setDoubleField(term11399, term11399.getClass(), "value", 0.0);
        term11388 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term11388, term11388.getClass(), "point", 0.0);
        setDoubleField(term11388, term11388.getClass(), "value", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term11365;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "best", argTypes, term11213, args);
        assertTrue(recursiveEquals(term11213, term11398));
        assertTrue(recursiveEquals(term11365, term11399));
        assertTrue(recursiveEquals(retValue, term11388));
    }

};


