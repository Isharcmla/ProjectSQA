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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_dropPhase1Objective_1946040185185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101700;

    public SimplexTableau_dropPhase1Objective_1946040185185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101700 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term101808 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term101700, term101700.getClass(), "numArtificialVariables", 1);
        setIntField(term101700, term101700.getClass(), "numDecisionVariables", 1);
        setIntField(term101700, term101700.getClass(), "numSlackVariables", 0);
        setField(term101700, term101700.getClass(), "tableau", term101808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "dropPhase1Objective", argTypes, term101700, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


