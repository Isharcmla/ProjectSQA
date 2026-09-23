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
import org.apache.commons.math.exception.NumberIsTooSmallException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BracketingNthOrderBrentSolver_init_202687674224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public BracketingNthOrderBrentSolver_init_202687674224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12218 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term12304 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term12218, term12218.getClass(), "evaluations", term12304);
        setDoubleField(term12218, term12218.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term12218, term12218.getClass(), "relativeAccuracy", 0.0);
        setDoubleField(term12218, term12218.getClass(), "functionValueAccuracy", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 0.0;
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NumberIsTooSmallException e) {
        }

    }

};


