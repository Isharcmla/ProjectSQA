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

public class SimplexSolver_solvePhase1_1518945579156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67740;
     Object term67862;

    public SimplexSolver_solvePhase1_1518945579156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67740 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term67862 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term67958 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term67595 = (Object[]) newArray("[D", 114);
        setIntField(term67862, term67862.getClass(), "numArtificialVariables", -2139095040);
        setField(term67958, term67958.getClass(), "data", term67595);
        setField(term67862, term67862.getClass(), "tableau", term67958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term67862;
        callMethod(klass, "solvePhase1", argTypes, term67740, args);
    }

};


