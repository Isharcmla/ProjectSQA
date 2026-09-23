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

public class SimplexSolver_isOptimal_142937146082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39849;
     Object term39971;

    public SimplexSolver_isOptimal_142937146082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39849 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term39971 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term40073 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term39971, term39971.getClass(), "numArtificialVariables", 0);
        setIntField(term40073, term40073.getClass(), "columnDimension", 3);
        setField(term39971, term39971.getClass(), "tableau", term40073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term39971;
        try {
            callMethod(klass, "isOptimal", argTypes, term39849, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


