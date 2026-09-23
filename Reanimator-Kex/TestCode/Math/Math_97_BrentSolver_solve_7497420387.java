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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class BrentSolver_solve_7497420387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term47;
     Object term49;
     Object term51;
     Object term53;
     Object term55;
     Object term57;

    public BrentSolver_solve_7497420387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term35, term35.getClass(), "absoluteAccuracy", 0.7332741045694002);
        setDoubleField(term35, term35.getClass(), "relativeAccuracy", 0.4569171842750229);
        setDoubleField(term35, term35.getClass(), "functionValueAccuracy", 0.8598297828918529);
        setIntField(term35, term35.getClass(), "maximalIterationCount", -1955890973);
        setDoubleField(term35, term35.getClass(), "defaultAbsoluteAccuracy", 0.43692187681405226);
        setDoubleField(term35, term35.getClass(), "defaultRelativeAccuracy", 0.7633268466829064);
        setDoubleField(term35, term35.getClass(), "defaultFunctionValueAccuracy", 0.13481025392611334);
        setIntField(term35, term35.getClass(), "defaultMaximalIterationCount", -2038273078);
        setBooleanField(term35, term35.getClass(), "resultComputed", false);
        setDoubleField(term35, term35.getClass(), "result", 0.3800088629986428);
        setIntField(term35, term35.getClass(), "iterationCount", 1227103734);
        setField(term35, term35.getClass(), "f", null);
        term47 = new Double(0.5840714198152577);
        term49 = new Double(0.7559240768573477);
        term51 = new Double(0.10667076642995188);
        term53 = new Double(0.11493000848982304);
        term55 = new Double(0.37161417339133307);
        term57 = new Double(0.6805867182029153);
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
        args[0] = term47;
        args[1] = term49;
        args[2] = term51;
        args[3] = term53;
        args[4] = term55;
        args[5] = term57;
        try {
            callMethod(klass, "solve", argTypes, term35, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


