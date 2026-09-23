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

public class BrentOptimizer_best_31927674214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7051;
     Object term7203;
     Object term7355;
     Object term7539;
     Object term7540;
     Object term7541;
     Object term7527;

    public BrentOptimizer_best_31927674214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7051 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term7203 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term7203, term7203.getClass(), "value", -1.7442643327766968E16);
        term7355 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term7355, term7355.getClass(), "value", 9.2088101059975311E18);
        term7539 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term7539, term7539.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term7539, term7539.getClass(), "absoluteThreshold", 0.0);
        setField(term7539, term7539.getClass(), "checker", null);
        setField(term7539, term7539.getClass(), "evaluations", null);
        setField(term7539, term7539.getClass(), "goal", null);
        setDoubleField(term7539, term7539.getClass(), "searchMin", 0.0);
        setDoubleField(term7539, term7539.getClass(), "searchMax", 0.0);
        setDoubleField(term7539, term7539.getClass(), "searchStart", 0.0);
        setField(term7539, term7539.getClass(), "function", null);
        term7540 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term7540, term7540.getClass(), "point", 0.0);
        setDoubleField(term7540, term7540.getClass(), "value", -1.7442643327766968E16);
        term7541 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term7541, term7541.getClass(), "point", 0.0);
        setDoubleField(term7541, term7541.getClass(), "value", 9.2088101059975311E18);
        term7527 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term7527, term7527.getClass(), "point", 0.0);
        setDoubleField(term7527, term7527.getClass(), "value", 9.2088101059975311E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term7203;
        args[1] = term7355;
        args[2] = false;
        Object retValue = callMethod(klass, "best", argTypes, term7051, args);
        assertTrue(recursiveEquals(term7051, term7539));
        assertTrue(recursiveEquals(term7203, term7540));
        assertTrue(recursiveEquals(term7355, term7541));
        assertTrue(recursiveEquals(retValue, term7527));
    }

};


