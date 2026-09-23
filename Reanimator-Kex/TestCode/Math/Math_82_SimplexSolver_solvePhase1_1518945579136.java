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

public class SimplexSolver_solvePhase1_1518945579136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64113;
     Object term64235;

    public SimplexSolver_solvePhase1_1518945579136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64113 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term64235 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term64331 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setIntField(term64235, term64235.getClass(), "numArtificialVariables", -2147483648);
        setField(term64235, term64235.getClass(), "tableau", term64331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term64235;
        callMethod(klass, "solvePhase1", argTypes, term64113, args);
    }

};


