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

public class SimplexSolver_solvePhase1_1518945579114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55785;
     Object term55907;

    public SimplexSolver_solvePhase1_1518945579114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55785 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term55907 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term56009 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term55907, term55907.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term56009, term56009.getClass(), "columnDimension", 2);
        setIntField(term56009, term56009.getClass(), "rowDimension", 1);
        setField(term55907, term55907.getClass(), "tableau", term56009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term55907;
        callMethod(klass, "solvePhase1", argTypes, term55785, args);
    }

};


