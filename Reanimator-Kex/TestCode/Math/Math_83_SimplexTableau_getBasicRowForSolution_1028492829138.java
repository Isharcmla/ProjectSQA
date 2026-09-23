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
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexTableau_getBasicRowForSolution_1028492829138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89662;
     Object term89787;

    public SimplexTableau_getBasicRowForSolution_1028492829138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89662 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term89770 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term89662, term89662.getClass(), "numArtificialVariables", 0);
        setField(term89662, term89662.getClass(), "tableau", term89770);
        term89787 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term89788 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term89787, term89787.getClass(), "f", null);
        setField(term89787, term89787.getClass(), "constraints", null);
        setBooleanField(term89787, term89787.getClass(), "restrictToNonNegative", false);
        setField(term89788, term89788.getClass(), "data", null);
        setField(term89788, term89788.getClass(), "lu", null);
        setField(term89787, term89787.getClass(), "tableau", term89788);
        setIntField(term89787, term89787.getClass(), "numDecisionVariables", 0);
        setIntField(term89787, term89787.getClass(), "numSlackVariables", 0);
        setIntField(term89787, term89787.getClass(), "numArtificialVariables", 0);
        setDoubleField(term89787, term89787.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRowForSolution", argTypes, term89662, args);
        assertTrue(recursiveEquals(term89662, term89787));
        assertTrue(recursiveEquals(retValue, null));
    }

};


