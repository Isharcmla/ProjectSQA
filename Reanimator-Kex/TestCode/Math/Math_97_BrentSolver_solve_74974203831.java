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

public class BrentSolver_solve_74974203831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5846;
     Object term5873;

    public BrentSolver_solve_74974203831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5846 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term5846, term5846.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5846, term5846.getClass(), "functionValueAccuracy", 9.2188684721251492E18);
        setDoubleField(term5846, term5846.getClass(), "relativeAccuracy", -4.5843608819171983E18);
        setDoubleField(term5846, term5846.getClass(), "absoluteAccuracy", -9.2233714870989619E18);
        term5873 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term5873, term5873.getClass(), "absoluteAccuracy", -9.2233714870989619E18);
        setDoubleField(term5873, term5873.getClass(), "relativeAccuracy", -4.5843608819171983E18);
        setDoubleField(term5873, term5873.getClass(), "functionValueAccuracy", 9.2188684721251492E18);
        setIntField(term5873, term5873.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5873, term5873.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term5873, term5873.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term5873, term5873.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term5873, term5873.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term5873, term5873.getClass(), "resultComputed", true);
        setDoubleField(term5873, term5873.getClass(), "result", -1.5541576669252E-310);
        setIntField(term5873, term5873.getClass(), "iterationCount", 0);
        setField(term5873, term5873.getClass(), "f", null);
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
        args[0] = -5.78541931100737E-310;
        args[1] = 0.0;
        args[2] = -1.47266093440687E-310;
        args[3] = -3.018129350637623;
        args[4] = -1.5541576669252E-310;
        args[5] = -1.85465089929165E-310;
        Object retValue = callMethod(klass, "solve", argTypes, term5846, args);
        assertTrue(recursiveEquals(term5846, term5873));
        assertTrue(recursiveEquals(retValue, -1.5541576669252E-310));
    }

};


