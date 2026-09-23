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

public class SimplexSolver_solvePhase1_1518945579100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48554;
     Object term48676;

    public SimplexSolver_solvePhase1_1518945579100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48554 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term48676 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term48784 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term48409 = (Object[]) newArray("[D", 498);
        setIntField(term48676, term48676.getClass(), "numArtificialVariables", 4194304);
        setField(term48784, term48784.getClass(), "data", term48409);
        setField(term48676, term48676.getClass(), "tableau", term48784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term48676;
        callMethod(klass, "solvePhase1", argTypes, term48554, args);
    }

};


