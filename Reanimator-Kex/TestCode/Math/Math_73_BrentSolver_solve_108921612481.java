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
import java.lang.Double;

public class BrentSolver_solve_108921612481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23446;

    public BrentSolver_solve_108921612481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23446 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term23446, term23446.getClass(), "maximalIterationCount", 1);
        setDoubleField(term23446, term23446.getClass(), "functionValueAccuracy", 8.2725946781868032E17);
        setDoubleField(term23446, term23446.getClass(), "relativeAccuracy", -2.4544441335232271E18);
        setDoubleField(term23446, term23446.getClass(), "absoluteAccuracy", 8.0624290065763553E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = 2.0020840498507145E-146;
        args[2] = 0.0;
        args[3] = -5.7586096570152914E163;
        args[4] = Double.NaN;
        args[5] = -1.6495564173287358E231;
        args[6] = 2.1988060128470363E-79;
        try {
            callMethod(klass, "solve", argTypes, term23446, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


