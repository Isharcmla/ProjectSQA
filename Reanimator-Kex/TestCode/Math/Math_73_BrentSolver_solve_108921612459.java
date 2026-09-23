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
import java.lang.Double;

public class BrentSolver_solve_108921612459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16598;
     Object term16626;

    public BrentSolver_solve_108921612459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16598 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term16598, term16598.getClass(), "maximalIterationCount", 1);
        setDoubleField(term16598, term16598.getClass(), "functionValueAccuracy", 1.47565319223927328E17);
        setDoubleField(term16598, term16598.getClass(), "relativeAccuracy", 4.3201544187428209E18);
        setDoubleField(term16598, term16598.getClass(), "absoluteAccuracy", 4.6026788277625815E18);
        term16626 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term16626, term16626.getClass(), "functionValueAccuracy", 1.47565319223927328E17);
        setDoubleField(term16626, term16626.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term16626, term16626.getClass(), "resultComputed", true);
        setDoubleField(term16626, term16626.getClass(), "result", 1.213905991944917E-298);
        setDoubleField(term16626, term16626.getClass(), "functionValue", 0.0);
        setField(term16626, term16626.getClass(), "f", null);
        setDoubleField(term16626, term16626.getClass(), "absoluteAccuracy", 4.6026788277625815E18);
        setDoubleField(term16626, term16626.getClass(), "relativeAccuracy", 4.3201544187428209E18);
        setIntField(term16626, term16626.getClass(), "maximalIterationCount", 1);
        setDoubleField(term16626, term16626.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term16626, term16626.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term16626, term16626.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term16626, term16626.getClass(), "iterationCount", 0);
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
        args[1] = 1.2139069320246852E-298;
        args[2] = 0.0;
        args[3] = 1.213905991944917E-298;
        args[4] = -4.685777476394434E-154;
        args[5] = Double.NaN;
        args[6] = 2.4490364205625483E155;
        Object retValue = callMethod(klass, "solve", argTypes, term16598, args);
        assertTrue(recursiveEquals(term16598, term16626));
        assertTrue(recursiveEquals(retValue, 1.213905991944917E-298));
    }

};


