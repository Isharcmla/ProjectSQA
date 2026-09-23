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

public class BrentOptimizer_optimize_64344648395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74326;
     Object term74572;

    public BrentOptimizer_optimize_64344648395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75548 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term75547 = ((Class) term75548).getDeclaredField((String) "MINIMIZE");
        ((Field) term75547).setAccessible(true);
        Object enum111 = ((Field) term75547).get((Object) null);
        term74326 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term74326, term74326.getClass(), "resultComputed", false);
        setField(term74326, term74326.getClass(), "goal", enum111);
        setDoubleField(term74326, term74326.getClass(), "relativeAccuracy", 9.009398277996544E15);
        setDoubleField(term74326, term74326.getClass(), "absoluteAccuracy", 1.125899906842624E15);
        setIntField(term74326, term74326.getClass(), "evaluations", 2147483646);
        setIntField(term74326, term74326.getClass(), "maxEvaluations", 2147483647);
        term74572 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term74572;
        args[1] = null;
        args[2] = 2.243000611574013E-308;
        args[3] = 2.0010375976562504;
        args[4] = 0.0;
        try {
            callMethod(klass, "optimize", argTypes, term74326, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


