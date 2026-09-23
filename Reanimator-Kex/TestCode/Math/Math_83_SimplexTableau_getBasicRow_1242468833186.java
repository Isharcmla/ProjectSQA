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

public class SimplexTableau_getBasicRow_1242468833186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108921;
     Object term111539;

    public SimplexTableau_getBasicRow_1242468833186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108921 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term109019 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term108921, term108921.getClass(), "numArtificialVariables", 1);
        setField(term108921, term108921.getClass(), "tableau", term109019);
        term111539 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term111540 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term111539, term111539.getClass(), "f", null);
        setField(term111539, term111539.getClass(), "constraints", null);
        setBooleanField(term111539, term111539.getClass(), "restrictToNonNegative", false);
        setField(term111540, term111540.getClass(), "blocks", null);
        setIntField(term111540, term111540.getClass(), "rows", 0);
        setIntField(term111540, term111540.getClass(), "columns", 0);
        setIntField(term111540, term111540.getClass(), "blockRows", 0);
        setIntField(term111540, term111540.getClass(), "blockColumns", 0);
        setField(term111540, term111540.getClass(), "lu", null);
        setField(term111539, term111539.getClass(), "tableau", term111540);
        setIntField(term111539, term111539.getClass(), "numDecisionVariables", 0);
        setIntField(term111539, term111539.getClass(), "numSlackVariables", 0);
        setIntField(term111539, term111539.getClass(), "numArtificialVariables", 1);
        setDoubleField(term111539, term111539.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term108921, args);
        assertTrue(recursiveEquals(term108921, term111539));
        assertTrue(recursiveEquals(retValue, null));
    }

};


