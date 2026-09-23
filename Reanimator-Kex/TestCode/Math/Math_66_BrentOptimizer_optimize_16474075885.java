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

public class BrentOptimizer_optimize_16474075885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65857;
     Object term66135;

    public BrentOptimizer_optimize_16474075885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66701 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term66700 = ((Class) term66701).getDeclaredField((String) "MINIMIZE");
        ((Field) term66700).setAccessible(true);
        Object enum98 = ((Field) term66700).get((Object) null);
        term65857 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term65857, term65857.getClass(), "resultComputed", false);
        setField(term65857, term65857.getClass(), "goal", enum98);
        setDoubleField(term65857, term65857.getClass(), "relativeAccuracy", 4.50360070111232E15);
        setDoubleField(term65857, term65857.getClass(), "absoluteAccuracy", 4.503599627370497E15);
        setIntField(term65857, term65857.getClass(), "evaluations", 2147483646);
        setIntField(term65857, term65857.getClass(), "maxEvaluations", 2147483647);
        term66135 = newInstance(Class.forName("org.apache.commons.math.distribution.AbstractContinuousDistribution$1"));
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
        args[0] = term66135;
        args[1] = null;
        args[2] = 2.3158417847463244E77;
        args[3] = 2.225073858507233E-308;
        try {
            callMethod(klass, "optimize", argTypes, term65857, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


