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

public class BrentOptimizer_doOptimize_71048296841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60969;

    public BrentOptimizer_doOptimize_71048296841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61753 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term61752 = ((Class) term61753).getDeclaredField((String) "MINIMIZE");
        ((Field) term61752).setAccessible(true);
        Object enum25 = ((Field) term61752).get((Object) null);
        term60969 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term61193 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term60969, term60969.getClass(), "goal", enum25);
        setDoubleField(term60969, term60969.getClass(), "searchMin", 1.44115188075855872E18);
        setDoubleField(term60969, term60969.getClass(), "searchStart", 0.0);
        setDoubleField(term60969, term60969.getClass(), "searchMax", 1.15292150460684698E18);
        setField(term60969, term60969.getClass(), "checker", null);
        setField(term60969, term60969.getClass(), "evaluations", term61193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term60969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


