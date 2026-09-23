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

public class SimplexSolver_doIteration_51255937499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48184;
     Object term48306;

    public SimplexSolver_doIteration_51255937499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48184 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term48184, term48184.getClass(), "iterations", 2147483646);
        setIntField(term48184, term48184.getClass(), "maxIterations", 2147483647);
        term48306 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term48404 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term48014 = (Object[]) newArray("[D", 1);
        setIntField(term48306, term48306.getClass(), "numArtificialVariables", 1);
        setIntField(term48404, term48404.getClass(), "columns", 4);
        setIntField(term48404, term48404.getClass(), "blockColumns", 1);
        setField(term48404, term48404.getClass(), "blocks", term48014);
        setField(term48306, term48306.getClass(), "tableau", term48404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term48306;
        callMethod(klass, "doIteration", argTypes, term48184, args);
    }

};


