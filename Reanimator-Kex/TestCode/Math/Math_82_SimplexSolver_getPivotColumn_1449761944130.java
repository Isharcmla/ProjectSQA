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

public class SimplexSolver_getPivotColumn_1449761944130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60673;
     Object term60795;

    public SimplexSolver_getPivotColumn_1449761944130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60673 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term60795 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term60897 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term60795, term60795.getClass(), "numArtificialVariables", 1);
        setIntField(term60897, term60897.getClass(), "columnDimension", 4);
        setIntField(term60897, term60897.getClass(), "rowDimension", 1);
        setField(term60795, term60795.getClass(), "tableau", term60897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term60795;
        callMethod(klass, "getPivotColumn", argTypes, term60673, args);
    }

};


