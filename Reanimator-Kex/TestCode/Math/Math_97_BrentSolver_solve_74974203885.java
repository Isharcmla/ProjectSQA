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
import java.lang.NullPointerException;
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class BrentSolver_solve_74974203885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37807;

    public BrentSolver_solve_74974203885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37807 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term37915 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term34361 = (double[]) newDoubleArray(364);
        setIntField(term37807, term37807.getClass(), "maximalIterationCount", 1);
        setDoubleField(term37807, term37807.getClass(), "functionValueAccuracy", -4.6116860184273874E18);
        setDoubleField(term37807, term37807.getClass(), "relativeAccuracy", -4.503599627272171E15);
        setDoubleField(term37807, term37807.getClass(), "absoluteAccuracy", 5.1902480239644385E18);
        setField(term37915, term37915.getClass(), "coefficients", term34361);
        setField(term37807, term37807.getClass(), "f", term37915);
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
        args[0] = -8.0;
        args[1] = 0.0;
        args[2] = -3.39685188423E-313;
        args[3] = 0.0;
        args[4] = Double.NaN;
        args[5] = 3.689348814797925E19;
        try {
            callMethod(klass, "solve", argTypes, term37807, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


