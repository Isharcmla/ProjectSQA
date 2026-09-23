package org.apache.commons.math3.optimization.linear;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_dropPhase1Objective_1115270978175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91046;

    public SimplexTableau_dropPhase1Objective_1115270978175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91046 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term91156 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setIntField(term91046, term91046.getClass(), "numArtificialVariables", 2);
        setIntField(term91046, term91046.getClass(), "numDecisionVariables", 0);
        setIntField(term91046, term91046.getClass(), "numSlackVariables", 0);
        setField(term91156, term91156.getClass(), "data", null);
        setField(term91046, term91046.getClass(), "tableau", term91156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "dropPhase1Objective", argTypes, term91046, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


