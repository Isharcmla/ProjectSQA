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

public class BrentOptimizer_optimize_16474075849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38827;

    public BrentOptimizer_optimize_16474075849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40372 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term40371 = ((Class) term40372).getDeclaredField((String) "MAXIMIZE");
        ((Field) term40371).setAccessible(true);
        Object enum61 = ((Field) term40371).get((Object) null);
        term38827 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term38827, term38827.getClass(), "resultComputed", false);
        setField(term38827, term38827.getClass(), "goal", enum61);
        setDoubleField(term38827, term38827.getClass(), "relativeAccuracy", 4.50360070111232E15);
        setDoubleField(term38827, term38827.getClass(), "absoluteAccuracy", 2.199023255552E12);
        setIntField(term38827, term38827.getClass(), "evaluations", 2147483646);
        setIntField(term38827, term38827.getClass(), "maxEvaluations", 2147483647);
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
        args[2] = -1.3156373904E-312;
        args[3] = -1.3156373904E-312;
        try {
            callMethod(klass, "optimize", argTypes, term38827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


