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

public class BrentSolver_solve_108921612439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9559;
     Object term9589;

    public BrentSolver_solve_108921612439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9559 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term9559, term9559.getClass(), "maximalIterationCount", 1);
        setDoubleField(term9559, term9559.getClass(), "functionValueAccuracy", -2.11894362467781837E18);
        setDoubleField(term9559, term9559.getClass(), "relativeAccuracy", 9.2188684372284539E18);
        setDoubleField(term9559, term9559.getClass(), "absoluteAccuracy", 5.7674222193742961E18);
        term9589 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term9589, term9589.getClass(), "functionValueAccuracy", -2.11894362467781837E18);
        setDoubleField(term9589, term9589.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term9589, term9589.getClass(), "resultComputed", true);
        setDoubleField(term9589, term9589.getClass(), "result", -1.7875403776971136E78);
        setDoubleField(term9589, term9589.getClass(), "functionValue", 0.0);
        setField(term9589, term9589.getClass(), "f", null);
        setDoubleField(term9589, term9589.getClass(), "absoluteAccuracy", 5.7674222193742961E18);
        setDoubleField(term9589, term9589.getClass(), "relativeAccuracy", 9.2188684372284539E18);
        setIntField(term9589, term9589.getClass(), "maximalIterationCount", 1);
        setDoubleField(term9589, term9589.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term9589, term9589.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term9589, term9589.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term9589, term9589.getClass(), "iterationCount", 0);
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
        Object retValue = callMethod(klass, "solve", argTypes, term9559, args);
        assertTrue(recursiveEquals(term9559, term9589));
        assertTrue(recursiveEquals(retValue, -1.7875403776971136E78));
    }

};


