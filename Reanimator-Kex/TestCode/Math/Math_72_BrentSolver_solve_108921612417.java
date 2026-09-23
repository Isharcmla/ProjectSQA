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

public class BrentSolver_solve_108921612417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4694;
     Object term4724;

    public BrentSolver_solve_108921612417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4694 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term4694, term4694.getClass(), "maximalIterationCount", 1);
        setDoubleField(term4694, term4694.getClass(), "functionValueAccuracy", -9.2173873537733878E18);
        setDoubleField(term4694, term4694.getClass(), "relativeAccuracy", 5.181765258797609E18);
        setDoubleField(term4694, term4694.getClass(), "absoluteAccuracy", 9.1918468394464051E18);
        term4724 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term4724, term4724.getClass(), "functionValueAccuracy", -9.2173873537733878E18);
        setDoubleField(term4724, term4724.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term4724, term4724.getClass(), "resultComputed", true);
        setDoubleField(term4724, term4724.getClass(), "result", -6.337253098645394E-193);
        setDoubleField(term4724, term4724.getClass(), "functionValue", 0.0);
        setField(term4724, term4724.getClass(), "f", null);
        setDoubleField(term4724, term4724.getClass(), "absoluteAccuracy", 9.1918468394464051E18);
        setDoubleField(term4724, term4724.getClass(), "relativeAccuracy", 5.181765258797609E18);
        setIntField(term4724, term4724.getClass(), "maximalIterationCount", 1);
        setDoubleField(term4724, term4724.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term4724, term4724.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term4724, term4724.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term4724, term4724.getClass(), "iterationCount", 0);
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
        args[1] = Double.NaN;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = -4.5285642350453096E-154;
        args[5] = -6.337253098645394E-193;
        args[6] = -3.157632902029657E-309;
        Object retValue = callMethod(klass, "solve", argTypes, term4694, args);
        assertTrue(recursiveEquals(term4694, term4724));
        assertTrue(recursiveEquals(retValue, -6.337253098645394E-193));
    }

};


