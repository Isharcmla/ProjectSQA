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

public class BrentOptimizer_doOptimize_71048296835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40808;

    public BrentOptimizer_doOptimize_71048296835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41592 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term41591 = ((Class) term41592).getDeclaredField((String) "MAXIMIZE");
        ((Field) term41591).setAccessible(true);
        Object enum19 = ((Field) term41591).get((Object) null);
        term40808 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term41032 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term40808, term40808.getClass(), "goal", enum19);
        setDoubleField(term40808, term40808.getClass(), "searchMin", 1.196337706631169E15);
        setDoubleField(term40808, term40808.getClass(), "searchStart", 0.0);
        setDoubleField(term40808, term40808.getClass(), "searchMax", -9.2176720997886853E18);
        setField(term40808, term40808.getClass(), "checker", null);
        setField(term40808, term40808.getClass(), "evaluations", term41032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term40808, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


