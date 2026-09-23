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

public class BrentOptimizer_best_31927674220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9088;
     Object term9316;
     Object term10623;
     Object term10624;
     Object term10625;
     Object term10610;

    public BrentOptimizer_best_31927674220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9088 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term9316 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        term10623 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term10623, term10623.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term10623, term10623.getClass(), "absoluteThreshold", 0.0);
        setField(term10623, term10623.getClass(), "checker", null);
        setField(term10623, term10623.getClass(), "evaluations", null);
        setField(term10623, term10623.getClass(), "goal", null);
        setDoubleField(term10623, term10623.getClass(), "searchMin", 0.0);
        setDoubleField(term10623, term10623.getClass(), "searchMax", 0.0);
        setDoubleField(term10623, term10623.getClass(), "searchStart", 0.0);
        setField(term10623, term10623.getClass(), "function", null);
        term10624 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term10624, term10624.getClass(), "point", 0.0);
        setDoubleField(term10624, term10624.getClass(), "value", 0.0);
        term10625 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term10625, term10625.getClass(), "point", 0.0);
        setDoubleField(term10625, term10625.getClass(), "value", 0.0);
        term10610 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term10610, term10610.getClass(), "point", 0.0);
        setDoubleField(term10610, term10610.getClass(), "value", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term9316;
        args[1] = term9316;
        args[2] = true;
        Object retValue = callMethod(klass, "best", argTypes, term9088, args);
        assertTrue(recursiveEquals(term9088, term10623));
        assertTrue(recursiveEquals(term9316, term10624));
        assertTrue(recursiveEquals(term9316, term10625));
        assertTrue(recursiveEquals(retValue, term10610));
    }

};


