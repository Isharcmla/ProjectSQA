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

public class BrentSolver_solve_74974203833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6394;

    public BrentSolver_solve_74974203833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6394 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term6502 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        setIntField(term6394, term6394.getClass(), "maximalIterationCount", 1);
        setDoubleField(term6394, term6394.getClass(), "functionValueAccuracy", -4.0261870844880568E18);
        setDoubleField(term6394, term6394.getClass(), "relativeAccuracy", -4.6904984578617999E18);
        setDoubleField(term6394, term6394.getClass(), "absoluteAccuracy", 7.2057594037927936E16);
        setField(term6394, term6394.getClass(), "f", term6502);
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
        args[0] = 1.65955475E-316;
        args[1] = 3.2836296367787905E-288;
        args[2] = -1.4582244039112795E-303;
        args[3] = -2.437193121792453E-268;
        args[4] = Double.NaN;
        args[5] = 20.033610773439207;
        try {
            callMethod(klass, "solve", argTypes, term6394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


