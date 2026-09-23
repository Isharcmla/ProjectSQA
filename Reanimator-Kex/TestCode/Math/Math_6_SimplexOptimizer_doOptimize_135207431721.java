package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SimplexOptimizer_doOptimize_135207431721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11065;

    public SimplexOptimizer_doOptimize_135207431721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12021 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term12020 = ((Class) term12021).getDeclaredField((String) "MINIMIZE");
        ((Field) term12020).setAccessible(true);
        Object enum11 = ((Field) term12020).get((Object) null);
        term11065 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term11217 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(term11065, term11065.getClass(), "simplex", term11217);
        setField(term11065, term11065.getClass(), "lowerBound", null);
        setField(term11065, term11065.getClass(), "upperBound", null);
        setField(term11065, term11065.getClass(), "goal", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term11065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


