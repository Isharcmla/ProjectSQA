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

public class SimplexTableau_getBasicRowForSolution_1028492829192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113834;

    public SimplexTableau_getBasicRowForSolution_1028492829192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113834 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term113936 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term113834, term113834.getClass(), "numArtificialVariables", 1);
        setIntField(term113936, term113936.getClass(), "rowDimension", 3);
        setField(term113834, term113834.getClass(), "tableau", term113936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "getBasicRowForSolution", argTypes, term113834, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


