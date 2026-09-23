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

public class SimplexSolver_solvePhase1_1518945579162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70830;
     Object term70952;

    public SimplexSolver_solvePhase1_1518945579162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70830 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term70952 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term71054 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term71162 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term70952, term70952.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term71054, term71054.getClass(), "columnDimension", 1);
        setIntField(term71054, term71054.getClass(), "rowDimension", 1);
        setField(term71054, term71054.getClass(), "entries", term71162);
        setField(term70952, term70952.getClass(), "tableau", term71054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term70952;
        callMethod(klass, "solvePhase1", argTypes, term70830, args);
    }

};


