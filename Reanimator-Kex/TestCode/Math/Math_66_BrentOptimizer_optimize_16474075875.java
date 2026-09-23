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

public class BrentOptimizer_optimize_16474075875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57988;

    public BrentOptimizer_optimize_16474075875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58684 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term58683 = ((Class) term58684).getDeclaredField((String) "MINIMIZE");
        ((Field) term58683).setAccessible(true);
        Object enum83 = ((Field) term58683).get((Object) null);
        term57988 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term57988, term57988.getClass(), "resultComputed", false);
        setField(term57988, term57988.getClass(), "goal", enum83);
        setDoubleField(term57988, term57988.getClass(), "relativeAccuracy", 5.7646102718133043E17);
        setDoubleField(term57988, term57988.getClass(), "absoluteAccuracy", 4.5035996273705E15);
        setIntField(term57988, term57988.getClass(), "evaluations", 2147483646);
        setIntField(term57988, term57988.getClass(), "maxEvaluations", 2147483647);
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
        args[2] = -2.461156121589022E77;
        args[3] = 3.170534544871917E-154;
        try {
            callMethod(klass, "optimize", argTypes, term57988, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


