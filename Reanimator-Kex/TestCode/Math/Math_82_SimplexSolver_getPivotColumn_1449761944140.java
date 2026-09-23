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
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexSolver_getPivotColumn_1449761944140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63254;
     Object term63376;

    public SimplexSolver_getPivotColumn_1449761944140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63254 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term63376 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term63472 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setIntField(term63376, term63376.getClass(), "numArtificialVariables", 1);
        setField(term63376, term63376.getClass(), "tableau", term63472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term63376;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term63254, args);
        assertTrue(recursiveEquals(term63376, (short) 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


