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

public class SimplexSolver_solvePhase1_1518945579108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53102;
     Object term53224;

    public SimplexSolver_solvePhase1_1518945579108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53102 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term53224 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term53326 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term53224, term53224.getClass(), "numArtificialVariables", 8192);
        setIntField(term53326, term53326.getClass(), "columnDimension", 3);
        setIntField(term53326, term53326.getClass(), "rowDimension", 1);
        setField(term53224, term53224.getClass(), "tableau", term53326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term53224;
        callMethod(klass, "solvePhase1", argTypes, term53102, args);
    }

};


