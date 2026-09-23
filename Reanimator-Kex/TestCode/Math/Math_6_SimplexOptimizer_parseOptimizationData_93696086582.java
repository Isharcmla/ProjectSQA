package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Object;

public class SimplexOptimizer_parseOptimizationData_93696086582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41854;
     Object term41585;
     Object term43543;
     Object term43544;

    public SimplexOptimizer_parseOptimizationData_93696086582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41854 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term41854, term41854.getClass(), "start", null);
        term41585 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term41990 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term42118 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        setElement(term41585, 0, term41990);
        setElement(term41585, 1, term42118);
        setElement(term41585, 2, term42118);
        setElement(term41585, 3, term42118);
        setElement(term41585, 4, term42118);
        setElement(term41585, 5, term42118);
        term43543 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term43543, term43543.getClass(), "simplex", null);
        setField(term43543, term43543.getClass(), "function", null);
        setField(term43543, term43543.getClass(), "goal", null);
        setField(term43543, term43543.getClass(), "start", null);
        setField(term43543, term43543.getClass(), "lowerBound", null);
        setField(term43543, term43543.getClass(), "upperBound", null);
        setField(term43543, term43543.getClass(), "evaluations", null);
        setField(term43543, term43543.getClass(), "iterations", null);
        setField(term43543, term43543.getClass(), "checker", null);
        term43544 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term43545 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term43546 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        setField(term43545, term43545.getClass(), "function", null);
        setElement(term43544, 0, term43545);
        setField(term43546, term43546.getClass(), "coefficients", null);
        setDoubleField(term43546, term43546.getClass(), "constantTerm", 0.0);
        setElement(term43544, 1, term43546);
        setElement(term43544, 2, term43546);
        setElement(term43544, 3, term43546);
        setElement(term43544, 4, term43546);
        setElement(term43544, 5, term43546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41585;
        callMethod(klass, "parseOptimizationData", argTypes, term41854, args);
        assertTrue(recursiveEquals(term41854, term43543));
        assertTrue(recursiveEquals(term41585, term43544));
    }

};


