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

public class BrentOptimizer_best_31927674224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11539;
     Object term12140;

    public BrentOptimizer_best_31927674224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11539 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term12140 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term12140, term12140.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term12140, term12140.getClass(), "absoluteThreshold", 0.0);
        setField(term12140, term12140.getClass(), "checker", null);
        setField(term12140, term12140.getClass(), "evaluations", null);
        setField(term12140, term12140.getClass(), "goal", null);
        setDoubleField(term12140, term12140.getClass(), "searchMin", 0.0);
        setDoubleField(term12140, term12140.getClass(), "searchMax", 0.0);
        setDoubleField(term12140, term12140.getClass(), "searchStart", 0.0);
        setField(term12140, term12140.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "best", argTypes, term11539, args);
        assertTrue(recursiveEquals(term11539, term12140));
        assertTrue(recursiveEquals(retValue, null));
    }

};


