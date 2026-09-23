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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.EqualityUtils.*;

public class BrentSolver_solve_74974203829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5613;
     Object term5642;

    public BrentSolver_solve_74974203829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5613 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term5613, term5613.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5613, term5613.getClass(), "functionValueAccuracy", -7.2000853740334612E18);
        setDoubleField(term5613, term5613.getClass(), "relativeAccuracy", 6.9082798773303869E18);
        setDoubleField(term5613, term5613.getClass(), "absoluteAccuracy", 9.2216150484295434E18);
        term5642 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term5642, term5642.getClass(), "absoluteAccuracy", 9.2216150484295434E18);
        setDoubleField(term5642, term5642.getClass(), "relativeAccuracy", 6.9082798773303869E18);
        setDoubleField(term5642, term5642.getClass(), "functionValueAccuracy", -7.2000853740334612E18);
        setIntField(term5642, term5642.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5642, term5642.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term5642, term5642.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term5642, term5642.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term5642, term5642.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term5642, term5642.getClass(), "resultComputed", true);
        setDoubleField(term5642, term5642.getClass(), "result", 0.062744140625);
        setIntField(term5642, term5642.getClass(), "iterationCount", 0);
        setField(term5642, term5642.getClass(), "f", null);
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
        args[0] = 56.4765625;
        args[1] = -2.848181455836816E-306;
        args[2] = 0.062744140625;
        args[3] = 7.685903561474862E-183;
        args[4] = 1.004150390625;
        args[5] = 4.496830758912E12;
        Object retValue = callMethod(klass, "solve", argTypes, term5613, args);
        assertTrue(recursiveEquals(term5613, term5642));
        assertTrue(recursiveEquals(retValue, 0.062744140625));
    }

};


