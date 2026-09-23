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
import org.apache.commons.math.exception.NumberIsTooLargeException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BracketingNthOrderBrentSolver_doSolve_34726318049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40490;

    public BracketingNthOrderBrentSolver_doSolve_34726318049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40490 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setIntField(term40490, term40490.getClass(), "maximalOrder", 2);
        setDoubleField(term40490, term40490.getClass(), "searchMin", 0.0);
        setDoubleField(term40490, term40490.getClass(), "searchStart", 0.0);
        setDoubleField(term40490, term40490.getClass(), "searchMax", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doSolve", argTypes, term40490, args);
            assertTrue(false);
        }
        catch (NumberIsTooLargeException e) {
        }

    }

};


