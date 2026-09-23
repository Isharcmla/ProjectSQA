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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;

public class BrentSolver_solve_108921612457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16355;
     Object term16385;

    public BrentSolver_solve_108921612457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16355 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term16355, term16355.getClass(), "maximalIterationCount", 1);
        setDoubleField(term16355, term16355.getClass(), "functionValueAccuracy", -2.11894362467781837E18);
        setDoubleField(term16355, term16355.getClass(), "relativeAccuracy", 9.2188684372284539E18);
        setDoubleField(term16355, term16355.getClass(), "absoluteAccuracy", 5.7674222193742961E18);
        term16385 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term16385, term16385.getClass(), "functionValueAccuracy", -2.11894362467781837E18);
        setDoubleField(term16385, term16385.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term16385, term16385.getClass(), "resultComputed", true);
        setDoubleField(term16385, term16385.getClass(), "result", -1.7875403776971136E78);
        setDoubleField(term16385, term16385.getClass(), "functionValue", 0.0);
        setField(term16385, term16385.getClass(), "f", null);
        setDoubleField(term16385, term16385.getClass(), "absoluteAccuracy", 5.7674222193742961E18);
        setDoubleField(term16385, term16385.getClass(), "relativeAccuracy", 9.2188684372284539E18);
        setIntField(term16385, term16385.getClass(), "maximalIterationCount", 1);
        setDoubleField(term16385, term16385.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term16385, term16385.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term16385, term16385.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term16385, term16385.getClass(), "iterationCount", 0);
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
        args[1] = -1.1579209613906254E77;
        args[2] = 1.593476542891603E-219;
        args[3] = -1.7875403776971136E78;
        args[4] = 7.840105733858422E41;
        args[5] = -1.396737242279208E78;
        args[6] = -8.563486156235922E45;
        Object retValue = callMethod(klass, "solve", argTypes, term16355, args);
        assertTrue(recursiveEquals(term16355, term16385));
        assertTrue(recursiveEquals(retValue, -1.7875403776971136E78));
    }

};


