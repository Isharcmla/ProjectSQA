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

public class SimplexSolver_solvePhase1_1518945579151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66517;
     Object term66639;

    public SimplexSolver_solvePhase1_1518945579151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66517 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term66639 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term66737 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term66639, term66639.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term66737, term66737.getClass(), "columns", 3);
        setIntField(term66737, term66737.getClass(), "blockColumns", 1);
        setField(term66639, term66639.getClass(), "tableau", term66737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term66639;
        callMethod(klass, "solvePhase1", argTypes, term66517, args);
    }

};


