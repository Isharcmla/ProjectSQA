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
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_doOptimize_71048296844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75437;

    public BrentOptimizer_doOptimize_71048296844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75663 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term75662 = ((Class) term75663).getDeclaredField((String) "MINIMIZE");
        ((Field) term75662).setAccessible(true);
        Object enum29 = ((Field) term75662).get((Object) null);
        term75437 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term75661 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term75437, term75437.getClass(), "goal", enum29);
        setDoubleField(term75437, term75437.getClass(), "searchMin", 3.2425917787028275E17);
        setDoubleField(term75437, term75437.getClass(), "searchStart", 0.0);
        setDoubleField(term75437, term75437.getClass(), "searchMax", -9.1465293635142083E18);
        setField(term75437, term75437.getClass(), "checker", null);
        setIntField(term75661, term75661.getClass(), "count", 2147483646);
        setIntField(term75661, term75661.getClass(), "maximalCount", 2147483647);
        setField(term75437, term75437.getClass(), "evaluations", term75661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term75437, args);
    }

};


