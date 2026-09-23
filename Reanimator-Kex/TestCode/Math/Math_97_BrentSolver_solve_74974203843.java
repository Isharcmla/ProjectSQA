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

public class BrentSolver_solve_74974203843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8658;
     Object term8687;

    public BrentSolver_solve_74974203843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8658 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term8658, term8658.getClass(), "maximalIterationCount", 1);
        setDoubleField(term8658, term8658.getClass(), "functionValueAccuracy", -4.2873541334356434E18);
        setDoubleField(term8658, term8658.getClass(), "relativeAccuracy", -4.7854747928071946E18);
        setDoubleField(term8658, term8658.getClass(), "absoluteAccuracy", 4.6274486171231846E18);
        term8687 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term8687, term8687.getClass(), "absoluteAccuracy", 4.6274486171231846E18);
        setDoubleField(term8687, term8687.getClass(), "relativeAccuracy", -4.7854747928071946E18);
        setDoubleField(term8687, term8687.getClass(), "functionValueAccuracy", -4.2873541334356434E18);
        setIntField(term8687, term8687.getClass(), "maximalIterationCount", 1);
        setDoubleField(term8687, term8687.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term8687, term8687.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term8687, term8687.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term8687, term8687.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term8687, term8687.getClass(), "resultComputed", true);
        setDoubleField(term8687, term8687.getClass(), "result", -1.394915204960963E-309);
        setIntField(term8687, term8687.getClass(), "iterationCount", 0);
        setField(term8687, term8687.getClass(), "f", null);
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
        args[0] = 1.090056463349157E-298;
        args[1] = 0.0;
        args[2] = -1.394915204960963E-309;
        args[3] = 2.817202131565605E-308;
        args[4] = 28.0;
        args[5] = -2.000000089406967;
        Object retValue = callMethod(klass, "solve", argTypes, term8658, args);
        assertTrue(recursiveEquals(term8658, term8687));
        assertTrue(recursiveEquals(retValue, -1.394915204960963E-309));
    }

};


