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
     Object term9460;
     Object term9612;
     Object term10638;
     Object term10639;
     Object term10628;

    public BrentOptimizer_best_31927674221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9460 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term9612 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        term10638 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term10638, term10638.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term10638, term10638.getClass(), "absoluteThreshold", 0.0);
        setField(term10638, term10638.getClass(), "checker", null);
        setField(term10638, term10638.getClass(), "evaluations", null);
        setField(term10638, term10638.getClass(), "goal", null);
        setDoubleField(term10638, term10638.getClass(), "searchMin", 0.0);
        setDoubleField(term10638, term10638.getClass(), "searchMax", 0.0);
        setDoubleField(term10638, term10638.getClass(), "searchStart", 0.0);
        setField(term10638, term10638.getClass(), "function", null);
        term10639 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term10639, term10639.getClass(), "point", 0.0);
        setDoubleField(term10639, term10639.getClass(), "value", 0.0);
        term10628 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term10628, term10628.getClass(), "point", 0.0);
        setDoubleField(term10628, term10628.getClass(), "value", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term9612;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "best", argTypes, term9460, args);
        assertTrue(recursiveEquals(term9460, term10638));
        assertTrue(recursiveEquals(term9612, term10639));
        assertTrue(recursiveEquals(retValue, term10628));
    }

};


