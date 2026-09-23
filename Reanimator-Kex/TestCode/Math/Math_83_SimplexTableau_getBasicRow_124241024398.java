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

public class SimplexTableau_getBasicRow_124241024398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78351;
     Object term78476;

    public SimplexTableau_getBasicRow_124241024398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78351 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term78459 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term78351, term78351.getClass(), "numArtificialVariables", 0);
        setField(term78351, term78351.getClass(), "tableau", term78459);
        term78476 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term78477 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term78476, term78476.getClass(), "f", null);
        setField(term78476, term78476.getClass(), "constraints", null);
        setBooleanField(term78476, term78476.getClass(), "restrictToNonNegative", false);
        setField(term78477, term78477.getClass(), "data", null);
        setField(term78477, term78477.getClass(), "lu", null);
        setField(term78476, term78476.getClass(), "tableau", term78477);
        setIntField(term78476, term78476.getClass(), "numDecisionVariables", 0);
        setIntField(term78476, term78476.getClass(), "numSlackVariables", 0);
        setIntField(term78476, term78476.getClass(), "numArtificialVariables", 0);
        setDoubleField(term78476, term78476.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = false;
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term78351, args);
        assertTrue(recursiveEquals(term78351, term78476));
        assertTrue(recursiveEquals(retValue, null));
    }

};


