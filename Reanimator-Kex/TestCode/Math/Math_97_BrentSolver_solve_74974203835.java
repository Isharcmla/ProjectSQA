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
import java.lang.Double;
import java.lang.Object;

public class BrentSolver_solve_74974203835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6976;

    public BrentSolver_solve_74974203835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6976 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term6976, term6976.getClass(), "maximalIterationCount", 0);
        Object term7046 = newInstance(Class.forName("java.util.PropertyResourceBundle"));
        setField(null, Class.forName("org.apache.commons.math.MathException"), "cachedResources", term7046);
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
        args[0] = Double.NaN;
        args[1] = 0.0;
        args[2] = Double.NaN;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term6976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


