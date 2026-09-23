package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexSolver_getPivotColumn_1449761944102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49309;
     Object term49431;

    public SimplexSolver_getPivotColumn_1449761944102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49309 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term49431 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term49533 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term49431, term49431.getClass(), "numArtificialVariables", 0);
        setIntField(term49533, term49533.getClass(), "columnDimension", 3);
        setField(term49431, term49431.getClass(), "tableau", term49533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term49431;
        callMethod(klass, "getPivotColumn", argTypes, term49309, args);
    }

};


