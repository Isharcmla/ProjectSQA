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

public class BrentOptimizer_doOptimize_71048296833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28165;

    public BrentOptimizer_doOptimize_71048296833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28949 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term28948 = ((Class) term28949).getDeclaredField((String) "MAXIMIZE");
        ((Field) term28948).setAccessible(true);
        Object enum13 = ((Field) term28948).get((Object) null);
        term28165 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term28389 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term28165, term28165.getClass(), "goal", enum13);
        setDoubleField(term28165, term28165.getClass(), "searchMin", 1.196337706631169E15);
        setDoubleField(term28165, term28165.getClass(), "searchStart", 0.0);
        setDoubleField(term28165, term28165.getClass(), "searchMax", -9.2176720997886853E18);
        setField(term28165, term28165.getClass(), "checker", null);
        setField(term28165, term28165.getClass(), "evaluations", term28389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term28165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


