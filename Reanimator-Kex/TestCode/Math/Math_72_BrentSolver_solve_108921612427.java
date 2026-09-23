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

public class BrentSolver_solve_108921612427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6176;

    public BrentSolver_solve_108921612427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6176 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term6176, term6176.getClass(), "maximalIterationCount", 1);
        setDoubleField(term6176, term6176.getClass(), "functionValueAccuracy", -1.00753902386589658E18);
        setDoubleField(term6176, term6176.getClass(), "relativeAccuracy", 4.6859965127401298E18);
        setDoubleField(term6176, term6176.getClass(), "absoluteAccuracy", 1.89010996617016512E17);
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
        args[0] = null;
        args[1] = -4.8168348489088503E-296;
        args[2] = 5.503284189324283E-135;
        args[3] = -2.115129659212249E-308;
        args[4] = -2.4892784430528593E-173;
        args[5] = 3.647765043911784E156;
        args[6] = -3.0391848106615207;
        try {
            callMethod(klass, "solve", argTypes, term6176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


