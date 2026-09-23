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

public class SimplexOptimizer_parseOptimizationData_936960865127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97543;
     Object term96932;
     Object term98423;
     Object term98425;

    public SimplexOptimizer_parseOptimizationData_936960865127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97543 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term97631 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setIntField(term97631, term97631.getClass(), "maximalCount", 0);
        setField(term97543, term97543.getClass(), "evaluations", term97631);
        term96932 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 41);
        Object term97713 = newInstance(Class.forName("org.apache.commons.math3.optim.MaxEval"));
        setIntField(term97713, term97713.getClass(), "maxEval", 0);
        setElement(term96932, 0, term97713);
        setElement(term96932, 1, term97713);
        setElement(term96932, 2, term97713);
        setElement(term96932, 3, term97713);
        setElement(term96932, 4, term97713);
        setElement(term96932, 5, term97713);
        setElement(term96932, 6, term97713);
        setElement(term96932, 7, term97713);
        setElement(term96932, 8, term97713);
        setElement(term96932, 9, term97713);
        setElement(term96932, 10, term97713);
        setElement(term96932, 11, term97713);
        setElement(term96932, 12, term97713);
        setElement(term96932, 13, term97713);
        setElement(term96932, 14, term97713);
        setElement(term96932, 15, term97713);
        setElement(term96932, 16, term97713);
        setElement(term96932, 17, term97713);
        setElement(term96932, 18, term97713);
        setElement(term96932, 19, term97713);
        setElement(term96932, 20, term97713);
        setElement(term96932, 21, term97713);
        setElement(term96932, 22, term97713);
        setElement(term96932, 23, term97713);
        setElement(term96932, 24, term97713);
        setElement(term96932, 25, term97713);
        setElement(term96932, 26, term97713);
        setElement(term96932, 27, term97713);
        setElement(term96932, 28, term97713);
        setElement(term96932, 29, term97713);
        setElement(term96932, 30, term97713);
        setElement(term96932, 31, term97713);
        setElement(term96932, 32, term97713);
        setElement(term96932, 33, term97713);
        setElement(term96932, 34, term97713);
        setElement(term96932, 35, term97713);
        setElement(term96932, 36, term97713);
        setElement(term96932, 37, term97713);
        setElement(term96932, 38, term97713);
        setElement(term96932, 39, term97713);
        setElement(term96932, 40, term97713);
        term98423 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term98424 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term98423, term98423.getClass(), "simplex", null);
        setField(term98423, term98423.getClass(), "function", null);
        setField(term98423, term98423.getClass(), "goal", null);
        setField(term98423, term98423.getClass(), "start", null);
        setField(term98423, term98423.getClass(), "lowerBound", null);
        setField(term98423, term98423.getClass(), "upperBound", null);
        setIntField(term98424, term98424.getClass(), "maximalCount", 0);
        setIntField(term98424, term98424.getClass(), "count", 0);
        setField(term98424, term98424.getClass(), "maxCountCallback", null);
        setField(term98423, term98423.getClass(), "evaluations", term98424);
        setField(term98423, term98423.getClass(), "iterations", null);
        setField(term98423, term98423.getClass(), "checker", null);
        term98425 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 41);
        Object term98426 = newInstance(Class.forName("org.apache.commons.math3.optim.MaxEval"));
        setIntField(term98426, term98426.getClass(), "maxEval", 0);
        setElement(term98425, 0, term98426);
        setElement(term98425, 1, term98426);
        setElement(term98425, 2, term98426);
        setElement(term98425, 3, term98426);
        setElement(term98425, 4, term98426);
        setElement(term98425, 5, term98426);
        setElement(term98425, 6, term98426);
        setElement(term98425, 7, term98426);
        setElement(term98425, 8, term98426);
        setElement(term98425, 9, term98426);
        setElement(term98425, 10, term98426);
        setElement(term98425, 11, term98426);
        setElement(term98425, 12, term98426);
        setElement(term98425, 13, term98426);
        setElement(term98425, 14, term98426);
        setElement(term98425, 15, term98426);
        setElement(term98425, 16, term98426);
        setElement(term98425, 17, term98426);
        setElement(term98425, 18, term98426);
        setElement(term98425, 19, term98426);
        setElement(term98425, 20, term98426);
        setElement(term98425, 21, term98426);
        setElement(term98425, 22, term98426);
        setElement(term98425, 23, term98426);
        setElement(term98425, 24, term98426);
        setElement(term98425, 25, term98426);
        setElement(term98425, 26, term98426);
        setElement(term98425, 27, term98426);
        setElement(term98425, 28, term98426);
        setElement(term98425, 29, term98426);
        setElement(term98425, 30, term98426);
        setElement(term98425, 31, term98426);
        setElement(term98425, 32, term98426);
        setElement(term98425, 33, term98426);
        setElement(term98425, 34, term98426);
        setElement(term98425, 35, term98426);
        setElement(term98425, 36, term98426);
        setElement(term98425, 37, term98426);
        setElement(term98425, 38, term98426);
        setElement(term98425, 39, term98426);
        setElement(term98425, 40, term98426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term96932;
        callMethod(klass, "parseOptimizationData", argTypes, term97543, args);
        assertTrue(recursiveEquals(term97543, term98423));
        assertTrue(recursiveEquals(term96932, term98425));
    }

};


