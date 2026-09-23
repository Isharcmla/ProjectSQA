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
     Object term10841;
     Object term11069;
     Object term11383;
     Object term11384;
     Object term11385;
     Object term11370;

    public BrentOptimizer_best_31927674220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10841 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term11069 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        term11383 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term11383, term11383.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term11383, term11383.getClass(), "absoluteThreshold", 0.0);
        setField(term11383, term11383.getClass(), "checker", null);
        setField(term11383, term11383.getClass(), "evaluations", null);
        setField(term11383, term11383.getClass(), "goal", null);
        setDoubleField(term11383, term11383.getClass(), "searchMin", 0.0);
        setDoubleField(term11383, term11383.getClass(), "searchMax", 0.0);
        setDoubleField(term11383, term11383.getClass(), "searchStart", 0.0);
        setField(term11383, term11383.getClass(), "function", null);
        term11384 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term11384, term11384.getClass(), "point", 0.0);
        setDoubleField(term11384, term11384.getClass(), "value", 0.0);
        term11385 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term11385, term11385.getClass(), "point", 0.0);
        setDoubleField(term11385, term11385.getClass(), "value", 0.0);
        term11370 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term11370, term11370.getClass(), "point", 0.0);
        setDoubleField(term11370, term11370.getClass(), "value", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term11069;
        args[1] = term11069;
        args[2] = true;
        Object retValue = callMethod(klass, "best", argTypes, term10841, args);
        assertTrue(recursiveEquals(term10841, term11383));
        assertTrue(recursiveEquals(term11069, term11384));
        assertTrue(recursiveEquals(term11069, term11385));
        assertTrue(recursiveEquals(retValue, term11370));
    }

};


