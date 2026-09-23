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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.EqualityUtils.*;
import java.lang.Object;

public class BrentSolver_solve_74974203859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11836;
     Object term11966;

    public BrentSolver_solve_74974203859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11836 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term11936 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        setIntField(term11836, term11836.getClass(), "maximalIterationCount", 1);
        setDoubleField(term11836, term11836.getClass(), "functionValueAccuracy", -9.2232224503713126E18);
        setDoubleField(term11836, term11836.getClass(), "relativeAccuracy", -9.2095490550461194E18);
        setDoubleField(term11836, term11836.getClass(), "absoluteAccuracy", 4.503612560244864E15);
        setField(term11836, term11836.getClass(), "f", term11936);
        term11966 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term11967 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        setDoubleField(term11966, term11966.getClass(), "absoluteAccuracy", 4.503612560244864E15);
        setDoubleField(term11966, term11966.getClass(), "relativeAccuracy", -9.2095490550461194E18);
        setDoubleField(term11966, term11966.getClass(), "functionValueAccuracy", -9.2232224503713126E18);
        setIntField(term11966, term11966.getClass(), "maximalIterationCount", 1);
        setDoubleField(term11966, term11966.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term11966, term11966.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term11966, term11966.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term11966, term11966.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term11966, term11966.getClass(), "resultComputed", true);
        setDoubleField(term11966, term11966.getClass(), "result", -1.2123249693414238E-298);
        setIntField(term11966, term11966.getClass(), "iterationCount", 0);
        setField(term11967, term11967.getClass(), "val$interpolator", null);
        setField(term11967, term11967.getClass(), "this$0", null);
        setField(term11966, term11966.getClass(), "f", term11967);
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
        args[0] = -1.2207949940644815E-296;
        args[1] = -1.119080709402069E-308;
        args[2] = -1.2123249693414238E-298;
        args[3] = -1.1495016741527735E-308;
        args[4] = 4.207730934432622E-308;
        args[5] = -1.2393288811717208E-201;
        Object retValue = callMethod(klass, "solve", argTypes, term11836, args);
        assertTrue(recursiveEquals(term11836, term11966));
        assertTrue(recursiveEquals(retValue, -1.2123249693414238E-298));
    }

};


