package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Object;

public class PowellOptimizer_newPointAndDirection_107992785633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19994;
     Object term19828;
     Object term21637;
     Object term21638;
     Object term21629;

    public PowellOptimizer_newPointAndDirection_107992785633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19994 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        term19828 = (double[]) newDoubleArray(0);
        term21637 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        setDoubleField(term21637, term21637.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term21637, term21637.getClass(), "absoluteThreshold", 0.0);
        setField(term21637, term21637.getClass(), "line", null);
        setField(term21637, term21637.getClass(), "function", null);
        setField(term21637, term21637.getClass(), "goal", null);
        setField(term21637, term21637.getClass(), "start", null);
        setField(term21637, term21637.getClass(), "lowerBound", null);
        setField(term21637, term21637.getClass(), "upperBound", null);
        setField(term21637, term21637.getClass(), "evaluations", null);
        setField(term21637, term21637.getClass(), "iterations", null);
        setField(term21637, term21637.getClass(), "checker", null);
        term21638 = (double[]) newDoubleArray(0);
        term21629 = (Object[]) newArray("[D", 2);
        double[] term21630 = (double[]) newDoubleArray(0);
        double[] term21631 = (double[]) newDoubleArray(0);
        setElement(term21629, 0, term21630);
        setElement(term21629, 1, term21631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term19828;
        args[1] = null;
        args[2] = 0.0;
        Object retValue = callMethod(klass, "newPointAndDirection", argTypes, term19994, args);
        assertTrue(recursiveEquals(term19994, term21637));
        assertTrue(recursiveEquals(term19828, term21638));
        assertTrue(recursiveEquals(retValue, term21629));
    }

};


