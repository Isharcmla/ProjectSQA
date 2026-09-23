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

public class SimplexSolver_isPhase1Solved_369876463113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55405;
     Object term55527;

    public SimplexSolver_isPhase1Solved_369876463113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55405 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term55527 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term55625 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term55527, term55527.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term55625, term55625.getClass(), "columns", 3);
        setField(term55527, term55527.getClass(), "tableau", term55625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term55527;
        callMethod(klass, "isPhase1Solved", argTypes, term55405, args);
    }

};


