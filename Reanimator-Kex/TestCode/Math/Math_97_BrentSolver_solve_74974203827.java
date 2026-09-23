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

public class BrentSolver_solve_74974203827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5371;
     Object term5400;

    public BrentSolver_solve_74974203827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5371 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term5371, term5371.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5371, term5371.getClass(), "functionValueAccuracy", 9.2222879248322396E18);
        setDoubleField(term5371, term5371.getClass(), "relativeAccuracy", 4.6071958964075346E18);
        setDoubleField(term5371, term5371.getClass(), "absoluteAccuracy", -4.503599627370496E15);
        term5400 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term5400, term5400.getClass(), "absoluteAccuracy", -4.503599627370496E15);
        setDoubleField(term5400, term5400.getClass(), "relativeAccuracy", 4.6071958964075346E18);
        setDoubleField(term5400, term5400.getClass(), "functionValueAccuracy", 9.2222879248322396E18);
        setIntField(term5400, term5400.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5400, term5400.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term5400, term5400.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term5400, term5400.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term5400, term5400.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term5400, term5400.getClass(), "resultComputed", true);
        setDoubleField(term5400, term5400.getClass(), "result", -1.0379219057504159);
        setIntField(term5400, term5400.getClass(), "iterationCount", 0);
        setField(term5400, term5400.getClass(), "f", null);
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
        args[0] = -4.503599627370496E15;
        args[1] = 7.115304292316825E41;
        args[2] = -1.0379219057504159;
        args[3] = 5.572217969077618E20;
        args[4] = -44.00000000093317;
        args[5] = -5.572217969077618E20;
        Object retValue = callMethod(klass, "solve", argTypes, term5371, args);
        assertTrue(recursiveEquals(term5371, term5400));
        assertTrue(recursiveEquals(retValue, -1.0379219057504159));
    }

};


