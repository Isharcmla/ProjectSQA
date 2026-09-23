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

public class SimplexTableau_getBasicRow_1242410243176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107260;
     Object term107382;

    public SimplexTableau_getBasicRow_1242410243176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107260 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term107358 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term107260, term107260.getClass(), "numArtificialVariables", 1);
        setField(term107260, term107260.getClass(), "tableau", term107358);
        term107382 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term107383 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term107382, term107382.getClass(), "f", null);
        setField(term107382, term107382.getClass(), "constraints", null);
        setBooleanField(term107382, term107382.getClass(), "restrictToNonNegative", false);
        setField(term107383, term107383.getClass(), "blocks", null);
        setIntField(term107383, term107383.getClass(), "rows", 0);
        setIntField(term107383, term107383.getClass(), "columns", 0);
        setIntField(term107383, term107383.getClass(), "blockRows", 0);
        setIntField(term107383, term107383.getClass(), "blockColumns", 0);
        setField(term107383, term107383.getClass(), "lu", null);
        setField(term107382, term107382.getClass(), "tableau", term107383);
        setIntField(term107382, term107382.getClass(), "numDecisionVariables", 0);
        setIntField(term107382, term107382.getClass(), "numSlackVariables", 0);
        setIntField(term107382, term107382.getClass(), "numArtificialVariables", 1);
        setDoubleField(term107382, term107382.getClass(), "epsilon", 0.0);
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
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term107260, args);
        assertTrue(recursiveEquals(term107260, term107382));
        assertTrue(recursiveEquals(retValue, null));
    }

};


