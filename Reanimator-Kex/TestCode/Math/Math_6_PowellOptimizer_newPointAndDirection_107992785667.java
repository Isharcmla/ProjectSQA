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
import java.lang.Double;
import java.lang.Object;

public class PowellOptimizer_newPointAndDirection_107992785667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160193;
     Object term159771;
     Object term159773;
     Object term170088;
     Object term170089;
     Object term170090;
     Object term169843;

    public PowellOptimizer_newPointAndDirection_107992785667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160193 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        term159771 = (double[]) newDoubleArray(1);
        term159773 = (double[]) newDoubleArray(233);
        term170088 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        setDoubleField(term170088, term170088.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term170088, term170088.getClass(), "absoluteThreshold", 0.0);
        setField(term170088, term170088.getClass(), "line", null);
        setField(term170088, term170088.getClass(), "function", null);
        setField(term170088, term170088.getClass(), "goal", null);
        setField(term170088, term170088.getClass(), "start", null);
        setField(term170088, term170088.getClass(), "lowerBound", null);
        setField(term170088, term170088.getClass(), "upperBound", null);
        setField(term170088, term170088.getClass(), "evaluations", null);
        setField(term170088, term170088.getClass(), "iterations", null);
        setField(term170088, term170088.getClass(), "checker", null);
        term170089 = (double[]) newDoubleArray(1);
        term170090 = (double[]) newDoubleArray(233);
        term169843 = (Object[]) newArray("[D", 2);
        double[] term169844 = (double[]) newDoubleArray(1);
        double[] term169846 = (double[]) newDoubleArray(1);
        setDoubleElement(term169844, 0, Double.NaN);
        setElement(term169843, 0, term169844);
        setDoubleElement(term169846, 0, Double.NaN);
        setElement(term169843, 1, term169846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term159771;
        args[1] = term159773;
        args[2] = Double.NaN;
        Object retValue = callMethod(klass, "newPointAndDirection", argTypes, term160193, args);
        assertTrue(recursiveEquals(term160193, term170088));
        assertTrue(recursiveEquals(term159771, term170089));
        assertTrue(recursiveEquals(term159773, term170090));
        assertTrue(recursiveEquals(retValue, term169843));
    }

};


