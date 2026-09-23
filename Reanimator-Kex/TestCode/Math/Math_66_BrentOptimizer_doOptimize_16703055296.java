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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_doOptimize_16703055296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BrentOptimizer_doOptimize_16703055296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2082 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term2081 = ((Class) term2082).getDeclaredField((String) "MAXIMIZE");
        ((Field) term2081).setAccessible(true);
        Object enum5 = ((Field) term2081).get((Object) null);
        term1 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term1, term1.getClass(), "resultComputed", false);
        setDoubleField(term1, term1.getClass(), "result", 0.13238746331190498);
        setDoubleField(term1, term1.getClass(), "functionValue", 0.3455959125047594);
        setIntField(term1, term1.getClass(), "maxEvaluations", 2147483647);
        setIntField(term1, term1.getClass(), "evaluations", 568599855);
        setField(term1, term1.getClass(), "goal", enum5);
        setDoubleField(term1, term1.getClass(), "min", 0.5523635872663106);
        setDoubleField(term1, term1.getClass(), "max", 0.544608645520025);
        setDoubleField(term1, term1.getClass(), "startValue", 0.28570734989730284);
        setField(term1, term1.getClass(), "function", null);
        setDoubleField(term1, term1.getClass(), "absoluteAccuracy", 1.0E-10);
        setDoubleField(term1, term1.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term1, term1.getClass(), "maximalIterationCount", 100);
        setDoubleField(term1, term1.getClass(), "defaultAbsoluteAccuracy", 0.40176586625454525);
        setDoubleField(term1, term1.getClass(), "defaultRelativeAccuracy", 0.2641345529914265);
        setIntField(term1, term1.getClass(), "defaultMaximalIterationCount", 1162663216);
        setIntField(term1, term1.getClass(), "iterationCount", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term1, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


