package org.apache.commons.math.analysis.solvers;

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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class BrentSolver_solve_108921612463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17737;
     Object term17841;

    public BrentSolver_solve_108921612463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17737 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term17737, term17737.getClass(), "maximalIterationCount", 1);
        setDoubleField(term17737, term17737.getClass(), "functionValueAccuracy", -5.1521179737118474E18);
        setDoubleField(term17737, term17737.getClass(), "relativeAccuracy", -2.2688906224223703E18);
        setDoubleField(term17737, term17737.getClass(), "absoluteAccuracy", 4.7555726455236219E18);
        term17841 = newInstance(Class.forName("org.apache.commons.math.analysis.BinaryFunction$7"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        Object[] args = new Object[7];
        args[0] = term17841;
        args[1] = 0.49985502660274467;
        args[2] = 0.0;
        args[3] = 4.399330124258995;
        args[4] = -1.12355820928896E307;
        args[5] = -5.7586096570152914E163;
        args[6] = Double.NaN;
        try {
            callMethod(klass, "solve", argTypes, term17737, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


