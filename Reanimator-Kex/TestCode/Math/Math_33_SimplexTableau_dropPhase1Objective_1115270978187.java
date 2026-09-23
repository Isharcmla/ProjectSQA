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
import org.apache.commons.math3.exception.OutOfRangeException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_dropPhase1Objective_1115270978187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97330;

    public SimplexTableau_dropPhase1Objective_1115270978187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97330 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term97440 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term97142 = (Object[]) newArray("[D", 42);
        double[] term97143 = (double[]) newDoubleArray(0);
        setIntField(term97330, term97330.getClass(), "numArtificialVariables", 1);
        setIntField(term97330, term97330.getClass(), "numDecisionVariables", 0);
        setIntField(term97330, term97330.getClass(), "numSlackVariables", 0);
        setElement(term97142, 0, term97143);
        setElement(term97142, 1, term97143);
        setElement(term97142, 2, term97143);
        setElement(term97142, 3, term97143);
        setElement(term97142, 4, term97143);
        setElement(term97142, 5, term97143);
        setElement(term97142, 6, term97143);
        setElement(term97142, 7, term97143);
        setElement(term97142, 8, term97143);
        setElement(term97142, 9, term97143);
        setElement(term97142, 10, term97143);
        setElement(term97142, 11, term97143);
        setElement(term97142, 12, term97143);
        setElement(term97142, 13, term97143);
        setElement(term97142, 14, term97143);
        setElement(term97142, 15, term97143);
        setElement(term97142, 16, term97143);
        setElement(term97142, 17, term97143);
        setElement(term97142, 18, term97143);
        setElement(term97142, 19, term97143);
        setElement(term97142, 20, term97143);
        setElement(term97142, 21, term97143);
        setElement(term97142, 22, term97143);
        setElement(term97142, 23, term97143);
        setElement(term97142, 24, term97143);
        setElement(term97142, 25, term97143);
        setElement(term97142, 26, term97143);
        setElement(term97142, 27, term97143);
        setElement(term97142, 28, term97143);
        setElement(term97142, 29, term97143);
        setElement(term97142, 30, term97143);
        setElement(term97142, 31, term97143);
        setElement(term97142, 32, term97143);
        setElement(term97142, 33, term97143);
        setElement(term97142, 34, term97143);
        setElement(term97142, 35, term97143);
        setElement(term97142, 36, term97143);
        setElement(term97142, 37, term97143);
        setElement(term97142, 38, term97143);
        setElement(term97142, 39, term97143);
        setElement(term97142, 40, term97143);
        setElement(term97142, 41, term97143);
        setField(term97440, term97440.getClass(), "data", term97142);
        setField(term97330, term97330.getClass(), "tableau", term97440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "dropPhase1Objective", argTypes, term97330, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


