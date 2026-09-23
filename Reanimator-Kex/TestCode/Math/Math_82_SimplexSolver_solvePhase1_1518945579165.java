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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexSolver_solvePhase1_1518945579165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68171;
     Object term68293;

    public SimplexSolver_solvePhase1_1518945579165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68171 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term68293 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term68395 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term68293, term68293.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term68395, term68395.getClass(), "columnDimension", -2147483648);
        setIntField(term68395, term68395.getClass(), "rowDimension", 1);
        setField(term68293, term68293.getClass(), "tableau", term68395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term68293;
        try {
            callMethod(klass, "solvePhase1", argTypes, term68171, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


