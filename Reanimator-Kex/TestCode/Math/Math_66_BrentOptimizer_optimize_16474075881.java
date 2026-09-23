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
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_optimize_16474075881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62739;
     Object term62973;

    public BrentOptimizer_optimize_16474075881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63539 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term63538 = ((Class) term63539).getDeclaredField((String) "MINIMIZE");
        ((Field) term63538).setAccessible(true);
        Object enum92 = ((Field) term63538).get((Object) null);
        term62739 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term62739, term62739.getClass(), "resultComputed", false);
        setField(term62739, term62739.getClass(), "goal", enum92);
        setDoubleField(term62739, term62739.getClass(), "relativeAccuracy", 5.066549580791808E15);
        setDoubleField(term62739, term62739.getClass(), "absoluteAccuracy", 4.503599627370497E15);
        setIntField(term62739, term62739.getClass(), "evaluations", 2147483646);
        setIntField(term62739, term62739.getClass(), "maxEvaluations", 2147483647);
        term62973 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term62973;
        args[1] = null;
        args[2] = -10.000000000000002;
        args[3] = -2.78134232319876E-308;
        try {
            callMethod(klass, "optimize", argTypes, term62739, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


