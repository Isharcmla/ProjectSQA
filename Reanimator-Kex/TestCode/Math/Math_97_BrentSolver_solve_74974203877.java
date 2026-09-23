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

public class BrentSolver_solve_74974203877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22371;

    public BrentSolver_solve_74974203877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22371 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term22479 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term18983 = (double[]) newDoubleArray(357);
        setIntField(term22371, term22371.getClass(), "maximalIterationCount", 1);
        setDoubleField(term22371, term22371.getClass(), "functionValueAccuracy", -7.9162022450104893E18);
        setDoubleField(term22371, term22371.getClass(), "relativeAccuracy", -4.6140760670612244E18);
        setDoubleField(term22371, term22371.getClass(), "absoluteAccuracy", 4.6206272469844623E18);
        setField(term22479, term22479.getClass(), "coefficients", term18983);
        setField(term22371, term22371.getClass(), "f", term22479);
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
        args[0] = -4.0;
        args[1] = 0.0;
        args[2] = -1.2559972370084167E-308;
        args[3] = 1.157920892373162E78;
        args[4] = Double.NaN;
        args[5] = -6.864797660130611E156;
        try {
            callMethod(klass, "solve", argTypes, term22371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


