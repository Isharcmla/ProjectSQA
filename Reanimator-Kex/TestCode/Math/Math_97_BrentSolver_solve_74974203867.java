package org.apache.commons.math.analysis;

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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class BrentSolver_solve_74974203867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13808;

    public BrentSolver_solve_74974203867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13808 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term13936 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunctionNewtonForm"));
        setIntField(term13808, term13808.getClass(), "maximalIterationCount", 1);
        setDoubleField(term13808, term13808.getClass(), "functionValueAccuracy", 5.7660546178445568E18);
        setDoubleField(term13808, term13808.getClass(), "relativeAccuracy", 9.2098682844726139E18);
        setDoubleField(term13808, term13808.getClass(), "absoluteAccuracy", 2.251799813685248E15);
        setField(term13808, term13808.getClass(), "f", term13936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        Object[] args = new Object[6];
        args[0] = 5.460386487788762E21;
        args[1] = 0.0;
        args[2] = 7.998537984002106E9;
        args[3] = 1.7093315401476253E234;
        args[4] = Double.NaN;
        args[5] = 4.021694539143875E241;
        try {
            callMethod(klass, "solve", argTypes, term13808, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


