package org.apache.commons.math.analysis.solvers;

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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import java.lang.Object;

public class BaseSecantSolver_solve_9977028425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;
     Object term407;
     Object term409;
     Object term411;
     Object enum3;

    public BaseSecantSolver_solve_9977028425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405 = new Integer(1162663216);
        term407 = new Double(0.5523635872663106);
        term409 = new Double(0.544608645520025);
        term411 = new Double(0.28570734989730284);
        Class<? extends Object> term1562 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term1561 = ((Class) term1562).getDeclaredField((String) "BELOW_SIDE");
        ((Field) term1561).setAccessible(true);
        enum3 = ((Field) term1561).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BaseSecantSolver");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = Class.forName("org.apache.commons.math.analysis.solvers.AllowedSolution");
        Object[] args = new Object[6];
        args[0] = term405;
        args[1] = null;
        args[2] = term407;
        args[3] = term409;
        args[4] = term411;
        args[5] = enum3;
        try {
            callMethod(klass, "solve", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


