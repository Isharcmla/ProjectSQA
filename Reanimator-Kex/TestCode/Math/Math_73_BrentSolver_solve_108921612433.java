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

public class BrentSolver_solve_108921612433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8901;
     Object term8931;

    public BrentSolver_solve_108921612433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8901 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term8901, term8901.getClass(), "maximalIterationCount", 1);
        setDoubleField(term8901, term8901.getClass(), "functionValueAccuracy", -8.9304611581166141E18);
        setDoubleField(term8901, term8901.getClass(), "relativeAccuracy", -3.7605056888543642E18);
        setDoubleField(term8901, term8901.getClass(), "absoluteAccuracy", 9.007749010554882E15);
        term8931 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term8931, term8931.getClass(), "functionValueAccuracy", -8.9304611581166141E18);
        setDoubleField(term8931, term8931.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term8931, term8931.getClass(), "resultComputed", true);
        setDoubleField(term8931, term8931.getClass(), "result", 4.45069094793689E-308);
        setDoubleField(term8931, term8931.getClass(), "functionValue", 0.0);
        setField(term8931, term8931.getClass(), "f", null);
        setDoubleField(term8931, term8931.getClass(), "absoluteAccuracy", 9.007749010554882E15);
        setDoubleField(term8931, term8931.getClass(), "relativeAccuracy", -3.7605056888543642E18);
        setIntField(term8931, term8931.getClass(), "maximalIterationCount", 1);
        setDoubleField(term8931, term8931.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term8931, term8931.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term8931, term8931.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term8931, term8931.getClass(), "iterationCount", 0);
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
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 4.45069094793689E-308;
        args[4] = -3.4080764569171454E-229;
        args[5] = -4.4240726327350215E-308;
        args[6] = -1.721514585915724E10;
        Object retValue = callMethod(klass, "solve", argTypes, term8901, args);
        assertTrue(recursiveEquals(term8901, term8931));
        assertTrue(recursiveEquals(retValue, 4.45069094793689E-308));
    }

};


