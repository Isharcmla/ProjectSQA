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

public class SimplexSolver_solvePhase1_151894557996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47105;
     Object term47227;

    public SimplexSolver_solvePhase1_151894557996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47105 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term47227 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term47323 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term46960 = (Object[]) newArray("[D", 498);
        setIntField(term47227, term47227.getClass(), "numArtificialVariables", 4194304);
        setField(term47323, term47323.getClass(), "data", term46960);
        setField(term47227, term47227.getClass(), "tableau", term47323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term47227;
        callMethod(klass, "solvePhase1", argTypes, term47105, args);
    }

};


