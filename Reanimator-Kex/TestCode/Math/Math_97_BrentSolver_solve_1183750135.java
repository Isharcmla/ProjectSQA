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

public class BrentSolver_solve_1183750135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term13;
     Object term15;
     Object term17;

    public BrentSolver_solve_1183750135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term1, term1.getClass(), "absoluteAccuracy", 0.13238746331190498);
        setDoubleField(term1, term1.getClass(), "relativeAccuracy", 0.3455959125047594);
        setDoubleField(term1, term1.getClass(), "functionValueAccuracy", 0.5523635872663106);
        setIntField(term1, term1.getClass(), "maximalIterationCount", 568599855);
        setDoubleField(term1, term1.getClass(), "defaultAbsoluteAccuracy", 0.544608645520025);
        setDoubleField(term1, term1.getClass(), "defaultRelativeAccuracy", 0.28570734989730284);
        setDoubleField(term1, term1.getClass(), "defaultFunctionValueAccuracy", 0.40176586625454525);
        setIntField(term1, term1.getClass(), "defaultMaximalIterationCount", 1162663216);
        setBooleanField(term1, term1.getClass(), "resultComputed", false);
        setDoubleField(term1, term1.getClass(), "result", 0.2641345529914265);
        setIntField(term1, term1.getClass(), "iterationCount", 1484323161);
        setField(term1, term1.getClass(), "f", null);
        term13 = new Double(0.36923381893433327);
        term15 = new Double(0.6076495596892013);
        term17 = new Double(0.37773193782763337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term13;
        args[1] = term15;
        args[2] = term17;
        try {
            callMethod(klass, "solve", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


