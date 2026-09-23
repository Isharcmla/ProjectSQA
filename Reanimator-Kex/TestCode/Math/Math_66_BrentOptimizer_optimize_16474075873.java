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

public class BrentOptimizer_optimize_16474075873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56555;

    public BrentOptimizer_optimize_16474075873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57251 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term57250 = ((Class) term57251).getDeclaredField((String) "MINIMIZE");
        ((Field) term57250).setAccessible(true);
        Object enum80 = ((Field) term57250).get((Object) null);
        term56555 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term56555, term56555.getClass(), "resultComputed", false);
        setField(term56555, term56555.getClass(), "goal", enum80);
        setDoubleField(term56555, term56555.getClass(), "relativeAccuracy", 4.503599895805952E15);
        setDoubleField(term56555, term56555.getClass(), "absoluteAccuracy", 4.50359962763264E15);
        setIntField(term56555, term56555.getClass(), "evaluations", 2147483646);
        setIntField(term56555, term56555.getClass(), "maxEvaluations", 2147483647);
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
        args[0] = null;
        args[1] = null;
        args[2] = 2.503292970653252E-308;
        args[3] = -1.4917364293915392E-154;
        try {
            callMethod(klass, "optimize", argTypes, term56555, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


