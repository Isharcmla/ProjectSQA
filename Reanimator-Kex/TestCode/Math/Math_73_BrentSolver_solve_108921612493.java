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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;

public class BrentSolver_solve_108921612493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27092;
     Object term27122;

    public BrentSolver_solve_108921612493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27092 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term27092, term27092.getClass(), "maximalIterationCount", 1);
        setDoubleField(term27092, term27092.getClass(), "functionValueAccuracy", -9.2152850736280812E18);
        setDoubleField(term27092, term27092.getClass(), "relativeAccuracy", 9.2188684372274053E18);
        setDoubleField(term27092, term27092.getClass(), "absoluteAccuracy", 9.21886845640384E18);
        term27122 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term27122, term27122.getClass(), "functionValueAccuracy", -9.2152850736280812E18);
        setDoubleField(term27122, term27122.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term27122, term27122.getClass(), "resultComputed", true);
        setDoubleField(term27122, term27122.getClass(), "result", -0.0);
        setDoubleField(term27122, term27122.getClass(), "functionValue", 0.0);
        setField(term27122, term27122.getClass(), "f", null);
        setDoubleField(term27122, term27122.getClass(), "absoluteAccuracy", 9.21886845640384E18);
        setDoubleField(term27122, term27122.getClass(), "relativeAccuracy", 9.2188684372274053E18);
        setIntField(term27122, term27122.getClass(), "maximalIterationCount", 1);
        setDoubleField(term27122, term27122.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term27122, term27122.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term27122, term27122.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term27122, term27122.getClass(), "iterationCount", 0);
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
        args[1] = 4.450147717031608E-308;
        args[2] = -3.326688498719611E36;
        args[3] = -0.0;
        args[4] = 4.442687654811884E-306;
        args[5] = 4.450147717031608E-308;
        args[6] = 2.063477415363435;
        Object retValue = callMethod(klass, "solve", argTypes, term27092, args);
        assertTrue(recursiveEquals(term27092, term27122));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


