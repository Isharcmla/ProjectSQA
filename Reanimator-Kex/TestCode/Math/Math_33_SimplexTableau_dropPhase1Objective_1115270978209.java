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

public class SimplexTableau_dropPhase1Objective_1115270978209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124410;

    public SimplexTableau_dropPhase1Objective_1115270978209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124410 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term124520 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setIntField(term124410, term124410.getClass(), "numArtificialVariables", 3);
        setIntField(term124410, term124410.getClass(), "numDecisionVariables", 0);
        setIntField(term124410, term124410.getClass(), "numSlackVariables", 0);
        setField(term124520, term124520.getClass(), "data", null);
        setField(term124410, term124410.getClass(), "tableau", term124520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "dropPhase1Objective", argTypes, term124410, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


