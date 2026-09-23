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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_optimize_16474075879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60771;
     Object term61019;

    public BrentOptimizer_optimize_16474075879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61995 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term61994 = ((Class) term61995).getDeclaredField((String) "MAXIMIZE");
        ((Field) term61994).setAccessible(true);
        Object enum89 = ((Field) term61994).get((Object) null);
        term60771 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term60771, term60771.getClass(), "resultComputed", false);
        setField(term60771, term60771.getClass(), "goal", enum89);
        setDoubleField(term60771, term60771.getClass(), "relativeAccuracy", 4.5035996273705E15);
        setDoubleField(term60771, term60771.getClass(), "absoluteAccuracy", 4.503599627370497E15);
        setIntField(term60771, term60771.getClass(), "evaluations", 2147483646);
        setIntField(term60771, term60771.getClass(), "maxEvaluations", 2147483647);
        term61019 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$26"));
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
        args[0] = term61019;
        args[1] = null;
        args[2] = 7.022238808055923E305;
        args[3] = 9.745314011541812E288;
        try {
            callMethod(klass, "optimize", argTypes, term60771, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


