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

public class BrentSolver_solve_74974203841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8197;

    public BrentSolver_solve_74974203841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8197 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term8197, term8197.getClass(), "maximalIterationCount", 1);
        setDoubleField(term8197, term8197.getClass(), "functionValueAccuracy", -7.3390352513367736E18);
        setDoubleField(term8197, term8197.getClass(), "relativeAccuracy", -4.6161895616078141E18);
        setDoubleField(term8197, term8197.getClass(), "absoluteAccuracy", 8.9588044737870397E18);
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
        args[0] = 1.674232192588995E299;
        args[1] = 0.0;
        args[2] = 1.6742321987285427E299;
        args[3] = -3.4834584480583353E-101;
        args[4] = -2.1304604728820708E301;
        args[5] = 8.516708735451458E-62;
        try {
            callMethod(klass, "solve", argTypes, term8197, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


