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

public class SimplexTableau_getBasicRow_1242468833156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95045;
     Object term96086;

    public SimplexTableau_getBasicRow_1242468833156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95045 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term95141 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setIntField(term95045, term95045.getClass(), "numArtificialVariables", 1);
        setField(term95045, term95045.getClass(), "tableau", term95141);
        term96086 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term96087 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term96086, term96086.getClass(), "f", null);
        setField(term96086, term96086.getClass(), "constraints", null);
        setBooleanField(term96086, term96086.getClass(), "restrictToNonNegative", false);
        setField(term96087, term96087.getClass(), "data", null);
        setField(term96087, term96087.getClass(), "lu", null);
        setField(term96086, term96086.getClass(), "tableau", term96087);
        setIntField(term96086, term96086.getClass(), "numDecisionVariables", 0);
        setIntField(term96086, term96086.getClass(), "numSlackVariables", 0);
        setIntField(term96086, term96086.getClass(), "numArtificialVariables", 1);
        setDoubleField(term96086, term96086.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term95045, args);
        assertTrue(recursiveEquals(term95045, term96086));
        assertTrue(recursiveEquals(retValue, null));
    }

};


