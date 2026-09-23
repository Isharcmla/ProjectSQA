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

public class BrentSolver_solve_11837501361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12098;

    public BrentSolver_solve_11837501361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12098 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term12206 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term11973 = (double[]) newDoubleArray(10);
        setField(term12206, term12206.getClass(), "coefficients", term11973);
        setField(term12098, term12098.getClass(), "f", term12206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = Double.POSITIVE_INFINITY;
        args[1] = Double.POSITIVE_INFINITY;
        args[2] = Double.POSITIVE_INFINITY;
        try {
            callMethod(klass, "solve", argTypes, term12098, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


