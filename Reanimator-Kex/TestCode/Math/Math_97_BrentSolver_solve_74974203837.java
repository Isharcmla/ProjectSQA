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

public class BrentSolver_solve_74974203837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7518;

    public BrentSolver_solve_74974203837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7518 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term7518, term7518.getClass(), "maximalIterationCount", 1);
        setDoubleField(term7518, term7518.getClass(), "functionValueAccuracy", -8.7730120598895329E18);
        setDoubleField(term7518, term7518.getClass(), "relativeAccuracy", -2.24279247699155354E18);
        setDoubleField(term7518, term7518.getClass(), "absoluteAccuracy", 6.8770669286360289E18);
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
        args[0] = 5.129936926549347E151;
        args[1] = -1.7800590868057611E-307;
        args[2] = 1.0510572734620329E152;
        args[3] = -1.7800610498850114E-307;
        args[4] = 3.078281734451678E113;
        args[5] = 32.00003528595339;
        try {
            callMethod(klass, "solve", argTypes, term7518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


