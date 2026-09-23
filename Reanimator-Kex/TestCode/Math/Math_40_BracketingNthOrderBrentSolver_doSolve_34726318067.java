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
import java.lang.Object;

public class BracketingNthOrderBrentSolver_doSolve_34726318067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65279;

    public BracketingNthOrderBrentSolver_doSolve_34726318067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65279 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term65365 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setIntField(term65279, term65279.getClass(), "maximalOrder", 2);
        setDoubleField(term65279, term65279.getClass(), "searchMin", 0.0);
        setDoubleField(term65279, term65279.getClass(), "searchStart", 0.0);
        setDoubleField(term65279, term65279.getClass(), "searchMax", 0.0);
        setIntField(term65365, term65365.getClass(), "count", 2147483646);
        setIntField(term65365, term65365.getClass(), "maximalCount", 2147483646);
        setField(term65365, term65365.getClass(), "maxCountCallback", null);
        setField(term65279, term65279.getClass(), "evaluations", term65365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doSolve", argTypes, term65279, args);
            assertTrue(false);
        }
        catch (NumberIsTooLargeException e) {
        }

    }

};


