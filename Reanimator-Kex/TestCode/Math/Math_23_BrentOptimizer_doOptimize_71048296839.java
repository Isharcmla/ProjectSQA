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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_doOptimize_71048296839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58839;

    public BrentOptimizer_doOptimize_71048296839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59623 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term59622 = ((Class) term59623).getDeclaredField((String) "MAXIMIZE");
        ((Field) term59622).setAccessible(true);
        Object enum22 = ((Field) term59622).get((Object) null);
        term58839 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term59063 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term58839, term58839.getClass(), "goal", enum22);
        setDoubleField(term58839, term58839.getClass(), "searchMin", 8.6917768592071283E17);
        setDoubleField(term58839, term58839.getClass(), "searchStart", 0.0);
        setDoubleField(term58839, term58839.getClass(), "searchMax", -8.7865399143563223E18);
        setField(term58839, term58839.getClass(), "checker", null);
        setIntField(term59063, term59063.getClass(), "count", 2147483646);
        setIntField(term59063, term59063.getClass(), "maximalCount", 2147483646);
        setField(term58839, term58839.getClass(), "evaluations", term59063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term58839, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


