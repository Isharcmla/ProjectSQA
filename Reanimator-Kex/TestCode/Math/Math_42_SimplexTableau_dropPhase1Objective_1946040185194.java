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

public class SimplexTableau_dropPhase1Objective_1946040185194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104037;

    public SimplexTableau_dropPhase1Objective_1946040185194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104037 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term104145 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term103851 = (Object[]) newArray("[D", 42);
        double[] term103852 = (double[]) newDoubleArray(0);
        setIntField(term104037, term104037.getClass(), "numArtificialVariables", 1);
        setIntField(term104037, term104037.getClass(), "numDecisionVariables", 0);
        setIntField(term104037, term104037.getClass(), "numSlackVariables", 0);
        setElement(term103851, 0, term103852);
        setElement(term103851, 1, term103852);
        setElement(term103851, 2, term103852);
        setElement(term103851, 3, term103852);
        setElement(term103851, 4, term103852);
        setElement(term103851, 5, term103852);
        setElement(term103851, 6, term103852);
        setElement(term103851, 7, term103852);
        setElement(term103851, 8, term103852);
        setElement(term103851, 9, term103852);
        setElement(term103851, 10, term103852);
        setElement(term103851, 11, term103852);
        setElement(term103851, 12, term103852);
        setElement(term103851, 13, term103852);
        setElement(term103851, 14, term103852);
        setElement(term103851, 15, term103852);
        setElement(term103851, 16, term103852);
        setElement(term103851, 17, term103852);
        setElement(term103851, 18, term103852);
        setElement(term103851, 19, term103852);
        setElement(term103851, 20, term103852);
        setElement(term103851, 21, term103852);
        setElement(term103851, 22, term103852);
        setElement(term103851, 23, term103852);
        setElement(term103851, 24, term103852);
        setElement(term103851, 25, term103852);
        setElement(term103851, 26, term103852);
        setElement(term103851, 27, term103852);
        setElement(term103851, 28, term103852);
        setElement(term103851, 29, term103852);
        setElement(term103851, 30, term103852);
        setElement(term103851, 31, term103852);
        setElement(term103851, 32, term103852);
        setElement(term103851, 33, term103852);
        setElement(term103851, 34, term103852);
        setElement(term103851, 35, term103852);
        setElement(term103851, 36, term103852);
        setElement(term103851, 37, term103852);
        setElement(term103851, 38, term103852);
        setElement(term103851, 39, term103852);
        setElement(term103851, 40, term103852);
        setElement(term103851, 41, term103852);
        setField(term104145, term104145.getClass(), "data", term103851);
        setField(term104037, term104037.getClass(), "tableau", term104145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "dropPhase1Objective", argTypes, term104037, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


