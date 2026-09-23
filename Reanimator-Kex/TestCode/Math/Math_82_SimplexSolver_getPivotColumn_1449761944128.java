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

public class SimplexSolver_getPivotColumn_1449761944128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59943;
     Object term60065;

    public SimplexSolver_getPivotColumn_1449761944128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59943 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term60065 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term60161 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term59801 = (Object[]) newArray("[D", 1);
        setIntField(term60065, term60065.getClass(), "numArtificialVariables", 0);
        setField(term60161, term60161.getClass(), "data", term59801);
        setField(term60065, term60065.getClass(), "tableau", term60161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term60065;
        callMethod(klass, "getPivotColumn", argTypes, term59943, args);
    }

};


